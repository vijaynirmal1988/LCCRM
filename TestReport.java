package main.java.user2;

import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class TestReport {
		
		final static Logger logger = Logger.getLogger(TestReport.class);
		final static String UserURL = TestMain.HOSTNAME + "/lccrm/lccrmUI/report/report.php";
	    
		public static void testReport(WebDriver wd) throws InterruptedException {
			
	          testPositiveCase(wd);       //With Data Entering
	
}
		public static void testPositiveCase(WebDriver wd) throws InterruptedException {

			wd.manage().window().maximize();
	        wd.get(UserURL);
	        wd.findElement(By.xpath("//button[@class='btn btn-secondary buttons-copy buttons-html5']")).click();
			logger.info("selected item: Copied ");
			Thread.sleep(2000);
			wd.findElement(By.xpath("//button[@class='btn btn-secondary buttons-csv buttons-html5']")).click();
			logger.info("selected item: Download csv format ");
			Thread.sleep(2000);
			wd.findElement(By.xpath("//button[@class='btn btn-secondary buttons-excel buttons-html5']")).click();
			logger.info("selected item :Download excel format ");
			Thread.sleep(2000);
			wd.findElement(By.xpath("//button[@class='btn btn-secondary buttons-pdf buttons-html5']")).click();
			logger.info("selected item : Download Pdf format  ");
			Thread.sleep(2000);
	        
      }
	}