package com.Actitime.GenericLibaray;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.POM.Loginpage;

public class Baseclass {
	
	FileLibrary f1=new FileLibrary();
	public WebDriver driver;
	@BeforeSuite
	public void dataconnection() {
		Reporter.log("Database connected successfully",true);
	}
	
	@BeforeClass
	public void launchbrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String actitimeurl=f1.ReaddataFromPropertFile("url");
		driver.get(actitimeurl);
		Reporter.log("Browser launched",true);
	}
	
	@BeforeMethod
	public void login() throws IOException {
        Loginpage lp=new Loginpage(driver);

		String un=f1.ReaddataFromPropertFile("username");
		lp.getUntbx().sendKeys(un);
		String pw=f1.ReaddataFromPropertFile("password");
		lp.getPwdtbx().sendKeys(pw);
		lp.getLgbtn().click();
		Reporter.log("logged in to actitime",true);
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logged out",true);
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
		Reporter.log("brower closed",true);
	}
	
	@AfterSuite
	public void DataBaseDisconnected() {
		Reporter.log("DataBaseDisconnected Successfully",true);
	}
	

}
