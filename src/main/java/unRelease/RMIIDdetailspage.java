package unRelease;

import Basedata.Baseclass;
import Utilclass.utility;

public class RMIIDdetailspage extends Baseclass {

		utility util;
		Intakepage intake;
		
		public RMIIDdetailspage() {
			intake = new Intakepage();
			util = new utility();
		}
	
	
		//1)
		public void POCLmessagefield() throws InterruptedException {
			Thread.sleep(2000);
			util.locatewebelement("div.sc-kkmGkm.cItJKg>:nth-child(3)>textarea", prop.getProperty("POCLmessagefield"));
			Thread.sleep(2000);
			util.locatewebelement("div.sc-kkmGkm.cItJKg>:nth-child(3)>div>svg>g");    //POCL send message
		}
	
	
		//2)
		public void POCLmultiplebtnclick() throws InterruptedException {
		Thread.sleep(2000);
		util.locatewebelement("li.sc-fvNhHS.linuQG>div>div");    //QE
			Thread.sleep(1000);
			util.locatewebelement("ul>:nth-child(3)>div>div");    //CXT
			Thread.sleep(1000);
			util.locatewebelement("ul>:nth-child(4)>div");     //Performance
			Thread.sleep(1000);
			util.locatewebelement("ul>:nth-child(5)>div");     //fact
				}
		
		public RMIL3page rmiidnavigateback() {
			util.scrollupmethod();
			util.locatewebelement(".sc-fSvVUw.sc-hLiTib.bGtCdD.cJfgmS>div>div>svg");
			return new RMIL3page();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
