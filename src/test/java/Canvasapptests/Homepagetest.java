package Canvasapptests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;

public class Homepagetest extends Baseclass{

	
	Loginpage logging;
	Homepage homepage;
	
	
	public Homepagetest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		Initialisation();
		logging = new Loginpage();
		homepage = logging.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void validatehomepagetitletest() throws InterruptedException {
		 homepage.validatehomepagetitle();
		
		}
	
	
	
	
	
	
	@Test(priority=2)
	public void Canvaslogotest () throws InterruptedException {
		boolean logo = homepage.canvaslogodisplay();
		Assert.assertTrue(logo);
		}
	
	@Test(priority=3)
	public void unreleaseclicktest () throws InterruptedException {
		 homepage.unreleaseclickable();
		
		}
	
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
