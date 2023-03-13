package unRelease_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;
import unRelease.Intakepage;
import unRelease.RMIL3page;

@SuppressWarnings({ "static-access", "static-access", "static-access" })
public class RMIL3page_test extends Baseclass{

	utility util;
	Loginpage logging;
	Homepage homepage;
	RMIL3page rmil3;
	Intakepage intake;
	
	public RMIL3page_test() {
		super();
	
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Initialisation();
		logging = new Loginpage();
		rmil3 = new RMIL3page();
		intake = new Intakepage();
		util = new utility();
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.unreleaseclickable();
		intake.datepick();
		intake.submittedrmiclick();
	}
	
		
	@Test(priority=1)
	public void verifysubmittedrmisearchfeld_test() throws InterruptedException {
		
		rmil3.submittedrmisearchfield();
		rmil3.downloadrmidata();
		}
	
	
		
	
	
		@Test(priority=2)
		public void verifyverticalL3tableview_test() throws InterruptedException {
		rmil3.rmidataedit();
	    
	}
	
	
		@Test(priority=3)
		public void verifyrmiidclick() throws InterruptedException {
	     rmil3.rmiidclick();
	    
	}
	
	
		
	
	
		@AfterMethod
		public void tearDown() throws InterruptedException{
			Thread.sleep(3000);
			driver.quit();
		}
		
	
	
	
}
