package Basedata;

	import java.io.File;

import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Utilclass.WebEventListener;

	public class Baseclass {
		  
	    public static WebDriver driver;
	    public static Properties prop;
	    public  static EventFiringWebDriver eventdriver;
		public static WebEventListener eventListener;
		
	    
		//super Constructor 
		public Baseclass() {
//			Logger log = LogManager.getLogger("devpinoyLogger");
			try {
				 prop = new Properties();
		   
			File src =new File("./Configuration/Configure.properties");
			FileInputStream input = new FileInputStream(src);
					
			prop.load(input);
			//String Browsername = prop.getProperty("browser");
			//System.out.println(Browsername);
			}catch (FileNotFoundException e) {
			}
			catch (IOException e) {
			}
		}	
		
		
		
		
			public static void Initialisation() {
				
				
			//System.setProperty("webdriver.chrome.silentOutput","true");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\piktor\\Documents\\Eclipse(2021-09)\\My Projects\\canvas-project-TestNGFramework\\canvas-project-TestNGFramework\\Canvasapp\\Driver\\chromedriver.exe");
				
//			 WebDriverManage0r.chromedriver().setup();
			 
				// SSL certificate bypass
				ChromeOptions Options = new ChromeOptions();
				Options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				Options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
				
				driver = new ChromeDriver(Options);
			
				//WebEventlistener code input
				
				eventdriver = new EventFiringWebDriver(driver);
				// Now create object of EventListerHandler to register it with EventFiringWebDriver
				eventListener = new WebEventListener();
				eventdriver.register(eventListener);
				driver = eventdriver;
				
				
				
			//System.out.println("browser started");	
		     
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("weburl"));
		
			}
		}
			

