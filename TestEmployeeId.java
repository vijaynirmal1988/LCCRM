package main.java.user2;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestEmployeeId {
	
	final static Logger logger = Logger.getLogger(TestEmployeeId.class);
	final static String UserURL = TestMain.HOSTNAME + "/lccrm/lccrmUI/employee/employeeList.php";
    
	public static void testemployeeId(WebDriver wd) throws InterruptedException {
		
          testPositiveCase(wd);       //With Data Entering
        //  testNegativeCase(wd);       //With Wrong Data Entering
       //   testNegativeCase1(wd);       //With Wrong Data Entering
       //   testNegativeCase2(wd);       //With Empty Data
          
       }

	public static void testPositiveCase(WebDriver wd) throws InterruptedException {

		wd.manage().window().maximize();
		 
        wd.get(UserURL);
    	logger.info("Entered to EmployeePage"); 
    	wd.findElement(By.id("btnAddProfile")).click();
		logger.info("Entered to  Add Employee");
        wd.findElement(By.name("FirstName")).sendKeys("Arun");
    	logger.info("Entered Firstname:Arun");
	    wd.findElement(By.name("LastName")).sendKeys("Jai");
		logger.info("Entered Lastname:Jai");
        WebElement Date = wd.findElement(By.xpath("//input[@id='dtDOB']"));
		Date.clear();
	    Date.sendKeys("08-05-1995");
		logger.info("Entered DOB:08-05-1995");
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
		Select dropdown1 = new Select(wd.findElement(By.xpath("//select[@id='selDepartment']")));
		dropdown1.selectByIndex(2);
		logger.info("Entered department:Sales");
		Select dropdown2 = new Select(wd.findElement(By.name("BusinessTitle")));
		dropdown2.selectByVisibleText("Center Manager");
		logger.info("Entered Bussinesstitle:Center Manager");
		Select dropdown4 = new Select(wd.findElement(By.name("CenterName")));
		dropdown4.selectByVisibleText("Adyar");
		logger.info("Entered CenterName:Adyar");
		wd.findElement(By.id("txtMobileNo")).sendKeys("9876543210");
		logger.info("Entered MobileNo:9876543210");
		wd.findElement(By.id("txtAnotherContactNo")).sendKeys("8978456521");
		logger.info("Entered AnotherContactNo:8978456521");
		WebElement selectDate1 = wd.findElement(By.id("dtJoiningDate"));
		selectDate1.clear();
		selectDate1.sendKeys("08-05-2015");
		logger.info("Entered Joiningdate:08-05-2015");
		Select dropdown3 = new Select(wd.findElement(By.name("Active")));
		dropdown3.selectByVisibleText("Yes");
		logger.info("Entered Active:Yes");

		wd.findElement(By.id("submit")).click();
		logger.info("Employee Data Save Sucessfully");
		logger.info("Test case No 2 : Positive Data Created Sucessfully");
		Thread.sleep(5000);
		
}
	public static void testNegativeCase(WebDriver wd) throws InterruptedException {

		wd.manage().window().maximize();
        wd.get(UserURL);
    	logger.info("Entered to EmployeePage"); 
    	wd.findElement(By.id("btnAddProfile")).click();
		logger.info("Entered to  Add Employee");
        wd.findElement(By.name("FirstName")).sendKeys("!@#$%^^&*(");
    	logger.info("Entered Firstname:!@#$%^^&*(");
	    wd.findElement(By.name("LastName")).sendKeys("!@#$%^^&*(");
		logger.info("Entered Lastname:!@#$%^^&*(");
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
		wd.findElement(By.id("txtEmail")).sendKeys("!@#$%^^&*(");
		logger.info("Entered email:!@#$%^^&*(");
		wd.findElement(By.id("txtCity")).sendKeys("!@#$%^^&*(");
		logger.info("Entered City:!@#$%^^&*(");
		wd.findElement(By.id("txtState")).sendKeys("!@#$%^^&*(");
		logger.info("Entered State:!@#$%^^&*(");
		wd.findElement(By.id("txtPincode")).sendKeys("!@#$%^^&*(");
		logger.info("Entered Postal Code:!@#$%^^&*(");
		Select dropdown1 = new Select(wd.findElement(By.xpath("//select[@id='selDepartment']")));
		dropdown1.selectByIndex(0);
		logger.info("Entered department:");
		Select dropdown2 = new Select(wd.findElement(By.name("BusinessTitle")));
		dropdown2.selectByVisibleText("");
		logger.info("Entered Bussinesstitle:");
		Select dropdown4 = new Select(wd.findElement(By.name("CenterName")));
		dropdown4.selectByVisibleText("0");
		logger.info("Entered CenterName:");
		wd.findElement(By.name("MobileNo")).sendKeys("!@#$%^^&*(");
		logger.info("Entered MobileNo:!@#$%^^&*(");
		wd.findElement(By.id("txtAnotherContactNo")).sendKeys("!@#$%^^&*(");
		logger.info("Entered AnotherContactNo:!@#$%^^&*(");
		WebElement selectDate1 = wd.findElement(By.id("dtJoiningdate"));
		selectDate1.clear();
		selectDate1.sendKeys("08-05-2012");
		logger.info("Entered Joiningdate:");
		Select dropdown3 = new Select(wd.findElement(By.name("Active")));
		dropdown3.selectByVisibleText("");
		logger.info("Entered Active:");
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
    	wd.findElement(By.id("btnAddProfile")).click();
		logger.info("Entered to  Add Employee");
        wd.findElement(By.name("FirstName")).sendKeys("123456789");
    	logger.info("Entered Firstname:123456789");
	    wd.findElement(By.name("LastName")).sendKeys("123456789");
		logger.info("Entered Lastname:123456789");
        WebElement selectDate = wd.findElement(By.id("dtDOB"));
		selectDate.clear();
		selectDate.sendKeys("123456789");
		logger.info("Entered DOB:123456789");
		wd.findElement(By.name("FatherName")).sendKeys("123456789");
		logger.info("Entered Fathername:123456789");
		wd.findElement(By.name("SpouseName")).sendKeys("123456789");
		logger.info("Entered Spousename:123456789");
		wd.findElement(By.id("txtAddress")).sendKeys("123456789");
		logger.info("Entered Address:123456789");
		wd.findElement(By.id("txtEmail")).sendKeys("123456789");
		logger.info("Entered email:123456789");
		wd.findElement(By.id("txtCity")).sendKeys("123456789");
		logger.info("Entered City:123456789");
		wd.findElement(By.id("txtState")).sendKeys("123456789");
		logger.info("Entered State:123456789");
		wd.findElement(By.id("txtPincode")).sendKeys("123456789");
		logger.info("Entered Postal Code:123456789");
		Select dropdown1 = new Select(wd.findElement(By.xpath("//select[@id='selDepartment']")));
		dropdown1.selectByIndex(0);
		logger.info("Entered department:");
		Select dropdown2 = new Select(wd.findElement(By.name("BusinessTitle")));
		dropdown2.selectByVisibleText("");
		logger.info("Entered Bussinesstitle:");
		Select dropdown4 = new Select(wd.findElement(By.name("CenterName")));
		dropdown4.selectByVisibleText("0");
		logger.info("Entered CenterName:");
		wd.findElement(By.name("MobileNo")).sendKeys("123456789");
		logger.info("Entered MobileNo:123456789");
		wd.findElement(By.id("txtAnotherContactNo")).sendKeys("123456789");
		logger.info("Entered AnotherContactNo:123456789");
		WebElement selectDate1 = wd.findElement(By.id("dtJoiningdate"));
		selectDate1.clear();
		selectDate1.sendKeys("08-05-2012");
		logger.info("Entered Joiningdate:");
		Select dropdown3 = new Select(wd.findElement(By.name("Active")));
		dropdown3.selectByVisibleText("NO");
		logger.info("Entered Active:NO");
		WebElement selectDate2 = wd.findElement(By.id("dtResignationDate"));
		selectDate2.clear();
		selectDate2.sendKeys("");
		logger.info("Entered ResignationDate:");
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
    	wd.findElement(By.id("btnAddProfile")).click();
		logger.info("Entered to  Add Employee");
        wd.findElement(By.name("FirstName")).sendKeys("");
    	logger.info("Entered Firstname:");
	    wd.findElement(By.name("LastName")).sendKeys("");
		logger.info("Entered Lastname:");
        WebElement selectDate = wd.findElement(By.id("dtDOB"));
		selectDate.clear();
		selectDate.sendKeys("");
		logger.info("Entered DOB:");
		wd.findElement(By.name("FatherName")).sendKeys("");
		logger.info("Entered Fathername:");
		wd.findElement(By.name("SpouseName")).sendKeys("");
		logger.info("Entered Spousename:");
		wd.findElement(By.id("txtAddress")).sendKeys("");
		logger.info("Entered Address:");
		wd.findElement(By.id("txtEmail")).sendKeys("");
		logger.info("Entered email:");
		wd.findElement(By.id("txtCity")).sendKeys("");
		logger.info("Entered City:");
		wd.findElement(By.id("txtState")).sendKeys("");
		logger.info("Entered State:");
		wd.findElement(By.id("txtPincode")).sendKeys("");
		logger.info("Entered Postal Code:");
		Select dropdown1 = new Select(wd.findElement(By.xpath("//select[@id='selDepartment']")));
		dropdown1.selectByIndex(0);
		logger.info("Entered department:");
		Select dropdown2 = new Select(wd.findElement(By.name("BusinessTitle")));
		dropdown2.selectByVisibleText("");
		logger.info("Entered Bussinesstitle:");
		Select dropdown4 = new Select(wd.findElement(By.name("CenterName")));
		dropdown4.selectByVisibleText("0");
		logger.info("Entered CenterName:");
		wd.findElement(By.name("MobileNo")).sendKeys("!@#$%^^&*(");
		logger.info("Entered MobileNo:!@#$%^^&*(");
		wd.findElement(By.id("txtAnotherContactNo")).sendKeys("");
		logger.info("Entered AnotherContactNo:");
		WebElement selectDate1 = wd.findElement(By.id("dtJoiningdate"));
		selectDate1.clear();
		selectDate1.sendKeys("08-05-2012");
		logger.info("Entered Joiningdate:");
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