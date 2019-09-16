package main.java.user2;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestDashboardPage {
	 final static Logger logger = Logger.getLogger(TestDashboardPage.class);
	 final static String UserURL = TestMain.HOSTNAME + "lccrm/lccrmUI/common/dashboard.php";

	public static void testdashboard(WebDriver wd) throws InterruptedException {
		
          testPositiveCase(wd);       //With Data Entering
	}
		public static void testPositiveCase(WebDriver wd) throws InterruptedException {

			wd.get(UserURL);
     	    wd.manage().window().maximize();
	        logger.info("Entered To Dashboard Page");
	 	
	 		wd.findElement(By.xpath("//*[@id=\"scLeadEditReqTable\"]/tbody/tr[1]")).click();
	 	    logger.info("Click");
			wd.findElement(By.id("txtFirstName")).clear();
            wd.findElement(By.id("txtFirstName")).sendKeys("Nathan");
        	logger.info("Entered Firstname:Nathan");
        	wd.findElement(By.id("txtMiddleName")).clear();
			wd.findElement(By.id("txtMiddleName")).sendKeys("a");
			logger.info("Entered middlename:as");
			wd.findElement(By.id("txtLastName")).clear();
			wd.findElement(By.id("txtLastName")).sendKeys("A");
			logger.info("Entered lastname:A");
			
			WebElement selectDate = wd.findElement(By.id("dtDOB"));
			selectDate.clear();
			selectDate.sendKeys("08-05-1985");
			logger.info("DOB Date Entered:08-05-1995");
			
			wd.findElement(By.xpath("//div[@class='form-check form-check-radio']//label[1]")).click();
			logger.info("Selected by :Male");
			wd.findElement(By.id("txtParentGuardianName")).clear();
			wd.findElement(By.id("txtParentGuardianName")).sendKeys("Arun");
			logger.info("Entered parentguardianname:Arun");
			wd.findElement(By.id("address")).clear();
			wd.findElement(By.id("address")).sendKeys("Chennai");
			logger.info("Entered address:Chennai");
			wd.findElement(By.id("city")).clear();
			wd.findElement(By.id("city")).sendKeys("Chennai");
			logger.info("Entered city:Chennai");
			wd.findElement(By.id("state")).clear();
			wd.findElement(By.id("state")).sendKeys("Tamilnadu");
			logger.info("Entered state:Tamilnadu");
			
			wd.findElement(By.id("pincode")).sendKeys("630205");
			logger.info("Entered pincode:630205");
			
			wd.findElement(By.id("landline")).sendKeys("22336655");
			logger.info("Entered landline:22336655");
			
			wd.findElement(By.id("mobilenumber")).sendKeys("9876543210");
			logger.info("Entered mobilenumber:9876543210");
			
			wd.findElement(By.id("email")).sendKeys("nathan@ymail.com");
			logger.info("Entered email:nathan@ymail.com");
			
			wd.findElement(By.id("txtParentsEmail")).sendKeys("joe@gmail.com");
			logger.info("Entered ParentsEmail:joe@gmail.com");
			
			Select dd = new Select(wd.findElement(By.id("selCurrentEducationStatus")));
			dd.selectByIndex(4);
		    logger.info("CurrentEducationStatus Entered:UG-1st Year");
			
			Select dd1 = new Select(wd.findElement(By.id("selAnnualIncome")));
			dd1.selectByIndex(1);
			logger.info("AnnualIncome Entered:Less than 10000000");
			
			wd.findElement(By.id("institutionname")).sendKeys("AVC College");
			logger.info("Entered institutionname:AVC College");
			
			Select dd2 = new Select(wd.findElement(By.id("selStreamofEducation")));
			dd2.selectByIndex(1);
			logger.info("StreamofEducation Entered:ECE");
			
			Select dropdown3 = new Select(wd.findElement(By.id("selTypeofIndustry")));
			dropdown3.selectByIndex(1);
			
           logger.info("Selected by :Finance");
			
			wd.findElement(By.id("WorkExperience")).sendKeys("5");
	        logger.info("Selected by :5");
			
			wd.findElement(By.id("companyname")).sendKeys("suspl");
			logger.info("Entered companyname:suspl");
			
			//courses
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[1]")).click();
	        logger.info("Selected by :GRE");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[2]")).click();
	        logger.info("Selected by :GMAT");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[3]")).click();
	        logger.info("Selected by :SAT");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[4]")).click();
	        logger.info("Selected by :ACT");
		
				//country
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[1]")).click();
	        logger.info("Selected by :US");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[2]")).click();
	        logger.info("Selected by :CANADA");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[3]")).click();
	        logger.info("Selected by :UK");
			
			//Know about us
            wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[1]//label[1]")).click();
			logger.info("Selected by :Flyers");
            
            wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[3]//label[1]")).click();
			logger.info("Selected by :Internet");
            
            wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[4]//label[1]")).click();
			logger.info("Selected by :Socialnet");
            
            wd.findElement(By.xpath("//div[@class='col-sm-5']//div[1]//label[1]")).click();
			logger.info("Selected by :Friends");
            
            wd.findElement(By.xpath("//div[@class='col-sm-5']//div[4]//label[1]")).click();
			logger.info("Selected by :Email From Magoosh");
			
			wd.findElement(By.id("txtAddFriendName1")).sendKeys("Joe");
			logger.info("Entered AddFriendName1:Joe");
			
			wd.findElement(By.id("txtAddFriendMobile1")).sendKeys("8956230147");
			logger.info("Entered AddFriendMobile1:8956230147");
			
			wd.findElement(By.id("txtAddFriendEmail1")).sendKeys("joe@gmail.com");
			logger.info("Entered AddFriendEmail1:joe@gmail.com");
			
			wd.findElement(By.id("txtAddFriendName2")).sendKeys("Arun");
			logger.info("Entered AddFriendName2:arun");
			
			wd.findElement(By.id("txtAddFriendMobile2")).sendKeys("8787895456");
			logger.info("Entered AddFriendMobile2:8787895456");
			
			wd.findElement(By.id("txtAddFriendEmail2")).sendKeys("yyy@gmail.com");
			logger.info("Entered AddFriendEmail2:yyy@gmail.com");
			
			wd.findElement(By.id("txtAddFriendName3")).sendKeys("Vijay");
			logger.info("Entered AddFriendName3:Vijay");
			
			wd.findElement(By.id("txtAddFriendMobile3")).sendKeys("9876543210");
			logger.info("Entered AddFriendMobile3:9876543210");
			
			wd.findElement(By.id("txtAddFriendEmail3")).sendKeys("wer@gmail.com");
			logger.info("Entered AddFriendEmail3:wer@gmail.com");
			
			wd.findElement(By.id("txtAddFriendName4")).sendKeys("Kumar");
			logger.info("Entered AddFriendName4:Kumar");
			
			wd.findElement(By.id("txtAddFriendMobile4")).sendKeys("9500236541");
			logger.info("Entered AddFriendMobile4:9500236541");
			
			wd.findElement(By.id("txtAddFriendEmail4")).sendKeys("asd@gmail.com");
			logger.info("Entered AddFriendEmail4:asd@gmail.com");
			
			Select dd3 = new Select(wd.findElement(By.id("selCourseEstimatedStart")));
			dd3.selectByIndex(2);
			logger.info("CourseEstimatedStart Entered:Within 1 to 4 weeks");
			
			Select dd4 = new Select(wd.findElement(By.id("selClassSchedulePref")));
			dd4.selectByIndex(2);
			logger.info("ClassSchedulePref Entered:Weekends");
			
			Select dd5 = new Select(wd.findElement(By.id("selHasMagooshAccount")));
			dd5.selectByIndex(1);
			logger.info("HasMagooshAccount Entered:YES");
			
            wd.findElement(By.xpath("//div[@class='col-sm-12']//div[1]//label[1]")).click();
			logger.info("Selected by :Telephone");
			
			wd.findElement(By.xpath("//div[@class='col-sm-12']//div[5]//label[1]")).click();
			logger.info("Selected by :Student Refernce");
			  
            wd.findElement(By.id("btnSave")).click();
			logger.info(" Save Data Sucessfully :  Entered Valid  Data");
			logger.info(" Test case No 1 : Positive Data Created Sucessfully");
			Thread.sleep(5000);
			
			
		
	}


}
