package unRelease_planpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basedata.Baseclass;
import Canvasapppages.Loginpage;
import Homepage.Homepage;
import Utilclass.utility;

public class Wrkbackschedule_Eventdetailpage extends Baseclass {

	
		utility util;
		Loginpage logging;
		Homepage homepage;

		
		
  public Wrkbackschedule_Eventdetailpage() {
			util = new utility();
		}

 
  
  
  
  public void eventformfill() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement shadowroot =util.expandRootElement(util.root2);
	  WebDriverWait wait = new WebDriverWait(driver, 30);
		
				shadowroot.findElement(By.cssSelector("div.sc-kiwuqD.iTVyHy>:nth-child(1) button[tabindex='-1'][type='button'][aria-label='Open']>span>svg")).click();

	  Thread.sleep(3000);
	  List <WebElement> Activitytitles =shadowroot.findElements(By.cssSelector("ul#autocomplete-search-popup[aria-labelledby='autocomplete-search-label'] li"));
	  
	  for(WebElement Activitytitle :Activitytitles)
	  { 
		  if(Activitytitle.getText().equals("Release Date"))
		  {
		  Activitytitle.click();
		  break;
	  	  }
	  }
	  
  }
  
  
	  
	public void Plndstartdate() throws InterruptedException {
		WebElement shadowroot =util.expandRootElement(util.root2);
		util.locatewebelement("div.sc-kiwuqD.iTVyHy>:nth-child(3) button[class^='MuiButtonBase-root']>span>svg");
		String emonth = "December 2021";
		String edate = "30";
		String cmonth=shadowroot.findElement(By.cssSelector("div[class^='MuiPickersCalendarHeader']>:nth-child(2) p")).getText();
		//String cdate = shadowroot.findElement(By.cssSelector("div.MuiPickersCalendar-week>div[role='presentation']")).getText();
		
		while((!cmonth.equals(emonth))) 
		{    
			
			System.out.println(cmonth);
	      shadowroot.findElement(By.cssSelector("div[class^='MuiPickersCalendarHeader']>:nth-child(3)>span>svg")).click();
	      System.out.println(cmonth);
	      cmonth=shadowroot.findElement(By.cssSelector("div.sc-kiwuqD.iTVyHy>:nth-child(4)>:nth-child(3) >div>:nth-child(2) button+div p")).getText();
	      System.out.println(cmonth);
      }
		Thread.sleep(1000);
		List <WebElement> dates = shadowroot.findElements(By.cssSelector("div.MuiPickersCalendar-week>div[role='presentation']"));
		
		for(WebElement e:dates)
			if(e.getText().equals(edate)) {
				e.click();
				break;
			}
		System.out.println("date selected");
		Thread.sleep(3000);
		WebElement calendar = shadowroot.findElement(By.cssSelector("div[class^='MuiPickersCalendarHeader']>:nth-child(3)>span>svg"));
		//div.sc-kiwuqD.iTVyHy>:nth-child(3) button[class^='MuiButtonBase-root']>span>svg
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click;", calendar);
		
	}
	
	/* public void environmentdd() throws InterruptedException {
		WebElement shadowroot =util.expandRootElement(util.root2);
		int i=0;
		while(i<2) 
		{
			Thread.sleep(2000);
			shadowroot.findElement(By.cssSelector("div.sc-kiwuqD.iTVyHy>:nth-child(6) label+div>:nth-child(2) button[aria-label='Open']")).click();
			i++;
			
		}
		
		shadowroot.findElement(By.cssSelector(""))
		
		List<WebElement> environment = shadowroot.findElements(By.cssSelector("ul#autocomplete-search-popup[role='listbox']>li>li"));
		
		for(WebElement enviro :environment) 
		
			if(enviro.getText().equals("QLAB03/ITE2"))
			{
				enviro.click();
				break;
		}
	}
	*/
	
	public void Plndenddate() throws InterruptedException {
		WebElement shadowroot =util.expandRootElement(util.root2);
		util.locatewebelement("");
		String emonth = "March 2022";
		String edate = "30";
		String cmonth=shadowroot.findElement(By.cssSelector("div.sc-kiwuqD.iTVyHy>:nth-child(6)>:nth-child(3) div[class^='MuiPickersCalendarHeader']>:nth-child(2) p")).getText();
		//String cdate = shadowroot.findElement(By.cssSelector("div.MuiPickersCalendar-week>div[role='presentation']")).getText();
		
		while((!cmonth.equals(emonth)))  // (!cdate.equals(edate))) 
		{    
			System.out.println("cmonth is " +cmonth);
			
	      shadowroot.findElement(By.cssSelector("div.sc-kiwuqD.iTVyHy>:nth-child(6)>:nth-child(3) div[class^='MuiPickersCalendarHeader']>:nth-child(3)>span>svg")).click();
	      cmonth=shadowroot.findElement(By.cssSelector("div.sc-kiwuqD.iTVyHy>:nth-child(6)>:nth-child(3) div[class^='MuiPickersCalendarHeader']>:nth-child(2) p")).getText();
     
}
		Thread.sleep(1000);
		List <WebElement> dates = shadowroot.findElements(By.cssSelector("div.MuiPickersCalendar-week>div[role='presentation']"));
		
		for(WebElement e:dates)
			if(e.getText().equals(edate)) {
				e.click();
				break;
			}
		shadowroot.findElement(By.cssSelector("textarea#wbs-event-comments")).click();
	}

	
public Planpage wrkbackschedulenavigateback() throws InterruptedException {
	Thread.sleep(3000);
	util.locatewebelement("div.sc-hOPeYd.eXirsP>svg>path");
	return new Planpage();
}

	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	



