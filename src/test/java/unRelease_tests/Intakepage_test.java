package unRelease_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;
import unRelease.Intakepage;
import unRelease.ProjectIDdetailspage;
import unRelease.RMIL3page;

public class Intakepage_test extends Baseclass {
	
	Loginpage logging;
	Homepage homepage;
	Intakepage intake;
	utility util;
	
	public Intakepage_test() {
		super();
	
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Initialisation();
		logging = new Loginpage();
		homepage = new Homepage();
		intake = new Intakepage();
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();		
	}
	
	
	@Test(priority=1)
	public void verifydatepicktest() throws InterruptedException {
		
		intake.datepick();
           
	}
	
	
		
	@Test(priority=2)
	public void verifysubmittedRMIclicktest() throws InterruptedException {
		intake.submittedrmiclick();
	}
	
	@Test(priority=3)
	public void verifyplanpageshifttest() throws InterruptedException {
		intake.planpageclick();
	}

	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

	
}
