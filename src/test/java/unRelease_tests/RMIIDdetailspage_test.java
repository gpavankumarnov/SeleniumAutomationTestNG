package unRelease_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;
import unRelease.Intakepage;
import unRelease.RMIIDdetailspage;
import unRelease.RMIL3page;

public class RMIIDdetailspage_test extends Baseclass{


	utility util;
	Loginpage logging;
	Homepage homepage;
	RMIL3page rmil3;
	Intakepage intake;
	RMIIDdetailspage rmiid;
	
	public RMIIDdetailspage_test() {
		super();
	
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Initialisation();
		logging = new Loginpage();
		rmil3 = new RMIL3page();
		intake = new Intakepage();
		util = new utility();
		rmiid = new RMIIDdetailspage();
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();
		intake.datepick();
		intake.submittedrmiclick();
		rmil3.rmiidclick();
	}
	
	
	@Test(priority=1)
	public void verifyPOCLlogmessage_test() throws InterruptedException {
		rmiid.POCLmessagefield();
		Thread.sleep(2000);
		rmiid.POCLmultiplebtnclick();
		rmiid.rmiidnavigateback();
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
