package main.java.user2;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestNewLead {
	 final static Logger logger = Logger.getLogger(TestNewLead.class);
	 final static String UserURL = TestMain.HOSTNAME + "/lccrm/lccrmUI/leads/newlead.php";

	public static void testnewlead(WebDriver wd) throws InterruptedException {
		
          testPositiveCase(wd);       //With Data Entering
          //  testNegativeCase(wd);       //Empty Data 
         // testNegativeCase1(wd);       //Wrong Data Entering
        //  testNegativeCase2(wd);        //Wrong Data Entering
	}
		
		
	
		public static void testPositiveCase(WebDriver wd) throws InterruptedException {

			wd.get(UserURL);
     	    wd.manage().window().maximize();
	      	
//	 	
//	 		WebElement newtap= wd.findElement(By.partialLinkText("Leads"));
//	 	    newtap.click();
//	 	    logger.info("Click to Entered Leads ");
//	 	    wd.findElement(By.xpath("//div[@id='pages']//a[@class='nav-link']")).click();
	 	    logger.info("Click to Entered Add New Leads page");
			wd.findElement(By.name("firstname")).sendKeys("Nathan");
        	logger.info("Entered Firstname:Nathan");
			
			wd.findElement(By.name("middlename")).sendKeys("as");
			logger.info("Entered middlename:as");
			
			wd.findElement(By.name("lastname")).sendKeys("A");
			logger.info("Entered lastname:A");
			
			WebElement selectDate = wd.findElement(By.id("dtDOB"));
			selectDate.clear();
			selectDate.sendKeys("08-05-1985");
			logger.info("DOB Date Entered:08-05-1995");
			
			wd.findElement(By.xpath("//div[@class='form-check form-check-radio']//label[1]")).click();
			logger.info("Selected by :Male");
			
			wd.findElement(By.name("parentguardianname")).sendKeys("Arun");
			logger.info("Entered parentguardianname:Arun");
			
			wd.findElement(By.name("address")).sendKeys("Chennai");
			logger.info("Entered address:Chennai");
			
			wd.findElement(By.name("city")).sendKeys("Chennai");
			logger.info("Entered city:Chennai");
			
			wd.findElement(By.name("state")).sendKeys("Tamilnadu");
			logger.info("Entered state:Tamilnadu");
			
			wd.findElement(By.name("pincode")).sendKeys("630205");
			logger.info("Entered pincode:630205");
			
			wd.findElement(By.name("landline")).sendKeys("22336655");
			logger.info("Entered landline:22336655");
			
			wd.findElement(By.name("mobilenumber")).sendKeys("9876543210");
			logger.info("Entered mobilenumber:9876543210");
			
			wd.findElement(By.name("email")).sendKeys("nathan@ymail.com");
			logger.info("Entered email:nathan@ymail.com");
			
			wd.findElement(By.id("txtParentsEmail")).sendKeys("joe@gmail.com");
			logger.info("Entered ParentsEmail:joe@gmail.com");
			
			Select dd = new Select(wd.findElement(By.id("selCurrentEducationStatus")));
			dd.selectByIndex(4);
		    logger.info("CurrentEducationStatus Entered:UG-1st Year");
			
			Select dd1 = new Select(wd.findElement(By.id("selAnnualIncome")));
			dd1.selectByIndex(1);
			logger.info("AnnualIncome Entered:Less than 10000000");
			
			wd.findElement(By.name("institutionname")).sendKeys("AVC College");
			logger.info("Entered institutionname:AVC College");
			
			Select dd2 = new Select(wd.findElement(By.id("selStreamofEducation")));
			dd2.selectByIndex(1);
			logger.info("StreamofEducation Entered:ECE");
			
			Select dropdown3 = new Select(wd.findElement(By.id("selTypeofIndustry")));
			dropdown3.selectByIndex(1);
			
           logger.info("Selected by :Finance");
			
			wd.findElement(By.name("WorkExperience")).sendKeys("5");
	        logger.info("Selected by :5");
			
			wd.findElement(By.name("companyname")).sendKeys("suspl");
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
			
			wd.findElement(By.id("txtAddFriendEmail2")).sendKeys("arun@gmail.com");
			logger.info("Entered AddFriendEmail2:arun@gmail.com");
			
			wd.findElement(By.id("txtAddFriendName3")).sendKeys("Vijay");
			logger.info("Entered AddFriendName3:Vijay");
			
			wd.findElement(By.id("txtAddFriendMobile3")).sendKeys("9876543210");
			logger.info("Entered AddFriendMobile3:9876543210");
			
			wd.findElement(By.id("txtAddFriendEmail3")).sendKeys("vijay@gmail.com");
			logger.info("Entered AddFriendEmail3:vijay@gmail.com");
			
			wd.findElement(By.id("txtAddFriendName4")).sendKeys("Kumar");
			logger.info("Entered AddFriendName4:Kumar");
			
			wd.findElement(By.id("txtAddFriendMobile4")).sendKeys("9500236541");
			logger.info("Entered AddFriendMobile4:9500236541");
			
			wd.findElement(By.id("txtAddFriendEmail4")).sendKeys("kumar@gmail.com");
			logger.info("Entered AddFriendEmail4:kumar@gmail.com");
			
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
			logger.info(" Save Data Sucessfully :  Data Saved Sucessfully  ");
			logger.info(" Test case No 1 : Positive Data Created Sucessfully");
			Thread.sleep(5000);
			}
		public static void testNegativeCase(WebDriver wd) throws InterruptedException {

			wd.get(UserURL);
     	    wd.manage().window().maximize();
     	    logger.info("Click to Entered Add New Leads page");
			wd.findElement(By.name("firstname")).sendKeys("");
         	logger.info("Entered Firstname:");
			
			wd.findElement(By.name("middlename")).sendKeys("");
			logger.info("Entered middlename:");
			
			wd.findElement(By.name("lastname")).sendKeys("");
			logger.info("Entered lastname:");
			
			WebElement selectDate = wd.findElement(By.id("dtDOB"));
			selectDate.clear();
			selectDate.sendKeys("");
			logger.info("DOB Date Entered:");
			
			wd.findElement(By.xpath("//div[@class='form-check form-check-radio']//label[1]"));
			logger.info("Selected by :");
			
			wd.findElement(By.name("parentguardianname")).sendKeys("");
			logger.info("Entered parentguardianname:");
			
			wd.findElement(By.name("address")).sendKeys("");
			logger.info("Entered address:");
			
			wd.findElement(By.name("city")).sendKeys("");
			logger.info("Entered city:");
			
			wd.findElement(By.name("state")).sendKeys("");
			logger.info("Entered state:");
			
			wd.findElement(By.name("pincode")).sendKeys("");
			logger.info("Entered pincode:");
			
			wd.findElement(By.name("landline")).sendKeys("");
			logger.info("Entered landline:");
			
			wd.findElement(By.name("mobilenumber")).sendKeys("");
			logger.info("Entered mobilenumber:");
			
			wd.findElement(By.name("email")).sendKeys("");
			logger.info("Entered email:");
			
			wd.findElement(By.id("txtParentsEmail")).sendKeys("");
			logger.info("Entered ParentsEmail:");
			
			Select dd = new Select(wd.findElement(By.id("selCurrentEducationStatus")));
			dd.selectByIndex(0);
		    logger.info("CurrentEducationStatus Entered:");
			
			Select dd1 = new Select(wd.findElement(By.id("selAnnualIncome")));
			dd1.selectByIndex(0);
			logger.info("AnnualIncome Entered:");
			
			wd.findElement(By.name("institutionname")).sendKeys("");
			logger.info("Entered institutionname:");
			
			Select dd2 = new Select(wd.findElement(By.id("selStreamofEducation")));
			dd2.selectByIndex(0);
			logger.info("StreamofEducation Entered:");
			
			Select dropdown3 = new Select(wd.findElement(By.id("selTypeofIndustry")));
			dropdown3.selectByIndex(0);
			
          logger.info("Selected by :");
			
			wd.findElement(By.name("WorkExperience")).sendKeys("");
	        logger.info("Selected by :");
			
			wd.findElement(By.name("companyname")).sendKeys("");
			logger.info("Entered companyname:");
			
			//courses
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[1]"));
	        logger.info("Selected by :");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[2]"));
	        logger.info("Selected by :");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[3]"));
	        logger.info("Selected by :");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[4]"));
	        logger.info("Selected by :");
		
				//country
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[1]"));
	        logger.info("Selected by :");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[2]"));
	        logger.info("Selected by :");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[3]"));
	        logger.info("Selected by :");
			
			//Know about us
           wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[1]//label[1]"));
			logger.info("Selected by :");
           
           wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[3]//label[1]"));
			logger.info("Selected by :");
           
           wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[4]//label[1]"));
			logger.info("Selected by :");
           
           wd.findElement(By.xpath("//div[@class='col-sm-5']//div[1]//label[1]"));
			logger.info("Selected by :");
           
           wd.findElement(By.xpath("//div[@class='col-sm-5']//div[4]//label[1]"));
			logger.info("Selected by :");
			
			wd.findElement(By.id("txtAddFriendName1")).sendKeys("");
			logger.info("Entered AddFriendName1:");
			
			wd.findElement(By.id("txtAddFriendMobile1")).sendKeys("");
			logger.info("Entered AddFriendMobile1:");
			
			wd.findElement(By.id("txtAddFriendEmail1")).sendKeys("");
			logger.info("Entered AddFriendEmail1:");
			
			wd.findElement(By.id("txtAddFriendName2")).sendKeys("");
			logger.info("Entered AddFriendName2:");
			
			wd.findElement(By.id("txtAddFriendMobile2")).sendKeys("");
			logger.info("Entered AddFriendMobile2:");
			
			wd.findElement(By.id("txtAddFriendEmail2")).sendKeys("");
			logger.info("Entered AddFriendEmail2:");
			
			wd.findElement(By.id("txtAddFriendName3")).sendKeys("");
			logger.info("Entered AddFriendName3:");
			
			wd.findElement(By.id("txtAddFriendMobile3")).sendKeys("");
			logger.info("Entered AddFriendMobile3:");
			
			wd.findElement(By.id("txtAddFriendEmail3")).sendKeys("");
			logger.info("Entered AddFriendEmail3:");
			
			wd.findElement(By.id("txtAddFriendName4")).sendKeys("");
			logger.info("Entered AddFriendName4:");
			
			wd.findElement(By.id("txtAddFriendMobile4")).sendKeys("");
			logger.info("Entered AddFriendMobile4:");
			
			wd.findElement(By.id("txtAddFriendEmail4")).sendKeys("");
			logger.info("Entered AddFriendEmail4:");
			
			Select dd3 = new Select(wd.findElement(By.id("selCourseEstimatedStart")));
			dd3.selectByIndex(0);
			logger.info("CourseEstimatedStart Entered:");
			
			Select dd4 = new Select(wd.findElement(By.id("selClassSchedulePref")));
			dd4.selectByIndex(0);
			logger.info("ClassSchedulePref Entered:");
			
			Select dd5 = new Select(wd.findElement(By.id("selHasMagooshAccount")));
			dd5.selectByIndex(0);
			logger.info("HasMagooshAccount Entered:");

			
			wd.findElement(By.xpath("//div[@class='col-sm-12']//div[1]//label[1]"));
			logger.info("Selected by :");
			
			wd.findElement(By.xpath("//div[@class='col-sm-12']//div[5]//label[1]"));
			logger.info("Selected by :");
			  

			wd.findElement(By.id("btnSave")).click();
			logger.info("Without Data Entered");
			logger.info(" Test case No 2  : Negative Data EnteredSucessfully");
			Thread.sleep(5000);

}
		public static void testNegativeCase1(WebDriver wd) throws InterruptedException {

			wd.get(UserURL);
     	    wd.manage().window().maximize();
     	    logger.info("Click to Entered Add New Leads page");
			wd.findElement(By.name("firstname")).sendKeys("123456");
         	logger.info("Entered Firstname:123456");
			
			wd.findElement(By.name("middlename")).sendKeys("12345");
			logger.info("Entered middlename:12345");
			
			wd.findElement(By.name("lastname")).sendKeys("45");
			logger.info("Entered lastname:45");
			
			WebElement selectDate = wd.findElement(By.id("dtDOB"));
			selectDate.clear();
			selectDate.sendKeys("08-05-2030");
			logger.info("DOB Date Entered:08-05-2030");
			
			wd.findElement(By.xpath("//div[@class='form-check form-check-radio']//label[1]"));
			logger.info("Selected by :");
			
			wd.findElement(By.name("parentguardianname")).sendKeys("7418520");
			logger.info("Entered parentguardianname:7418520");
			
			wd.findElement(By.name("address")).sendKeys("963852");
			logger.info("Entered address:963852");
			
			wd.findElement(By.name("city")).sendKeys("741852");
			logger.info("Entered city:741852");
			
			wd.findElement(By.name("state")).sendKeys("963852");
			logger.info("Entered state:963852");
			
			wd.findElement(By.name("pincode")).sendKeys("asdfgh");
			logger.info("Entered pincode:asdfgh");
			
			wd.findElement(By.name("landline")).sendKeys("asdfgh");
			logger.info("Entered landline:asdfgh");
			
			wd.findElement(By.name("mobilenumber")).sendKeys("lkjhgf");
			logger.info("Entered mobilenumber:lkjhgf");
			
			wd.findElement(By.name("email")).sendKeys("nathanymail.com");
			logger.info("Entered email:nathanymail.com");
			
			wd.findElement(By.id("txtParentsEmail")).sendKeys("joe@gmailcom");
			logger.info("Entered ParentsEmail:joe@gmailcom");
			
			Select dd = new Select(wd.findElement(By.id("selCurrentEducationStatus")));
			dd.selectByIndex(0);
		    logger.info("CurrentEducationStatus Entered:");
			
			Select dd1 = new Select(wd.findElement(By.id("selAnnualIncome")));
			dd1.selectByIndex(0);
			logger.info("AnnualIncome Entered:");
			
			wd.findElement(By.name("institutionname")).sendKeys("741/852");
			logger.info("Entered institutionname:741/852");
			
			Select dd2 = new Select(wd.findElement(By.id("selStreamofEducation")));
			dd2.selectByIndex(0);
			logger.info("StreamofEducation Entered:");
			
			Select dropdown3 = new Select(wd.findElement(By.id("selTypeofIndustry")));
			dropdown3.selectByIndex(0);
			
          logger.info("Selected by :");
			
			wd.findElement(By.name("WorkExperience")).sendKeys("asdf");
	        logger.info("Selected by :asdf");
			
			wd.findElement(By.name("companyname")).sendKeys("741852");
			logger.info("Entered companyname:741852");
			
			//courses
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[1]"));
	        logger.info("Selected by :");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[2]"));
	        logger.info("Selected by :");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[3]"));
	        logger.info("Selected by :");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[4]"));
	        logger.info("Selected by :");
		
				//country
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[1]"));
	        logger.info("Selected by :");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[2]"));
	        logger.info("Selected by :");
			
			wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[3]"));
	        logger.info("Selected by :");
			
			//Know about us
           wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[1]//label[1]"));
			logger.info("Selected by :");
           
           wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[3]//label[1]"));
			logger.info("Selected by :");
           
           wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[4]//label[1]"));
			logger.info("Selected by :");
           
           wd.findElement(By.xpath("//div[@class='col-sm-5']//div[1]//label[1]"));
			logger.info("Selected by :");
           
           wd.findElement(By.xpath("//div[@class='col-sm-5']//div[4]//label[1]"));
			logger.info("Selected by :");
			
			wd.findElement(By.id("txtAddFriendName1")).sendKeys("1234567");
			logger.info("Entered AddFriendName1:1234567");
			
			wd.findElement(By.id("txtAddFriendMobile1")).sendKeys("qwertyu");
			logger.info("Entered AddFriendMobile1:qwertyu");
			
			wd.findElement(By.id("txtAddFriendEmail1")).sendKeys("joegmail.com");
			logger.info("Entered AddFriendEmail1:joegmail.com");
			
			wd.findElement(By.id("txtAddFriendName2")).sendKeys("00000");
			logger.info("Entered AddFriendName2:00000");
			
			wd.findElement(By.id("txtAddFriendMobile2")).sendKeys("uuuuuu");
			logger.info("Entered AddFriendMobile2:uuuuuu");
			
			wd.findElement(By.id("txtAddFriendEmail2")).sendKeys("@gmail");
			logger.info("Entered AddFriendEmail2:@gmail");
			
			wd.findElement(By.id("txtAddFriendName3")).sendKeys("666666");
			logger.info("Entered AddFriendName3:666666");
			
			wd.findElement(By.id("txtAddFriendMobile3")).sendKeys("kkkkkk");
			logger.info("Entered AddFriendMobile3:kkkkkk");
			
			wd.findElement(By.id("txtAddFriendEmail3")).sendKeys("wer");
			logger.info("Entered AddFriendEmail3:wer");
			
			wd.findElement(By.id("txtAddFriendName4")).sendKeys("11111");
			logger.info("Entered AddFriendName4:11111");
			
			wd.findElement(By.id("txtAddFriendMobile4")).sendKeys("bbbbbb");
			logger.info("Entered AddFriendMobile4:bbbbbb");
			
			wd.findElement(By.id("txtAddFriendEmail4")).sendKeys("asdgmailcom");
			logger.info("Entered AddFriendEmail4:asdgmailcom");
			
			Select dd3 = new Select(wd.findElement(By.id("selCourseEstimatedStart")));
			dd3.selectByIndex(0);
			logger.info("CourseEstimatedStart Entered:");
			
			Select dd4 = new Select(wd.findElement(By.id("selClassSchedulePref")));
			dd4.selectByIndex(0);
			logger.info("ClassSchedulePref Entered:");
			
			Select dd5 = new Select(wd.findElement(By.id("selHasMagooshAccount")));
			dd5.selectByIndex(0);
			logger.info("HasMagooshAccount Entered:");

			
			wd.findElement(By.xpath("//div[@class='col-sm-12']//div[1]//label[1]"));
			logger.info("Selected by :");
			
			wd.findElement(By.xpath("//div[@class='col-sm-12']//div[5]//label[1]"));
			logger.info("Selected by :");
			  

			wd.findElement(By.id("btnSave")).click();
			logger.info("   Entered Valid  Data");
			logger.info(" Test case No 3 : Negative Data EnteredSucessfully");
			Thread.sleep(5000);

}

  public static void testNegativeCase2(WebDriver wd) throws InterruptedException {

	    wd.get(UserURL);
	    wd.manage().window().maximize();
	    logger.info("Click to Entered Add New Leads page");
	    wd.findElement(By.name("firstname")).sendKeys("!@#$%");
 	    logger.info("Entered Firstname:!@#$%");
	
	    wd.findElement(By.name("middlename")).sendKeys("!@#$%");
	    logger.info("Entered middlename:!@#$%");
	
	    wd.findElement(By.name("lastname")).sendKeys("!@#$%");
	    logger.info("Entered lastname:!@#$%");
	
	    WebElement selectDate = wd.findElement(By.id("dtDOB"));
	    selectDate.clear();
	    selectDate.sendKeys("!@#$%");
	    logger.info("DOB Date Entered:!@#$%");
	
	    wd.findElement(By.xpath("//div[@class='form-check form-check-radio']//label[1]"));
	    logger.info("Selected by :");
	
	    wd.findElement(By.name("parentguardianname")).sendKeys("!@#$%");
	    logger.info("Entered parentguardianname:!@#$%");
	
	    wd.findElement(By.name("address")).sendKeys("!@#$%");
	    logger.info("Entered address:!@#$%");
	
	    wd.findElement(By.name("city")).sendKeys("!@#$%");
	    logger.info("Entered city:!@#$%");
	
	    wd.findElement(By.name("state")).sendKeys("!@#$%");
	    logger.info("Entered state:!@#$%");
	
	    wd.findElement(By.name("pincode")).sendKeys("!@#$%");
	    logger.info("Entered pincode:!@#$%");
	
	    wd.findElement(By.name("landline")).sendKeys("!@#$%");
	    logger.info("Entered landline:!@#$%");
	
	    wd.findElement(By.name("mobilenumber")).sendKeys("!@#$%");
	    logger.info("Entered mobilenumber:!@#$%");
	
	    wd.findElement(By.name("email")).sendKeys("!@#$%");
	    logger.info("Entered email:!@#$%");
	
	    wd.findElement(By.id("txtParentsEmail")).sendKeys("!@#$%");
	    logger.info("Entered ParentsEmail:!@#$%");
	
	    Select dd = new Select(wd.findElement(By.id("selCurrentEducationStatus")));
	    dd.selectByIndex(0);
        logger.info("CurrentEducationStatus Entered:");
	
	    Select dd1 = new Select(wd.findElement(By.id("selAnnualIncome")));
	    dd1.selectByIndex(0);
	    logger.info("AnnualIncome Entered:");
	
	    wd.findElement(By.name("institutionname")).sendKeys("!@#$%");
	    logger.info("Entered institutionname:!@#$%");
	
	    Select dd2 = new Select(wd.findElement(By.id("selStreamofEducation")));
	    dd2.selectByIndex(0);
	    logger.info("StreamofEducation Entered:");
	
    	Select dd3 = new Select(wd.findElement(By.id("selTypeofIndustry")));
	    dd3.selectByIndex(0);
	    logger.info("Selected by :");
	
	    wd.findElement(By.name("WorkExperience")).sendKeys("!@#$%");
        logger.info("Selected by :!@#$%");
	
	    wd.findElement(By.name("companyname")).sendKeys("!@#$%");
	    logger.info("Entered companyname:!@#$%");
	
	    //courses
	    wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[1]"));
        logger.info("Selected by:");
	
	    wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[2]"));
        logger.info("Selected by :");
	
	    wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[3]"));
        logger.info("Selected by :");
	
	    wd.findElement(By.xpath("//*[@id=\"newform\"]//div[10]//div[1]//div[4]"));
        logger.info("Selected by:");

		//country
	    wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[1]"));
        logger.info("Selected by:");
	
	    wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[2]"));
        logger.info("Selected by :");
	
	    wd.findElement(By.xpath("//*[@id=\"newform\"]//div[13]//div[1]//div[3]"));
        logger.info("Selected by :");
	
	   //Know about us
        wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[1]//label[1]"));
	    logger.info("Selected by :");
   
        wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[3]//label[1]"));
	    logger.info("Selected by :");
   
        wd.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-1']//div[4]//label[1]"));
	    logger.info("Selected by :");
   
        wd.findElement(By.xpath("//div[@class='col-sm-5']//div[1]//label[1]"));
    	logger.info("Selected by :");
   
        wd.findElement(By.xpath("//div[@class='col-sm-5']//div[4]//label[1]"));
	    logger.info("Selected by :");
	
	    wd.findElement(By.id("txtAddFriendName1")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendName1:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendMobile1")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendMobile1:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendEmail1")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendEmail1:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendName2")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendName2:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendMobile2")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendMobile2:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendEmail2")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendEmail2:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendName3")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendName3:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendMobile3")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendMobile3:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendEmail3")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendEmail3:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendName4")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendName4:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendMobile4")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendMobile4:!@#$%");
	
	    wd.findElement(By.id("txtAddFriendEmail4")).sendKeys("!@#$%");
	    logger.info("Entered AddFriendEmail4:!@#$%");
	
	    Select dd4 = new Select(wd.findElement(By.id("selCourseEstimatedStart")));
	    dd4.selectByIndex(0);
	    logger.info("CourseEstimatedStart Entered:");
	
	    Select dd5 = new Select(wd.findElement(By.id("selClassSchedulePref")));
	    dd5.selectByIndex(0);
	    logger.info("ClassSchedulePref Entered:");
	
	    Select dd6 = new Select(wd.findElement(By.id("selHasMagooshAccount")));
	    dd6.selectByIndex(0);
	    logger.info("HasMagooshAccount Entered:");

	
	    wd.findElement(By.xpath("//div[@class='col-sm-12']//div[1]//label[1]"));
	    logger.info("Selected by :");
	
	    wd.findElement(By.xpath("//div[@class='col-sm-12']//div[5]//label[1]"));
	    logger.info("Selected by :");
	  

	     wd.findElement(By.id("btnSave")).click();
	     logger.info("   Entered Valid  Data");
	     logger.info(" Test case No 3 : Negative Data EnteredSucessfully");
	     Thread.sleep(5000);

     }
}
