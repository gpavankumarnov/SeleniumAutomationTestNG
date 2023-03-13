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
import unRelease_planpage.Planpage;
import unRelease_planpage.Pro_l3page;

public class Procode_detailpage_test extends Baseclass {



		utility util;
		Loginpage logging;
		Homepage homepage;
		Intakepage intake;
		Planpage plan;
		Pro_l3page prol3;
		ProjectIDdetailspage proIDdetail;
		
		public Procode_detailpage_test() {
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
			proIDdetail = new ProjectIDdetailspage();
			homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
			homepage.unreleaseclickable();
			intake.datepick();
			intake.planpageclick();
			plan.projectmbclick();
			
			
		}
	
		
		@Test(priority=1)
		public void verifyprocodedetailspage_test() {
			proIDdetail.projectidlistviewclick();
			proIDdetail.projectidlistsearchfield();
			proIDdetail.projectidXbutton();
			proIDdetail.pro_iddetailnvgateback();
		}
	

		@AfterMethod
		public void tearDown(){
			
			driver.quit();
		}
	}	
		
	

