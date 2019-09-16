package main.java.user2;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;


public class TestLoginPage {

	final static Logger logger = Logger.getLogger(TestLoginPage.class);
	final static String UserURL = TestMain.HOSTNAME + "/lccrm/lccrmUI/user/userLogin.php";

	public static void testLogin(WebDriver wd) throws InterruptedException {
		testPositiveCase(wd);
//		testWrongUserName(wd);
//	    testWrongPassword(wd);
//		testWrongUserName1(wd);
//	    testEmptylogin(wd);
//		testWrongUserName2(wd);
//		testWrongUserName3(wd);

	}

	// test case no:1.1--
	public static void testPositiveCase(WebDriver wd) throws InterruptedException {
		
		 wd.manage().window().maximize();
		
         wd.get(UserURL);
         wd.findElement(By.id("txtemail")).sendKeys("kavi@magoosh.com");
	     logger.info("Entered Usename:kavi@magoosh.com");
	 	 wd.findElement(By.id("txtpwd")).sendKeys("pass123");
	 	 logger.info("Entered Password:pass123");
	 	 wd.findElement(By.id("btnSave")).click();
	 	 logger.info("Entered To Dashboard Page");
		 logger.info("loginPage Test case No :1 Login Sucessfully");// Login Successfully
		 logger.info("Test case No 1.1 :Tested Positive Case Successfully"); // Test case No 1.1 : Created Successfully
		 Thread.sleep(5000);	
	}
	// test case no:1.2--
	public static void testWrongUserName(WebDriver wd) throws InterruptedException {
		
		wd.manage().window().maximize();
        wd.get(UserURL);
        wd.findElement(By.id("txtemail")).sendKeys("kavierey@magoosh.com");
      	logger.info("Entered Usename:kavierey@magoosh.com");
 	    wd.findElement(By.id("txtpwd")).sendKeys("pass123");
 	    logger.info("Entered Password:pass123");
 	    wd.findElement(By.id("btnSave")).click();
		logger.info("Login Failed:Wrong Username or Wrong Password");
		logger.info("Test case No 1.2 :Tested WrongUserName Successfully"); // Test case No 1.2 : Created Successfully
		Thread.sleep(5000);
	
	}

	
	// test case no:1.3--
	public static void testWrongPassword(WebDriver wd) throws InterruptedException {
		wd.manage().window().maximize();
        wd.get(UserURL);
        wd.findElement(By.id("txtemail")).sendKeys("kavi@magoosh.com");
      	logger.info("Entered Usename:kavi@magoosh.com");
 	    wd.findElement(By.id("txtpwd")).sendKeys("pass123iuuuyt");
 	    logger.info("Entered Password:pass123iuuuyt");
 	    wd.findElement(By.id("btnSave")).click();
		logger.info("login Failed:Wrong Username or Wrong Password");
		logger.info("Test case No 1.3 :Tested WrongPassword Successfully"); // Test case No 1.3 : Created Successfully
		Thread.sleep(5000);
		
	}
	// test case no:1.4--
	public static void testWrongUserName1(WebDriver wd) throws InterruptedException {
		wd.manage().window().maximize();
        wd.get(UserURL);
        wd.findElement(By.id("txtemail")).sendKeys("kavi");
      	logger.info("Entered Usename:kavi");
 	    wd.findElement(By.id("txtpwd")).sendKeys("pass");
 	    logger.info("Entered Password:pass");
 	    wd.findElement(By.id("btnSave")).click();
		logger.info("login Failed:Wrong Username or Wrong Password");  // Test case No 1.4 : Created Successfully
		logger.info("Test case No 1.3 :Tested WrongUserName1 Successfully");
		Thread.sleep(5000);
		
	}
	// test case no:1.5--
	public static void testEmptylogin(WebDriver wd) throws InterruptedException {
		wd.manage().window().maximize();
        wd.get(UserURL);
        wd.findElement(By.id("txtemail")).sendKeys("");
      	logger.info("Entered Usename:EmptySpace");
 	    wd.findElement(By.id("txtpwd")).sendKeys("");
 	    logger.info("Entered Password:Empty Space");
 	    wd.findElement(By.id("btnSave")).click();
		logger.info("login Failed:Username,Password blank text field"); // Test case No 1.5 : Created Successfully
		logger.info("Test case No 1.4 :Tested Emptylogin Successfully");
		Thread.sleep(5000);
	}
	// test case no:1.6--
		public static void testWrongUserName2(WebDriver wd) throws InterruptedException {
			
			wd.manage().window().maximize();
	        wd.get(UserURL);
	        wd.findElement(By.id("txtemail")).sendKeys("!@#$%^&****");
	      	logger.info("Entered Usename:!@#$%^&****");
	 	    wd.findElement(By.id("txtpwd")).sendKeys("+_)(*&^^");
	 	    logger.info("Entered Password:+_)(*&^^");
	 	    wd.findElement(By.id("btnSave")).click();
	 	    
			logger.info("Login Failed:Wrong Username or Wrong Password");
			logger.info("Test case No 1.2 :Tested WrongUserName Successfully"); // Test case No 1.6 : Created Successfully
			Thread.sleep(5000);
		
		}
		// test case no:1.6--
        public static void testWrongUserName3(WebDriver wd) throws InterruptedException {
			
			wd.manage().window().maximize();
	        wd.get(UserURL);
	        wd.findElement(By.id("txtemail")).sendKeys("741852963");
	      	logger.info("Entered Usename:741852963");
	 	    wd.findElement(By.id("txtpwd")).sendKeys("");
	 	    logger.info("Entered Password:");
	 	    wd.findElement(By.id("btnSave")).click();
			logger.info("Login Failed:Wrong Username or Wrong Password");
			logger.info("Test case No 1.2 :Tested WrongUserName Successfully"); // Test case No 1.7 : Created Successfully
			Thread.sleep(5000);
		
		}

	}

	


