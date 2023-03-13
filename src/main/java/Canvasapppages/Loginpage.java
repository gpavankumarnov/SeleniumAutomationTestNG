package Canvasapppages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basedata.Baseclass;
import Homepage.Homepage;


public class Loginpage extends Baseclass {

    
		
		//Page repository = Object repository
		
		@FindBy(css = "input[id='okta-signin-username'][type='text']")
		WebElement Signin;
		
		@FindBy(css = "#okta-signin-submit")
		WebElement NextBttn;
		
		@FindBy(xpath = "/html/body/div[2]/div/main/div[2]/div/div/form/div[1]/div[2]/div/div[2]/span/input")
		WebElement Password;
		
		@FindBy(xpath = "/html/body/div[2]/div/main/div[2]/div/div/form/div[2]/input")
		WebElement Verify;
		
		
		@FindBy(css = ".Header__CanvasLogo-sc-1jrm3js-3.jvRBuV")
		WebElement canvaslogo;
		
				
			public Loginpage() {
				
				PageFactory.initElements(driver, this);
				
			}
			
			
		public Homepage login(String un, String pwd) throws InterruptedException {        //method
			//Thread.sleep(10000);
			Signin.sendKeys(un);
			
			
			NextBttn.click();
			Thread.sleep(4000);
			
			Password.sendKeys(pwd);
		
			Verify.click();
		    Thread.sleep(10000);
		    
//		    LocalStorage local = ((WebStorage) driver).getLocalStorage();
//		    local.clear();
//		    
		     
		    if (driver instanceof WebStorage) {
		        WebStorage webStorage = (WebStorage)driver;
		        webStorage.getSessionStorage().clear();
		        webStorage.getLocalStorage().clear();
		    }
		
		    
		    driver.navigate().refresh();
			Thread.sleep(4000);
		
		    return new Homepage();
	}	
		
		
		
		
		
	
		
	
		
	
	}	
		
	
	
	
	

