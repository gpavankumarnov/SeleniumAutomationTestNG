package unReleasePlanpage_tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;
import unRelease.Intakepage;
import unRelease.RMIL3page;
import unRelease_planpage.Impactapp_l3page;
import unRelease_planpage.Planpage;
import unRelease_planpage.Pre_deploymentpage;

public class predeploymentpage_test extends Baseclass{

	
	
	utility util;
	Loginpage logging;
	Homepage homepage;
	Intakepage intake;
	Planpage plan;
	RMIL3page rmil3;
	Impactapp_l3page impactl3;
	Pre_deploymentpage predeploy;
	
	
	public predeploymentpage_test() {
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
		rmil3 = new RMIL3page();
		predeploy = new Pre_deploymentpage();
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();
		Thread.sleep(6000);
		util.dateselector();
		intake.planpageclick();	
		Thread.sleep(1000);
		util.dateclickcontinuous();
		plan.predeployclick();
	}
	
	
	@Test(priority=1)
	public void verifyImpactapp_l3page() throws InterruptedException {
         
		predeploy.predeploy_searchfield();	
		util.downloadclick();
		util.searchfieldxclick();
		predeploy.predeploy_dataedit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
