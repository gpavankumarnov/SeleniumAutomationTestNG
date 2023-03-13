package unRelease;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basedata.Baseclass;
import Utilclass.utility;
import unRelease_planpage.Planpage;

public class Intakepage extends Baseclass {
	
    utility util;
	
	
	public Intakepage() {
		util = new utility();
	}
	
	
	
	
	public void datepick() throws InterruptedException {
		Thread.sleep(16000);
		util.locatewebelement(".sc-eGJWMs.gQYBcx>:nth-child(2)>button>span"); //datebutton
		Thread.sleep(2000);
		util.locatewebelement("div.sc-iJCRrE.ckYLYy>svg");      //forward>october
		Thread.sleep(1500);
		util.locatewebelement("div.sc-cxNHIi.fHUQtx>:last-child>svg");
		util.locatewebelement("div.sc-cxNHIi.fHUQtx>:last-child>svg");    //backbutton (Aug)
	Thread.sleep(6000);
	util.locatewebelement("div[aria-label='Choose Thursday, August 12th, 2021'][role='button']");  //Aug 12th 2021
	}
	
	
	
	
	public RMIL3page submittedrmiclick() throws InterruptedException {
	    Thread.sleep(15000);
		util.locatewebelement(".sc-cdlubJ.kMsWyy>div>div>div>:last-child");       ////submittedRMIboard click
	    return new RMIL3page();
	}
	
	
	
	
	public RMIIDdetailspage rmicardclick() {
		util.locatewebelement("div[id='panel1a-header-10'][role='button'][tabindex='0']>div>div>div"); // rmicard(Building- Aug12th)
		
		return new RMIIDdetailspage();
		
	}
	
	
	public ProjectIDdetailspage viewproject() throws InterruptedException {
		util.scrolluntileleisvisible("div#panel1a-header-9[role='button']");
		util.locatewebelement("div[id^='panel1a-header-9']>div>div>:last-child>div+a");   // view project
		return new ProjectIDdetailspage();
	}
	
	
	public Planpage planpageclick() {
		util.locatewebelement(".sc-ksXiki.dXXEDb>:nth-child(4)>svg");
		return new Planpage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
