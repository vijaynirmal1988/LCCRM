package main.java.user2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMain {
	 public static String HOSTNAME = "http://localhost:80";
		

		public static void main(String[] args) throws InterruptedException {

			org.apache.log4j.PropertyConfigurator.configure("Log4j.properties");

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver wd = new ChromeDriver();

			// test all the positive Scenarios
			TestLoginPage.testLogin(wd);
			//TestNewLead.testnewlead(wd);
		TestEmployeeId.testemployeeId(wd);
		//	TestUpdateEmployee.testUpdateEmployee(wd);
		//	TestReport.testReport(wd);
		//	TestDashboardPage.testdashboard(wd);
			}

	}


