package unRelease_planpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;

public class ReleaseSIS_planpage {

	utility util;
	Loginpage login;
	Homepage homepage;
	
	
	public ReleaseSIS_planpage() {
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
	
	public ReleaseSIS_viewReleasepage menuoption() throws InterruptedException {
		Thread.sleep(5000);
		util.locatewebelement("div.sc-jDOurc.bmmCB>:nth-child(2)>:nth-child(3)>div>:nth-child(2)");   //menu click
		Thread.sleep(2000);
		util.locatewebelement("div.action-tooltip>a>svg+span");      //viewbtn
		Thread.sleep(2000);
		return new ReleaseSIS_viewReleasepage();
	 
	}
	
	
	
	
	
	
	
	
	
	
	
}
