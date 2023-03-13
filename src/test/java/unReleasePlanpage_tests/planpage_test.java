package unReleasePlanpage_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;
import unRelease.Intakepage;
import unRelease.RMIL3page;
import unRelease_planpage.Planpage;
import unRelease_planpage.Pro_l3page;

public class planpage_test extends Baseclass{

	utility util;
	Loginpage logging;
	Homepage homepage;
	Intakepage intake;
	Planpage plan;
	RMIL3page rmil3;
	
	public planpage_test() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Initialisation();
		logging = new Loginpage();
		util = new utility();
		plan = new Planpage();
		intake = new Intakepage();
		rmil3 = new RMIL3page();
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();
		Thread.sleep(4000);
		util.dateselector();
				
	}
	
	
	//@Test(priority=2)
	public void verifyprojectdb() throws InterruptedException {
		intake.planpageclick();
	   plan.projectmbclick();
	}
	
	
	
	//@Test(priority=1)
	public void verifydatechange_planpage() throws InterruptedException {
		Thread.sleep(1000);
		intake.planpageclick();
		plan.datechnge();
		plan.predeployclick();
	}
	
	@Test(priority=1)
	public void verifybasermiclick() throws InterruptedException {
		Thread.sleep(1000);
		intake.planpageclick();
		plan.Basermiclick();
		rmil3.scrlluntilbasermi();
		rmil3.basermisearchfield();
		rmil3.downloadrmidata();
		rmil3.rmidataedit();
	}
	
	
	//@Test(priority=2)
		public void verifyviewreleasecalendar() throws InterruptedException {
			
		   plan.viewreleasecalender();
		}
	
	
	
	
	//@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
}
