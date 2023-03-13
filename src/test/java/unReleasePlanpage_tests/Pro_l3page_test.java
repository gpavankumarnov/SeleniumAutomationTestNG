package unReleasePlanpage_tests;

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
import unRelease_planpage.Planpage;
import unRelease_planpage.Pro_l3page;

public class Pro_l3page_test extends Baseclass {

	utility util;
	Loginpage logging;
	Homepage homepage;
	Intakepage intake;
	Planpage plan;
	Pro_l3page prol3;
	
	public Pro_l3page_test() {
		super();
	
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Initialisation();
		util = new utility();
		prol3 = new Pro_l3page();
        intake = new Intakepage();
        plan = new Planpage();
		logging = new Loginpage();
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();
		intake.datepick();
		intake.planpageclick();
				
	}
	
	@Test(priority=1)
	public void verifyprosearchfieldtest() throws InterruptedException {
		plan.projectmbclick();
		Thread.sleep(3000);
		util.l3searchfield(prop.getProperty("prosearchfield"));
		util.searchfieldxclick();
		util.downloadclick();
		util.datepick();
		Thread.sleep(2000);
		util.scrolldownmethod();
		Thread.sleep(1000);
		util.scrollupmethod();
		util.filterclick();
		util.filterdropdown();
		util.removefilterX();
	}
	
	@Test(priority=2)
	public void verifypro_l3pagedate_test() throws InterruptedException {
		plan.projectmbclick();
		Thread.sleep(3000);
		util.scrolldownmethod();
		Thread.sleep(5000);
		
	    prol3.pro_statusedit();
	    prol3.pro_navigateback();
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
}


