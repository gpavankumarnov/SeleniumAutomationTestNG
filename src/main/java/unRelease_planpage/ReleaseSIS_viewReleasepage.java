package unRelease_planpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Basedata.Baseclass;
import Utilclass.utility;

public class ReleaseSIS_viewReleasepage extends Baseclass {

	
	utility util;
	 
	
	
	public ReleaseSIS_viewReleasepage() {
		util = new utility();
		
	}
	
	
	public void Getviewreleasepageurl() {
		String etitle = "Canvas";
		String atitle = driver.getTitle();
		System.out.println("view release page url" +atitle);
	   Assert.assertEquals(atitle, etitle);
	}
	
	
	public void Validateviewreleasetext() {
		WebElement shadowroot =util.expandRootElement(util.root2);
		String etext = "View Release";
		String atext = shadowroot.findElement(By.cssSelector("div.sc-gsWcmt.grZHMV")).getText();
		System.out.println(atext);
		Assert.assertEquals(atext, etext);
	}
	
	
	public void ValidateBulkuploadreleaseSIS_text() {
		WebElement shadowroot =util.expandRootElement(util.root2);
		Assert.assertEquals("atext", "Bulk Upload Release SIS");
		String atext = shadowroot.findElement(By.cssSelector("p.sc-dKZQYS.bLKSac")).getText();
	}
	
	
	public void clickonhidebtn() {
		WebElement shadowroot =util.expandRootElement(util.root2);
		System.out.println(shadowroot.findElement(By.cssSelector("span.MuiSwitch-root+span")).getText());
		util.locatewebelement("span.MuiSwitch-root>span>span.MuiIconButton-label");
		System.out.println(shadowroot.findElement(By.cssSelector("span.MuiSwitch-root+span")).getText());
	}
	
	
}
