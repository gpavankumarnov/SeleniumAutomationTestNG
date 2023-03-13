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
import unRelease_planpage.ReleaseSIS_viewReleasepage;

public class ReleaseSIS_viewrelease_test extends Baseclass {
	
	
	utility util;
	Loginpage logging;
	Homepage homepage;
	Intakepage intake;
	Planpage plan;
	ReleaseSIS_planpage releaseSIS;
	ReleaseSIS_viewReleasepage viewrelease;
	
	
	public ReleaseSIS_viewrelease_test() {
		super();
	}
	
    @BeforeMethod
    public void setup() throws InterruptedException {
    	Initialisation();
    	util = new utility();
    	logging = new Loginpage();
    	homepage = new Homepage();
    	intake = new Intakepage();
    	plan = new Planpage();
    	releaseSIS = new ReleaseSIS_planpage();
    	viewrelease = new ReleaseSIS_viewReleasepage();
    	homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
    	homepage.unreleaseclickable();
        util.dateselector();
        intake.planpageclick();
        plan.ReleaseSISviewclick();
        releaseSIS.datechnge();
       
    }
	
	
	@Test(priority=1)
	public void validatepageurl_test() throws InterruptedException {
		 Thread.sleep(3000);
		releaseSIS.menuoption();
	    
		viewrelease.Getviewreleasepageurl();
		viewrelease.ValidateBulkuploadreleaseSIS_text();
		viewrelease.Validateviewreleasetext();
		viewrelease.clickonhidebtn();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
