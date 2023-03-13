package unRelease_planpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Basedata.Baseclass;
import Utilclass.utility;

public class Pro_l3page extends Baseclass {

    utility util;
	JavascriptExecutor je;
	
	public Pro_l3page() {
		util = new utility();
		
	}
	
	
	
	public void pro_searchfield() {
		util.locatewebelement(prop.getProperty("searchfield"), prop.getProperty("prosearchfield"));
	}
	
	
	public  void pro_l3procodelinkscroll() throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement shadow = util.expandRootElement(util.root2);
		util.scrolldownmethod();
		//shadow.findElement(By.linkText(prop.getProperty("pro_l3procodelink"))).click();
		WebElement sh=shadow.findElement(By.linkText(prop.getProperty("pro_l3procodelink")));
		je.executeScript("arguments[0].scrollIntoView(true);", sh);
		
	}

	
    public void pro_statusedit() throws InterruptedException {
    	Thread.sleep(4000);
     util.locatewebelement("div[style='display: flex;']>button[type='button'][tabindex='0'] span>svg[aria-hidden='true']");
     util.locatewebelement("td[style='color: inherit; padding: 1.25rem 0.35rem;']>div>div input[aria-label='Tested By']", prop.getProperty("pro_statusedit"));
     util.scrollhorizontalmethod();
     util.locatewebelement("td[style='color: inherit; padding: 1.25rem 0.35rem;']>div>div input[placeholder='Comments'][aria-invalid='false']", prop.getProperty("pro_comments"));
     util.scrollhorizontalbackmethod();
     util.locatewebelement("div[style='display: flex;']>button[tabindex='0'][type='button']");    //tickmark
         }

   public void pro_navigateback() {
	   util.locatewebelement("div.sc-hOPeYd.eXirsP>svg[focusable='false'][style='cursor: pointer;'] path");
   }
    
    
    public Procode_detailpage procodelink() {
    	util.locatewebelement("tr.MuiTableRow-root[index='1'][level='0'][path='1']>:nth-child(3) a");   //procode click PR21240
    	return new Procode_detailpage();
    }


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
