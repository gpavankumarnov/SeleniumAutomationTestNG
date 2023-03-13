package Utilclass;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basedata.Baseclass;

public class utility extends Baseclass{
    
	



	
	@FindBy(tagName = "unrelease-microapp")
	public static WebElement root2;

//	@FindBy(css = "")
//	WebElement filterdropdown;
	
	
	public utility() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void scrollverticall3table() {
		EventFiringWebDriver obj=new EventFiringWebDriver(driver);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	obj.executeAsyncScript("document.querySelector(\"#root > unrelease-microapp\").shadowRoot.querySelector(\"div.sc-dkiSSI.ibkFXD>:nth-child(2)\").scrollTop=800");
	
	}
	
	
	//Repeated buttons(L3 page)
	public void l3searchfield(String sendkeys) throws InterruptedException {
		Thread.sleep(2000);
		locatewebelement("input[placeholder='Search'][aria-label='Search']", sendkeys);
		Thread.sleep(3000);
		  
	}
	
	public void downloadclick() {
		locatewebelement("div.sc-hkeOVe.cosZie>svg>path");
	}
	
	public void searchfieldxclick() {
		locatewebelement("svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeSmall[aria-hidden='true'][aria-label='clear'] path");
	}
	
	public void filterclick() throws InterruptedException {
		Thread.sleep(1000);
		locatewebelement("div.sc-fbIWvP.jREztg>svg[width='16px'][height='18px'][version='1.1']");
	}
	
	public void removefilterX() {
		locatewebelement("div.sc-eJocfa.jARayQ>svg[class='MuiSvgIcon-root'][viewbox='0 0 24 24']");
	}
	
	
	
    public void filterdropdown() throws InterruptedException {
    	Thread.sleep(4000);
    	locatewebelement(".MuiAutocomplete-endAdornment>:nth-child(2) span");               //filter all click
    	locatewebelement("ul.MuiAutocomplete-listbox[id='autocomplete-search-popup']>li+li");   //off		
	}
	
    public void datepick() throws InterruptedException {
		Thread.sleep(3000);
		locatewebelement(".sc-eGJWMs.gQYBcx>:nth-child(2)>button>span"); //datebutton
		Thread.sleep(2000);
		locatewebelement("div.sc-iJCRrE.ckYLYy>svg");      //forward>october
		Thread.sleep(1500);
		//locatewebelement("div.sc-cxNHIi.fHUQtx>:last-child>svg");
		locatewebelement("div.sc-cxNHIi.fHUQtx>:last-child>svg");    //backbutton (Aug)
	Thread.sleep(3000);
	locatewebelement("div[aria-label='Choose Thursday, August 12th, 2021'][role='button']");  //Aug 12th 2021
	}
    
    
    
    
    //Not works
    public void dateclickcontinuous() throws InterruptedException {
    	Thread.sleep(4000);
    	locatewebelement(".sc-eGJWMs.gQYBcx>:nth-child(2)>button>span"); //datebutton
    	Thread.sleep(1000);
    	int i=1;
    	
    	while(i<4)
    	{
    		
    		locatewebelement("div.react-datepicker>:nth-child(2)>div>div>div>:nth-child(4)>svg");  //click5times
    		i++;
    		
    	}
    	Thread.sleep(2000);
    	 locatewebelement("div[tabindex='0'][role='button'][aria-disabled='false'][aria-label='Choose Thursday, May 6th, 2021']");
    }
    
  
    
	//shadowroot methods
	
 	public WebElement expandRootElement(WebElement root2) {             
		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
				
	.executeScript("return arguments[0].shadowRoot",root2);
		return ele;
	}
 	
 	
	public WebElement webelementlocate(String cssSelector) {             
		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
	.executeScript("return arguments[0].shadowRoot",root2);
		WebElement Shadowroot =expandRootElement(root2);
	
		WebElement shadow = (WebElement) Shadowroot.findElement(By.cssSelector(cssSelector));
		return ele;
   
	}
 	
	//duplicate
//	public void locatewebelements(shadow) {             
//		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
//	.executeScript("return arguments[0].shadowRoot",root2);
//		WebElement Shadowroot =expandRootElement(root2);
//	
//		WebElement shaadow = (WebElement) Shadowroot.findElement(By.cssSelector());
//	shadow.click();
//   
//	}
//  
	
 
 	public void locatewebelement(String cssSelector) {             
		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
	.executeScript("return arguments[0].shadowRoot",root2);
		WebElement Shadowroot =expandRootElement(root2);
	
		WebElement shadow = (WebElement) Shadowroot.findElement(By.cssSelector(cssSelector));
	shadow.click();
   
	}


 	public void locatewebelement(String cssSelector, String sendkeys ) {             
		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
	.executeScript("return arguments[0].shadowRoot",root2);
		WebElement Shadowroot =expandRootElement(root2);
	
		WebElement shadow = (WebElement) Shadowroot.findElement(By.cssSelector(cssSelector));
	shadow.sendKeys(sendkeys);
   
	}

 	
 	
 	
 	
 	

 	//scroll by vertical axis methods
 	  public void scrolldownmethod() {
 		   JavascriptExecutor js = (JavascriptExecutor) driver;
 		    js.executeScript("window.scrollBy(0,1000)");
 		      }
 	  
 	//scroll by Horizontal axis methods
 	 public void scrollhorizontalmethod() {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(200,0)");
		      }	
 	 
 	 public void scrollhorizontalbackmethod() {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(-200,0)");
		      }	
 	 
 	   public void scrollupmethod() {
 		   JavascriptExecutor js = (JavascriptExecutor) driver;
 		    js.executeScript("window.scrollBy(0,-1500)");
 		      }
 	   
 	  public void scrolluntilvisibilityoftext() {
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,-1500)");
		      }
 	   
 	   
 		//dateselector base on while loop
 	  public void dateselector() throws InterruptedException {
 		  Thread.sleep(16000);
   String expecteddate= "12-August-2021";
   String emonth = expecteddate.split("-")[1];
   String eyear = expecteddate.split("-")[2];
   String edate = expecteddate.split("-")[0];
		
 		WebElement shadowroot =expandRootElement(root2);
 		     locatewebelement(".sc-eGJWMs.gQYBcx>:nth-child(2)>button>span");
 		     
 String cmonth =shadowroot.findElement(By.cssSelector(".react-datepicker__month-container>div>div>:first-child")).getText().trim();  
 System.out.println("month is" +cmonth);
String cyear = shadowroot.findElement(By.cssSelector(".react-datepicker__month-container>div>div>:nth-child(2)")).getText();
 System.out.println("selected date is " +cyear);
 		     
   while((!cmonth.equals(emonth)) || (!cyear.equals(eyear))) {
 		    	//shadowroot.findElement(By.cssSelector("div.sc-iJCRrE.ckYLYy>svg path")).click();
 		    	
shadowroot.findElement(By.cssSelector("div.sc-cxNHIi.fHUQtx>:last-child>svg")).click();
 		    	
 cmonth =shadowroot.findElement(By.cssSelector(".react-datepicker__month-container>div>div>:first-child")).getText().trim();  
 	 		     
   cyear = shadowroot.findElement(By.cssSelector(".react-datepicker__month-container>div>div>:nth-child(2)")).getText();
 		     }
 		   
 		     List <WebElement> date = shadowroot.findElements(By.cssSelector("div[tabindex='-1'][role='button'][aria-disabled='false']"));
 		     
 		     for(WebElement e :date) {
 		    	 if(e.getText().trim().equals(edate)) {
 		    		 e.click();
 		    		 break;
 		    	 }
 		     }
 		     
 	  }	     
 		     
 		     
 	 public void dropdownclick() throws InterruptedException {
 		 
 		 locatewebelement("div[role='combobox'][aria-expanded='false'] button[aria-label='Open'][title='Open']");
 	 }


	
	
 		public static void takeScreenshotAtEndOfTest() throws IOException {
 			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 			String currentDir = System.getProperty("user.dir");
 			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
 		}
	
 		
 		//inside webelement move
	
 		 public WebElement scrolluntileleisvisible(String CSSselector) throws InterruptedException {  
 			 Thread.sleep(2000);
 			 WebElement shadowroot =expandRootElement(root2);
 			WebElement Element = shadowroot.findElement(By.cssSelector(CSSselector));
 			JavascriptExecutor js = (JavascriptExecutor) driver;
 	        js.executeScript("arguments[0].scrollIntoView();", Element);
 			 return Element;
 		 }
 		 
 		 
 		 //scroll by inside webelement
 		 public void scrollinsideele() throws InterruptedException {  
 			 
 		
 					 
 			 Thread.sleep(2000);
 			 WebElement shadowroot =expandRootElement(root2);
 		 EventFiringWebDriver obj=new EventFiringWebDriver(driver);
 		obj.executeAsyncScript("document.querySelector(\"#root > unrelease-microapp\").shadowRoot.querySelector(\"\").scrollTop=500");
 			WebElement data; 
 
 		 }
	
}
