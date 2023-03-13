package unRelease_tests;



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

public class ProjectIDdetailspage_test extends Baseclass {

	utility util;
	Loginpage logging;
	Homepage homepage;
	RMIL3page rmil3;
	Intakepage intake;
	ProjectIDdetailspage project;
	
	
	public ProjectIDdetailspage_test() {
		super();
	
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Initialisation();
		logging = new Loginpage();
		rmil3 = new RMIL3page();
		intake = new Intakepage();
		util = new utility();
		project = new ProjectIDdetailspage();

		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();
		intake.datepick();
		
	}
	
	
	
		@Test(priority=1)
		public void verifyprojecttimelinetest() throws InterruptedException {
			rmil3 =intake.submittedrmiclick();
			project =rmil3.projectidclick();
		project.projectidlistviewclick();
		project.projectidlistsearchfield();
		project.projectidXbutton();
		project.pro_iddetailnvgateback();	
		}	

		
		@Test(priority=2)
		public void verifyproiddetailviewproject_test() throws InterruptedException {
		intake.viewproject();
		project.projectidtimelineforwardbtn();
		project.pro_iddetailnvgateback();
		util.scrollupmethod();
		}		
		
		
		
@AfterMethod
public void tearDown() throws InterruptedException{
	Thread.sleep(3000);
	driver.quit();
}

		
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

