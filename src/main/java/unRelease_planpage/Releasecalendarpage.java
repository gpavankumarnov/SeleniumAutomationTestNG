package unRelease_planpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;
import unRelease.committedRMIpage;

public class Releasecalendarpage extends Baseclass {

	utility util;
	Loginpage logging;
	Homepage homepage;

	
	
	public Releasecalendarpage() {
		util = new utility();
	}
	
	
	public void drag_dropreleases() throws InterruptedException {
WebElement shadowroot =util.expandRootElement(util.root2);
		
		WebElement pickbilling = shadowroot.findElement(By.cssSelector("div[data-title='Billing Release']"));    //pickbillingrelease
		WebElement drop_22 = shadowroot.findElement(By.cssSelector("td[data-date='2021-10-22']"));             //destination date
		
		Actions builder = new Actions(driver);
		
		Action dragAndDrop = builder.clickAndHold(pickbilling)
				.moveToElement(drop_22)
				.release(drop_22)
				.build();
		
		dragAndDrop.perform();
		Thread.sleep(4000);
		shadowroot.findElement(By.cssSelector("button[tabindex='0'][type='button'] span.MuiButton-label")).click();
	}
	
	
	
	public committedRMIpage seecommittedrmi_calendar() {
		util.locatewebelement("div.sc-cRgdMP.hpiPDT+div.sc-jOvNRn.kyVWGp");
		return new committedRMIpage();
			}
	
	
	public void forwarddatepick_function() throws InterruptedException {
		String emonth = "December 2021";
		String eyear = "October 2020";
		WebElement shadowroot =util.expandRootElement(util.root2);
	      String cmonth = shadowroot.findElement(By.cssSelector("div.fc-toolbar.fc-header-toolbar>div.fc-center h2")).getText();
	      
	  while(!cmonth.equals(emonth))
	  {
		 shadowroot.findElement(By.cssSelector("span.fc-icon.fc-icon-chevron-right")).click();
		 System.out.println("month is" +cmonth );
		 cmonth = shadowroot.findElement(By.cssSelector("div.fc-toolbar.fc-header-toolbar>div.fc-center h2")).getText();
		 
	  }
	     
	}
	
	public void previousdatepick_function() throws InterruptedException {
		String eyear = "October 2020";
		WebElement shadowroot =util.expandRootElement(util.root2);
	      String cmonth = shadowroot.findElement(By.cssSelector("div.fc-toolbar.fc-header-toolbar>div.fc-center h2")).getText();
	      
	  while(!cmonth.equals(eyear))
	  {
		  shadowroot.findElement(By.cssSelector("button[class^='fc-prev-button']>span.fc-icon.fc-icon-chevron-left")).click();
		  System.out.println("month is" +cmonth);
		  cmonth = shadowroot.findElement(By.cssSelector("div.fc-toolbar.fc-header-toolbar>div.fc-center h2")).getText();
	  }
	  Thread.sleep(2000);
	  System.out.println(shadowroot.findElement(By.cssSelector("span.fc-icon.fc-icon-chevron-left")).getText());
	  
	  
	  util.locatewebelement("div.fc-button-group>button[class^='fc-dayGridMonth-button']");    //month
	  Thread.sleep(2000);
	  util.locatewebelement("div.fc-button-group>button[class^='fc-timeGridWeek-button']");    //week
	  Thread.sleep(2000);
	  util.locatewebelement("div.fc-button-group>button[class^='fc-timeGridDay-button']");    //day
	  Thread.sleep(2000);
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("document.querySelector(\"#root > unrelease-microapp\").shadowRoot.querySelector('td.fc-widget-content>div:nth-of-type(2)').scrollDown += 100");
	  
	  
	}
	
	
	
	public Planpage navigateback() {
		util.locatewebelement("div.sc-hOPeYd.eXirsP>svg");
		return new Planpage();
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

