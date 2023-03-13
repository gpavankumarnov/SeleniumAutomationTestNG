package unRelease_planpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import Basedata.Baseclass;
import Utilclass.utility;

public class Impactapp_l3page extends Baseclass{

	utility util;
	JavascriptExecutor je;
	
	
	
	public Impactapp_l3page() {
		util = new utility();
		
	}
	
	
	
	public void impact_l3searchfield() throws InterruptedException {
		util.l3searchfield(prop.getProperty("Impactapp_searchfield"));  //impactedapp click
		Thread.sleep(4000);
		util.searchfieldxclick();    // x click
		Thread.sleep(4000);
		util.locatewebelement(".sc-jlZJtj.QgNfY>svg[focusable='false'][aria-hidden='true']");        // download click
		
	}
	
	 //scroll by inside webelement
	 public void scrollinsideele() throws InterruptedException {  
		 Thread.sleep(2000);
		 util.expandRootElement(utility.root2);
	 EventFiringWebDriver obj=new EventFiringWebDriver(driver);
	obj.executeAsyncScript("document.querySelector(\"#root > unrelease-microapp\").shadowRoot.querySelector(\".sc-hHEiqL.ccTnQh>div>:nth-child(2)>div>div\").scrollTop=500");
		 
	 }
	 
	 
	 
	 
	
	
	 public void Impactapp_l3dataedit() throws InterruptedException {
		 Thread.sleep(6000);
		 util.locatewebelement("tr.MuiTableRow-root[index='0'][level='0'][path='0']>td:nth-of-type(2)>div>button>span>svg ");    //pen click
		 Thread.sleep(1000);
		 util.locatewebelement("input[placeholder='App Support'][aria-label='App Support']", prop.getProperty("Impactapp_appsupporttextfield"));   //appsupport text field
		 Thread.sleep(3000);
			WebElement shadowroot =util.expandRootElement(util.root2);
			shadowroot.findElement(By.cssSelector("input[id='autocomplete-search'][value='undefined']")).clear();
		    shadowroot.findElement(By.cssSelector("div[role='combobox'][aria-expanded='false'] button[aria-label='Open'][title='Open']")).click();        //   dropdownbtn
		    WebElement CashShawan = util.scrolluntileleisvisible("li[data-option-index='3'][id='autocomplete-search-option-3']");
		    CashShawan.click();
		
		WebElement SIS =util.scrolluntileleisvisible("input[id='autocomplete-search'][aria-autocomplete='list'][value='Not Started']");
		SIS.click();
		    util.locatewebelement("div[style='display: flex;']>button>span>svg");
		   
//		    List<WebElement> allOptions = shadowroot.findElements(By.cssSelector("li[role='option'][aria-disabled='false']"));
//	        System.out.println(allOptions.size());
//		 

//		List <WebElement> listele = (List<WebElement>) util.root2.findElement(By.cssSelector("ul[role='listbox'][id='autocomplete-search-popup']"));
//		 
//		for (WebElement webElement : listele) {
//			System.out.println(webElement.getText());
//			if(webElement.getText().trim().equals("Cash, Shawn")) {
//				webElement.click();
//				break;
//				
//			}
//		}

	 }	 
	 
	 
	 
	
	 
	 
	 
	 
	
	 public void impactapp_l3checkboxselect() throws InterruptedException {
		 WebElement shadowroot =util.expandRootElement(util.root2);
		 Thread.sleep(5000);
		 
		 System.out.println(shadowroot.findElement(By.cssSelector("span.MuiIconButton-label>input[type='checkbox'][value='0']")).isSelected());   //1st element
             util.locatewebelement("span.MuiIconButton-label>input[type='checkbox'][value='2']");
             Thread.sleep(2000);
		System.out.println(shadowroot.findElement(By.cssSelector("span.MuiIconButton-label>input[type='checkbox'][value='0']")).isSelected());
		System.out.println(shadowroot.findElements(By.cssSelector("span.MuiIconButton-label>input[type='checkbox']")).size());
		
	 }
	
	
	
	public void impactapp_Deploypoc() {
		WebElement shadowroot =util.expandRootElement(util.root2);
	    util.locatewebelement("div[role='combobox'][aria-expanded='false'] button[aria-label='Open'][title='Open']");
	    List<WebElement> allOptions = shadowroot.findElements(By.xpath("ul[role='listbox'][id='autocomplete-search-popup']"));
        System.out.println(allOptions.size());
         
		
	}
	
	
	
	public Planpage navigateback() {
		util.locatewebelement("div.sc-hOPeYd.eXirsP>svg[focusable='false'][aria-hidden='true'] path");
		return new Planpage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
