package unRelease_planpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;

public class Workbackschedule_planpage extends Baseclass{

	utility util;
	Loginpage logging;
	Homepage homepage;

	
	
	public Workbackschedule_planpage() {
		util = new utility();
	}
	
	 public void datechnge() {                     //April17th
		String emonth="April";
    String eyear = "2021";
			String edate = "17";
			WebElement shadowroot =util.expandRootElement(util.root2);
			   util.locatewebelement(".sc-eGJWMs.gQYBcx>:nth-child(2)>button>span");
			   String cmonth =shadowroot.findElement(By.cssSelector(".react-datepicker__month-container>div>div>:first-child")).getText();
			   System.out.println("month is" +cmonth);
			   String cyear = shadowroot.findElement(By.cssSelector(".react-datepicker__month-container>div>div>:nth-child(2)")).getText();
			   System.out.println("selected date is " +cyear);
			   
			   while((!cmonth.equals(emonth)) || (!cyear.equals(eyear))){
				   shadowroot.findElement(By.cssSelector("div.sc-cxNHIi.fHUQtx>:last-child>svg")).click();
		  cmonth =shadowroot.findElement(By.cssSelector(".react-datepicker__month-container>div>div>:first-child")).getText().trim();
		  cyear = shadowroot.findElement(By.cssSelector(".react-datepicker__month-container>div>div>:nth-child(2)")).getText();
		  
			  }
			   List <WebElement> date = shadowroot.findElements(By.cssSelector("div[tabindex='-1'][role='button'][aria-disabled='false'][role='button']"));
			   for(WebElement e :date) {
				   if(e.getText().equals(edate))
				   {
					   e.click();
					   break;
				   }
			   }
	 }
	
	public Wrkbackschedule_Eventdetailpage releasesview() {
		util.locatewebelement("div.sc-fIbCpR.gljkfE");   //releaseview
		util.locatewebelement("div.sc-eJocfa.jARayQ>svg");
		return new Wrkbackschedule_Eventdetailpage();
	}
	
	
	public Wrkbackschedule_Eventdetailpage addevent() throws InterruptedException {
		Thread.sleep(3000);
		util.locatewebelement("div.sc-csTbgd.kA-dKoz>button>span");
		return new Wrkbackschedule_Eventdetailpage();
	}
	
	public void menuclick() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebElement shadowroot =util.expandRootElement(util.root2);
		
		Thread.sleep(2000);
		WebElement menubtn = shadowroot.findElement(By.cssSelector(".sc-kfHINQ.kDMQIv>div>div>svg"));
		Thread.sleep(5000);
//	}
//	
//	public void edit_delete_copyclick() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", menubtn);
		Thread.sleep(2000);
		util.locatewebelement("div.action-tooltip>:nth-child(1) a");   //edit - eventdetailpage
		Thread.sleep(2000);
		util.locatewebelement("div.action-tooltip>:nth-child(2)>svg span");    //delete
		util.locatewebelement("div.sc-kSguSi.hvZqSU>:nth-child(1)");    //cancel
		Thread.sleep(2000);
		util.locatewebelement("div.sc-jHNicF.bMmwdY");    //Billing release
		
		
	}
	
	public Planpage wrkbackschedulenavigateback() throws InterruptedException {
		Thread.sleep(3000);
		util.locatewebelement("div.sc-hOPeYd.eXirsP>svg>path");
		return new Planpage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
