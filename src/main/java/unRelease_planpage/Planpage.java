package unRelease_planpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;
import unRelease.RMIL3page;

public class Planpage extends Baseclass{
	utility util;
	Loginpage logging;
	Homepage homepage;

	
	
	public Planpage() {
		util = new utility();
	}
	
	
	public Pro_l3page projectmbclick() throws InterruptedException {
		util.locatewebelement(".sc-dhWmbD.eWWfDQ>div>div>div>div>div>div");       //pro_mbs click
	  return new Pro_l3page();
	}
	
	
	public void impactedappclick() {
		util.locatewebelement("div.grid-layout>:nth-child(2)>div>div");    //impactedapp click
	}
	
	
	
 public void datechnge() throws InterruptedException{
	 Thread.sleep(4000);
		   String expecteddate= "06-May-2021";
		   String emonth = expecteddate.split("-")[1];
		   String eyear = expecteddate.split("-")[2];
		   String edate = expecteddate.split("-")[0];
				
	WebElement shadowroot =util.expandRootElement(util.root2);
   util.locatewebelement(".sc-eGJWMs.gQYBcx>:nth-child(2)>button>span");
		 		     
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
   		   
  List <WebElement> date = shadowroot.findElements(By.cssSelector("div[tabindex='-1'][role='button'][aria-disabled='false'][role='button']"));
  
    for(WebElement e :date) {
 if(e.getText().trim().equals(edate)) {
e.click();
	 
	 break;
 }
 }
	}
	
	



	public void predeployclick() {
		WebElement shadowroot =util.expandRootElement(util.root2);
		
		shadowroot.findElement(By.cssSelector("div.three.predep div.sc-jTFZWL.cPgGxl")).click();
	}
	
	
	
	public RMIL3page Basermiclick() {
		util.locatewebelement("div.four.rcmintake div.sc-jTFZWL.cPgGxl");
		return new RMIL3page();
	}
	
	
	
	public Releasecalendarpage viewreleasecalender() {
		util.locatewebelement("a.sc-cKRKFl.kSUooD[href='/unrelease/release-calendar']");
		return new Releasecalendarpage();
	}
	
	
	
	public Workbackschedule_planpage Workbackscheduleviewclick() {
		util.locatewebelement("a.sc-cKRKFl.kSUooD[href='/unrelease/plan/workback-schedule']");
		return new Workbackschedule_planpage();
		
	}
	
	public ReleaseSIS_planpage ReleaseSISviewclick() {
		util.locatewebelement("div.six>div>div.sc-kizEQm.irzWzB>:nth-child(2)");
		return new ReleaseSIS_planpage();
		
	}
	
	
}



