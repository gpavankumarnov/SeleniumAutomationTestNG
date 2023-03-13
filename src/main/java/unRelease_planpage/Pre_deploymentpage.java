package unRelease_planpage;

import org.openqa.selenium.JavascriptExecutor;

import Basedata.Baseclass;
import Utilclass.utility;

public class Pre_deploymentpage extends Baseclass {


	utility util;
	JavascriptExecutor je;
	
	
	
	public Pre_deploymentpage() {
		util = new utility();
		
	}
	
	
	public void predeploy_searchfield() throws InterruptedException {
		util.l3searchfield("Deployment");
	}
	
	
	public void predeploy_dataedit() throws InterruptedException {
		util.locatewebelement("tbody.MuiTableBody-root>tr>td+td>div>button");
		//deployment type
		util.locatewebelement("input[id='autocomplete-search'][value='Pre-Deployment']");
		//post nor in deployment type
		util.locatewebelement("ul#autocomplete-search-popup li[data-option-index='1']");
		//Deploy phase
		util.locatewebelement("input[value='Testing']");
		//business handoff
		util.locatewebelement("ul#autocomplete-search-popup li[data-option-index='2']");
		util.scrollhorizontalmethod();
		//Deployment status
		util.locatewebelement("input[value='Completed']");
		//inprogress
		util.locatewebelement("ul#autocomplete-search-popup li[data-option-index='1']");
		Thread.sleep(800);
		util.locatewebelement("input[placeholder='Deployment Notes'][aria-label='Deployment Notes']", "T-mobile");
		util.scrollhorizontalbackmethod();
		util.locatewebelement("div[style='display: flex;']>button>span>svg");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
