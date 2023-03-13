package unReleasePlanpage_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;
import unRelease.Intakepage;
import unRelease_planpage.Impactapp_l3page;
import unRelease_planpage.Planpage;

public class Impactapp_l3page_test extends Baseclass {
	
	
	utility util;
	Loginpage logging;
	Homepage homepage;
	Intakepage intake;
	Planpage plan;
	Impactapp_l3page impactl3;
	
	
	
	public Impactapp_l3page_test() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Initialisation();
		logging = new Loginpage();
		util = new utility();
		intake = new Intakepage();
		plan = new Planpage();
		impactl3 = new Impactapp_l3page();
		
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();
		Thread.sleep(6000);
		util.dateselector();
		intake.planpageclick();	
		plan.impactedappclick();
	}
	
	
	@Test(priority=1)
	public void verifyImpactapp_l3page() throws InterruptedException {

		impactl3.impact_l3searchfield();
			
	}


	
	@Test(priority=2)
	public void verifyImpactapp_l3dropdown() throws InterruptedException {
		
		
		impactl3.Impactapp_l3dataedit();
		
		}
	
	@Test(priority=3)
	public void verifyImpactapp_l3checkbox() throws InterruptedException {
		
		impactl3.impactapp_l3checkboxselect();
		impactl3.navigateback();
	}
	
	
	
	


	//@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}

	
}
