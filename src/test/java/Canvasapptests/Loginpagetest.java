package Canvasapptests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;


	public class Loginpagetest extends Baseclass{

		Loginpage logging;
		
		public Loginpagetest() {
			super();
		
		}

	@BeforeMethod
	public void setUp() {
		Initialisation();
		
		logging = new Loginpage();
		System.out.println("constructor called");
		
	}
		
		
		@Test(priority=1)
		public void login() {
			Logger log = LogManager.getLogger(Loginpagetest.class);
		try {
			logging.login(prop.getProperty("username"), prop.getProperty("password"));
			log.info("username & passwords givenout successfully");			
			
		} catch (InterruptedException e) {
			System.out.println("logiin exception");
		}
		}
	
		
		
		@AfterMethod
		public void teardownmethod() throws InterruptedException {
			Thread.sleep(8000);
			driver.quit();
		}
		}		
		
	
	
	
	
	
	

