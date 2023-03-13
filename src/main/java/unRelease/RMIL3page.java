package unRelease;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Basedata.Baseclass;
import Utilclass.utility;

public class RMIL3page extends Baseclass{
    
	utility util;
	Intakepage intake;
	
	
	public RMIL3page() {
		intake = new Intakepage();
		util = new utility();
	}
	
	
	
	
	//1)
	public void submittedrmisearchfield() throws InterruptedException {
		Thread.sleep(2000);
		util.locatewebelement("input[placeholder='Search'][aria-label='Search']", prop.getProperty("rmisearchfield"));
		Thread.sleep(2000);
		util.locatewebelement("svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeSmall[aria-hidden='true'][aria-label='clear']");    //remove entered input in searchfield  
	}
		
	
	//2)
	public void downloadrmidata() {
		util.locatewebelement(".sc-iemWCZ.UvBtS>:last-child>:last-child>div>div>span>button>span>a>div>svg");
		 
	}
	
	
	
	//3)
	public void rmidataedit() throws InterruptedException {
		Thread.sleep(2000);
		util.locatewebelement("tbody.MuiTableBody-root>tr>td+td>div>button");
		Thread.sleep(2000);
		util.locatewebelement("input[aria-invalid='false'][placeholder='Request Type'][type='text']", prop.getProperty("rmirequesttype"));
		Thread.sleep(2000);
		util.locatewebelement("input[placeholder='Environment Request IDs'][aria-label='Environment Request IDs']", prop.getProperty("rmienvironreq"));
		Thread.sleep(2000);
		util.locatewebelement("input[placeholder='Description'][aria-label='Description']", prop.getProperty("description"));
		Thread.sleep(2000);
		util.locatewebelement("div[style='display: flex;']>button>span>svg");
	}
	
	//4)
	public RMIIDdetailspage rmiidclick() {
		
		util.locatewebelement("tbody.MuiTableBody-root>tr[path='0']>td:nth-of-type(3) a");    //rmiidclick
		
		return new RMIIDdetailspage();
	    
	}
	
	//5)
public void verticalL3tableview() {
		util.expandRootElement(util.root2);
		util.locatewebelement(".sc-bXexck.cMGGEg>:nth-child(3)>div>:nth-child(2)");    //vertical toggleview inside submittedrmiboard
		
	    
	}
	
//6)	
public void horizontalL3tableview() {
	util.expandRootElement(util.root2);
	util.locatewebelement("div.sc-gIvpjk.ggbDAM>div>button>span>svg>path");      //Horizontal toggleview inside submittedrmiboard
	        
}
	
	

//7)	
public ProjectIDdetailspage projectidclick() {
	util.expandRootElement(util.root2);
	util.locatewebelement("tr[class='MuiTableRow-root'][index='0'][level='0']>:nth-child(5) a");      //projectid click
	 return new ProjectIDdetailspage();      
}	
	

	
public void scrlluntilbasermi() throws InterruptedException {
//	System.out.println(util.scrolluntileleisvisible("a.sc-liAPKD.iwClXr[href='/unrelease/rcm/RMI-8151']").getText());
//	Thread.sleep(1000);
//	util.scrollhorizontalmethod();
//	Thread.sleep(1000);
//	util.scrollupmethod();
//	Thread.sleep(1000);
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
//	 Thread.sleep(1000);
	 EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
	 eventDriver.executeScript("document.querySelector(\"#root > unrelease-microapp\").shadowRoot.querySelector(\'tr.MuiTableRow-root[index='0']>:nth-child(11)[value='[object Object]']>div.deployment-impacts\').scrollTop = 500");
	
	 
}
	
	
	






public void basermisearchfield() throws InterruptedException {
	Thread.sleep(2000);
	util.locatewebelement("input[placeholder='Search'][aria-label='Search']", prop.getProperty("Basermi"));
	Thread.sleep(2000);
	util.locatewebelement("svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeSmall[aria-hidden='true'][aria-label='clear']");    //remove entered input in searchfield  
}
	
	
	
}
