package com.Actitime.Testscripts;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibaray.Baseclass;
import com.Actitime.GenericLibaray.FileLibrary;
import com.Actitime.POM.Homepage;
import com.Actitime.POM.TaskPage;

public class CreateCustomer extends Baseclass {
	
	@Test
	public void createcustomer() throws IOException {
		Homepage hp=new Homepage(driver);
		hp.getTasktab().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcust().click();
		FileLibrary f1=new FileLibrary();
		String customer = f1.readDataFromExcel("Data", 3, 1);
		tp.getCustname().sendKeys(customer);
		String description = f1.readDataFromExcel("Data", 3, 2);
		tp.getCustdesp().sendKeys(description);
		tp.getCreatebtn().click();
		String expectedresult = customer;
		String actualresult = driver.findElement(By.xpath("(//div[.='"+customer+"'])[2]")).getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualresult, expectedresult);
		
		
	}

}
