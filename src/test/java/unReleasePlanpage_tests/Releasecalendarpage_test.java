package unReleasePlanpage_tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;
import unRelease.Intakepage;
import unRelease_planpage.Impactapp_l3page;
import unRelease_planpage.Planpage;
import unRelease_planpage.Releasecalendarpage;

public class Releasecalendarpage_test extends Baseclass {

	
	utility util;
	Loginpage logging;
	Homepage homepage;
	Intakepage intake;
	Planpage plan;
	Impactapp_l3page impactl3;
	Releasecalendarpage calendar;
	
	
	public Releasecalendarpage_test() {
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
		calendar = new Releasecalendarpage();
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();
		Thread.sleep(6000);
		util.dateselector();
		intake.planpageclick();	
		plan.viewreleasecalender();
	}
	
	
	@Test(priority=1)
	public void verifydrag_dropofrelease() throws InterruptedException {

		calendar.drag_dropreleases();
			
	}
	
	
	@Test(priority=2)
	public void verifydatepick_calendar() throws InterruptedException {

		calendar.forwarddatepick_function();
		calendar.previousdatepick_function();
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
