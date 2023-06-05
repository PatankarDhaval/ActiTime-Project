package com.Actitime.GenericLibaray;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenerImplementation extends Baseclass  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
     String name = result.getName();
     TakesScreenshot t=(TakesScreenshot)driver;
    File src = t.getScreenshotAs(OutputType.FILE);
    File dest=new File("./Screenshot/"+name+".png");
    try {
    	Files.copy(src, dest);
		
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
		
	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public void dataconnection() {
		// TODO Auto-generated method stub
		super.dataconnection();
	}

	@Override
	public void launchbrowser() throws IOException {
		// TODO Auto-generated method stub
		super.launchbrowser();
	}

	@Override
	public void login() throws IOException {
		// TODO Auto-generated method stub
		super.login();
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		super.logout();
	}

	@Override
	public void closebrowser() {
		// TODO Auto-generated method stub
		super.closebrowser();
	}

	@Override
	public void DataBaseDisconnected() {
		// TODO Auto-generated method stub
		super.DataBaseDisconnected();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
