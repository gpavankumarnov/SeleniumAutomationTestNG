package Homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basedata.Baseclass;

public class Homepage extends Baseclass{

	@FindBy(css = "div.main-grid-box-container1>:nth-child(2)>div>a>:nth-child(2) p")
	WebElement unreleaseclick;
	
	
	@FindBy(css = "div.main-grid-box-container1>:nth-child(2)>div>a>:nth-child(2) p")
	WebElement unreleaselabel;
	
	@FindBy(css = "Header__UnreleaseLogoTxt-sc-1jrm3js-5 eVtIcd")
	WebElement Canvasheader;
	
	@FindBy(css = ".Header__CanvasLogo-sc-1jrm3js-3.jvRBuV")
	WebElement canvaslogo;
	
	
	// Initializing the Page Objects:
		public Homepage() {
			PageFactory.initElements(driver, this);
		}
		
		public void validatehomepagetitle() throws InterruptedException {
			Thread.sleep(6000);
			System.out.println(driver.getTitle());
		}
		
		
		
		public boolean canvaslogodisplay() throws InterruptedException {
			Thread.sleep(4000);
			return canvaslogo.isDisplayed();
		}
		
	public void unreleaseclickable() throws InterruptedException {
		Thread.sleep(3000);
		 unreleaseclick.click();
	}

	
	}
	
	
	
	

