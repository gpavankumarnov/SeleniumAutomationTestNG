package unRelease;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Basedata.Baseclass;
import Utilclass.utility;

public class ProjectIDdetailspage extends Baseclass {
	
	utility util;
	Intakepage intake;
	
	public ProjectIDdetailspage() {
		intake = new Intakepage();
		util = new utility();
	}

	
	public void projectidlistviewclick() {
		util.expandRootElement(util.root2);
		util.locatewebelement("div.sc-dvUynV.joRTNm>:nth-child(2)");      //projectid inside list view
		        
	}	
		
	
	public void projectidXbutton() {
		util.expandRootElement(util.root2);
		util.locatewebelement("svg[focusable='false'][aria-label='clear'][aria-hidden='true']");      //projectid X button remove
		 driver.getTitle(); // validating right page or not
	}
	
	public void pro_iddetailnvgateback() {
		 util.locatewebelement("div.sc-hkoqWr.jwZvNA>div>svg[class='MuiSvgIcon-root'][style='color: rgb(226, 0, 116); cursor: pointer; margin-right: 1rem;']");   // navigating back
		 
	}	
	
	public void projectidlistsearchfield() {
		util.expandRootElement(util.root2);
		util.locatewebelement("input[aria-invalid='false'][placeholder='Search'][aria-label='Search'][type='text']", prop.getProperty("rmisearchfield"));      //projectid inside list view
		        
	}
	
	
	
	public void projectidtimelineforwardbtn() {
		util.expandRootElement(util.root2);
		util.locatewebelement("div.slider-btns>:last-child[type='button'][class='slider-btn btn-r']");      //projecttimeline forward
		util.locatewebelement("button.slider-btn.btn-l[type='button']>svg");    //backward
		util.locatewebelement("div.slider-btns>:last-child[type='button'][class='slider-btn btn-r']");   //bubble
		driver.getCurrentUrl();
		
	}   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
