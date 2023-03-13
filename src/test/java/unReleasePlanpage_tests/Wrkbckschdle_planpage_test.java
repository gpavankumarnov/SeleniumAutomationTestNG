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
import unRelease_planpage.Workbackschedule_planpage;
import unRelease_planpage.Wrkbackschedule_Eventdetailpage;

public class Wrkbckschdle_planpage_test  extends Baseclass {
	
	utility util;
	Loginpage logging;
	Homepage homepage;
	Intakepage intake;
	Planpage plan;
	
	Workbackschedule_planpage wrkbcksdule;
	
	
	public Wrkbckschdle_planpage_test() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Initialisation();
		logging = new Loginpage();
		util = new utility();
		intake = new Intakepage();
		plan = new Planpage();
		wrkbcksdule = new Workbackschedule_planpage();
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();
		Thread.sleep(6000);
		util.dateselector();
		intake.planpageclick();	
		
		plan.Workbackscheduleviewclick();
		
	}
		
	
	@Test(priority=1)
	public void Verifywrkbckscdlepageelements() throws InterruptedException {
		wrkbcksdule.datechnge();
		
		wrkbcksdule.menuclick();
		//wrkbcksdule.edit_delete_copyclick();
		plan = wrkbcksdule.wrkbackschedulenavigateback();
	}
		
		
		
		
		
		
		
		
		
		
		

}
