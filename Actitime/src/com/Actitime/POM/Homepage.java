package com.Actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
		  //declareation
			@FindBy(xpath ="//div[.='tasks']")
			private WebElement tasktab;
			
			@FindBy (xpath ="//div[.='Reports']")
			private WebElement reportstab;
			
			@FindBy (xpath ="//div[.='Users']")
			private WebElement usertab;
			
			@FindBy (id ="logoutLink")
			private WebElement logout;
			
			//initialization
			public Homepage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}

			//utilization
			public WebElement getTasktab() {
				return tasktab;
			}

			public WebElement getReportstab() {
				return reportstab;
			}

			public WebElement getUsertab() {
				return usertab;
			}

			public WebElement getLogout() {
				return logout;
			}


			
			
			
		}

