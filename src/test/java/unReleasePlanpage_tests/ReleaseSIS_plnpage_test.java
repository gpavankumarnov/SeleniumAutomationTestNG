package unReleasePlanpage_tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;
import unRelease.Intakepage;
import unRelease_planpage.Planpage;
import unRelease_planpage.ReleaseSIS_planpage;

public class ReleaseSIS_plnpage_test extends Baseclass{

	utility util;
	Loginpage logging;
	Homepage homepage;
	Intakepage intake;
	Planpage plan;
	ReleaseSIS_planpage releaseSIS;
	
	public ReleaseSIS_plnpage_test() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		Initialisation();
		util = new utility();
		logging = new Loginpage();
		homepage=new Homepage();
		intake = new Intakepage();
		plan = new Planpage();
		releaseSIS = new ReleaseSIS_planpage();
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();
		util.dateselector();
		intake.planpageclick();
		releaseSIS.datechnge();
		plan.ReleaseSISviewclick();
		
	}
	
	
	@Test(priority=1)
	public void Verifyreleasetask() throws InterruptedException {
		
      releaseSIS.datechnge();
      releaseSIS.menuoption();
	}
	
	
	
	
	
	
}
