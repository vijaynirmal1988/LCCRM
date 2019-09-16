package main.java.user2;
    import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class TestUpdateEmployee {
		
		final static Logger logger = Logger.getLogger(TestUpdateEmployee.class);
		final static String UserURL = TestMain.HOSTNAME + "/lccrm/lccrmUI/employee/employeeList.php";
	    
		public static void testUpdateEmployee(WebDriver wd) throws InterruptedException {
			
	          testPositiveCase(wd);       //With Data Entering
	        //  testNegativeCase(wd);       //With Wrong Data Entering
	       //   testNegativeCase1(wd);       //With Wrong Data Entering
	       //   testNegativeCase2(wd);       //With Empty Data
	          
	       }

		public static void testPositiveCase(WebDriver wd) throws InterruptedException {

			wd.manage().window().maximize();
	        wd.get(UserURL);
	    	logger.info("Entered to EmployeePage"); 
	    	wd.findElement(By.xpath("//a[@id='txtleadID1001']")).click();
			logger.info("Entered to  Edit Employee");
			 wd.findElement(By.name("FirstName")).sendKeys("Arun");
		    	logger.info("Entered Firstname:Arun");
			    wd.findElement(By.name("LastName")).sendKeys("Jai");
				logger.info("Entered Lastname:Jai");
//				wd.findElement(By.name("FullName")).sendKeys("ArunJai");
//				logger.info("Entered full name:ArunJai");
				WebElement selectDate = wd.findElement(By.id("dtDOB"));
				selectDate.clear();
				selectDate.sendKeys("01/05/1997");
				logger.info("Entered DOB:01/05/1997");
				wd.findElement(By.name("FatherName")).sendKeys("Kumar");
				logger.info("Entered Fathername:as");
				wd.findElement(By.name("SpouseName")).sendKeys("Lakshmi");
				logger.info("Entered middlename:Kumar");
				wd.findElement(By.id("txtAddress")).sendKeys("OMR");
				logger.info("Entered Address:OMR");
				wd.findElement(By.id("txtEmail")).sendKeys("arunjai@ymail.com");
				logger.info("Entered email:arunjai@ymail.com");
				wd.findElement(By.id("txtCity")).sendKeys("Chennai");
				logger.info("Entered City:Chennai");
				wd.findElement(By.id("txtState")).sendKeys("Tamilnadu");
				logger.info("Entered State:Tamilnadu");
				wd.findElement(By.id("txtPincode")).sendKeys("600095");
				logger.info("Entered Postal Code:600095");
				Select dropdown1 = new Select(wd.findElement(By.name("Department")));
				dropdown1.selectByVisibleText("Sales");
				logger.info("Entered department:Sales");
				Select dropdown2 = new Select(wd.findElement(By.name("BusinessTitle")));
				dropdown2.selectByVisibleText("CenterManager");
				logger.info("Entered Bussinesstitle:Center Manager");
				Select dropdown4 = new Select(wd.findElement(By.name("CenterName")));
				dropdown4.selectByVisibleText("Adyar");
				logger.info("Entered CenterName:Adyar");
				wd.findElement(By.id("txtMobileNo")).sendKeys("9876543210");
				logger.info("Entered MobileNo:9876543210");
				wd.findElement(By.id("txtAnotherContactNo")).sendKeys("8978456521");
				logger.info("Entered AnotherContactNo:8978456521");
				WebElement selectDate1 = wd.findElement(By.id("dtJoiningdate"));
				selectDate1.clear();
				selectDate1.sendKeys("08-05-2015");
				logger.info("Entered Joiningdate:08-05-2015");
			Select dropdown3 = new Select(wd.findElement(By.name("Active")));
			dropdown3.selectByVisibleText("No");
			logger.info("Entered Active:NO");
			WebElement selectDate2 = wd.findElement(By.id("dtResignationDate"));
			selectDate2.clear();
			selectDate2.sendKeys("08-05-2012");
			logger.info("Entered ResignationDate:08-05-2012");
			WebElement selectDate3 = wd.findElement(By.id("dtLeavingDate"));
			selectDate3.clear();
			selectDate3.sendKeys("08-06-2012");
			logger.info("Entered LeavingDate:08-06-2012");
			wd.findElement(By.id("submit")).click();
			logger.info("Employee Data Save Sucessfully");
			logger.info("Test case No 2 : Positive Data Created Sucessfully");
			Thread.sleep(5000);
			
	}
		public static void testNegativeCase(WebDriver wd) throws InterruptedException {

			wd.manage().window().maximize();
	        wd.get(UserURL);
	    	logger.info("Entered to EmployeePage"); 
	    	wd.findElement(By.xpath("//a[@id='txtleadID1001']")).click();
			logger.info("Entered to  Add Employee");
	        wd.findElement(By.name("FirstName")).sendKeys("!@#$%^^&*(");
	    	logger.info("Entered Firstname:!@#$%^^&*(");
		    wd.findElement(By.name("LastName")).sendKeys("!@#$%^^&*(");
			logger.info("Entered Lastname:!@#$%^^&*(");
			wd.findElement(By.name("FullName")).sendKeys("!@#$%^^&*(");
			logger.info("Entered full name:!@#$%^^&*(");
			WebElement selectDate = wd.findElement(By.id("dtDOB"));
			selectDate.clear();
			selectDate.sendKeys("!@#$%^^&*(");
			logger.info("Entered DOB:!@#$%^^&*(");
			wd.findElement(By.name("FatherName")).sendKeys("!@#$%^^&*(");
			logger.info("Entered Fathername:!@#$%^^&*(");
			wd.findElement(By.name("SpouseName")).sendKeys("!@#$%^^&*(");
			logger.info("Entered Spousename:!@#$%^^&*(");
			wd.findElement(By.id("txtAddress")).sendKeys("!@#$%^^&*(");
			logger.info("Entered Address:!@#$%^^&*(");
			wd.findElement(By.id("txtCity")).sendKeys("!@#$%^^&*(");
			logger.info("Entered City:!@#$%^^&*(");
			wd.findElement(By.id("txtCountry")).sendKeys("!@#$%^^&*(");
			logger.info("Entered Contry:!@#$%^^&*(");
			wd.findElement(By.id("txtPostalCode")).sendKeys("!@#$%^^&*(");
			logger.info("Entered Postal Code:!@#$%^^&*(");
			Select dropdown1 = new Select(wd.findElement(By.id("seldepartment")));
			dropdown1.selectByIndex(0);
			logger.info("Entered department:");
			Select dropdown2 = new Select(wd.findElement(By.name("BusinessTitle")));
			dropdown2.selectByVisibleText("");
			logger.info("Entered Bussinesstitle:");
			wd.findElement(By.name("MobileNo")).sendKeys("!@#$%^^&*(");
			logger.info("Entered MobileNo:!@#$%^^&*(");
			wd.findElement(By.name("HomeNumber")).sendKeys("!@#$%^^&*(");
			logger.info("Entered HomeNumber:!@#$%^^&*(");
			WebElement selectDate1 = wd.findElement(By.id("dtJoiningdate"));
			selectDate1.clear();
			selectDate1.sendKeys("08-05-2012");
			logger.info("Entered Joiningdate:");
			Select dropdown3 = new Select(wd.findElement(By.name("Active")));
			dropdown3.selectByVisibleText("NO");
			logger.info("Entered Active:NO");
			WebElement selectDate2 = wd.findElement(By.id("dtResignationDate"));
			selectDate2.clear();
			selectDate2.sendKeys("08-05-2012");
			logger.info("Entered ResignationDate:");
			WebElement selectDate3 = wd.findElement(By.id("dtLeavingDate"));
			selectDate3.clear();
			selectDate3.sendKeys("08-05-2012");
			logger.info("Entered LeavingDate:");
			wd.findElement(By.id("submit")).click();
			logger.info("Entered Valid Data");
			logger.info("Test case No 2 : Negative Data Created Sucessfully");
			Thread.sleep(5000);
			
	}
		public static void testNegativeCase1(WebDriver wd) throws InterruptedException {

			wd.manage().window().maximize();
	        wd.get(UserURL);
	    	logger.info("Entered to EmployeePage"); 
	    	wd.findElement(By.xpath("//a[@id='txtleadID1001']")).click();
			logger.info("Entered to  Add Employee");
	        wd.findElement(By.name("FirstName")).sendKeys("789654");
	    	logger.info("Entered Firstname:789654");
		    wd.findElement(By.name("LastName")).sendKeys("789654");
			logger.info("Entered Lastname:789654");
			wd.findElement(By.name("FullName")).sendKeys("789654");
			logger.info("Entered full name:789654");
			WebElement selectDate = wd.findElement(By.id("dtDOB"));
			selectDate.clear();
			selectDate.sendKeys("789654000");
			logger.info("Entered DOB:789654000");
			wd.findElement(By.name("FatherName")).sendKeys("789654000");
			logger.info("Entered Fathername:789654000");
			wd.findElement(By.name("SpouseName")).sendKeys("789654000");
			logger.info("Entered SpouseName:789654000");
			wd.findElement(By.id("txtAddress")).sendKeys("789654000");
			logger.info("Entered Address:789654000");
			wd.findElement(By.id("txtCity")).sendKeys("789654000");
			logger.info("Entered City:789654000");
			wd.findElement(By.id("txtCountry")).sendKeys("789654000");
			logger.info("Entered Contry:789654000");
			wd.findElement(By.id("txtPostalCode")).sendKeys("789654000");
			logger.info("Entered Postal Code:789654000");
			Select dropdown1 = new Select(wd.findElement(By.id("seldepartment")));
			dropdown1.selectByIndex(0);
			logger.info("Entered department:");
			Select dropdown2 = new Select(wd.findElement(By.name("BusinessTitle")));
			dropdown2.selectByVisibleText("");
			logger.info("Entered Bussinesstitle:");
			wd.findElement(By.name("MobileNo")).sendKeys("asdfghjk");
			logger.info("Entered MobileNo:asdfghjk");
			wd.findElement(By.name("HomeNumber")).sendKeys("asdfghjk");
			logger.info("Entered HomeNumber:asdfghjk");
			WebElement selectDate1 = wd.findElement(By.id("dtJoiningdate"));
			selectDate1.clear();
			selectDate1.sendKeys("123456789");
			logger.info("Entered Joiningdate:123456789");
			Select dropdown3 = new Select(wd.findElement(By.name("Active")));
			dropdown3.selectByVisibleText("NO");
			logger.info("Entered Active:NO");
			WebElement selectDate2 = wd.findElement(By.id("dtResignationDate"));
			selectDate2.clear();
			selectDate2.sendKeys("qwertyui");
			logger.info("Entered ResignationDate:qwertyui");
			WebElement selectDate3 = wd.findElement(By.id("dtLeavingDate"));
			selectDate3.clear();
			selectDate3.sendKeys("123456789");
			logger.info("Entered LeavingDate:123456789");
			wd.findElement(By.id("submit")).click();
			logger.info("Entered Valid Data");
			logger.info("Test case No 2 : Negative Data Created Sucessfully");
			Thread.sleep(5000);
			
	}
		public static void testNegativeCase2(WebDriver wd) throws InterruptedException {

			wd.manage().window().maximize();
	        wd.get(UserURL);
	    	logger.info("Entered to EmployeePage"); 
	    	wd.findElement(By.xpath("//a[@id='txtleadID1001']")).click();
			logger.info("Entered to  Add Employee");
	        wd.findElement(By.name("FirstName")).sendKeys("");
	    	logger.info("Entered Firstname:");
		    wd.findElement(By.name("LastName")).sendKeys("");
			logger.info("Entered Lastname:");
			wd.findElement(By.name("FullName")).sendKeys("");
			logger.info("Entered full name:");
			WebElement selectDate = wd.findElement(By.id("dtDOB"));
			selectDate.clear();
			selectDate.sendKeys("");
			logger.info("Entered DOB:");
			wd.findElement(By.name("FatherName")).sendKeys("");
			logger.info("Entered Fathername:");
			wd.findElement(By.name("SpouseName")).sendKeys("");
			logger.info("Entered SpouseName:");
			wd.findElement(By.id("txtAddress")).sendKeys("");
			logger.info("Entered Address:");
			wd.findElement(By.id("txtCity")).sendKeys("");
			logger.info("Entered City:");
			wd.findElement(By.id("txtCountry")).sendKeys("");
			logger.info("Entered Contry:");
			wd.findElement(By.id("txtPostalCode")).sendKeys("");
			logger.info("Entered Postal Code:");
			Select dropdown1 = new Select(wd.findElement(By.id("seldepartment")));
			dropdown1.selectByIndex(0);
			logger.info("Entered department:");
			Select dropdown2 = new Select(wd.findElement(By.name("BusinessTitle")));
			dropdown2.selectByVisibleText("");
			logger.info("Entered Bussinesstitle:");
			wd.findElement(By.name("MobileNo")).sendKeys("");
			logger.info("Entered MobileNo:");
			wd.findElement(By.name("HomeNumber")).sendKeys("");
			logger.info("Entered HomeNumber:");
			WebElement selectDate1 = wd.findElement(By.id("dtJoiningdate"));
			selectDate1.clear();
			selectDate1.sendKeys("");
			logger.info("Entered Joiningdate:08-05-2010");
			Select dropdown3 = new Select(wd.findElement(By.name("Active")));
			dropdown3.selectByVisibleText("NO");
			logger.info("Entered Active:NO");
			WebElement selectDate2 = wd.findElement(By.id("dtResignationDate"));
			selectDate2.clear();
			selectDate2.sendKeys("");
			logger.info("Entered ResignationDate:");
			WebElement selectDate3 = wd.findElement(By.id("dtLeavingDate"));
			selectDate3.clear();
			selectDate3.sendKeys("");
			logger.info("Entered LeavingDate:");
			wd.findElement(By.id("submit")).click();
			logger.info("Entered Valid Data");
			logger.info("Test case No 2 : Negative Data Created Sucessfully");
			Thread.sleep(5000);
			
	}
	}


