package com.actitime.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerImpClass implements ITestListener{
@Override
	public void onTestFailure(ITestResult result)
	{
		String currentDate = new Date().toString().replace(":", "_").replace(" ","_");
		String failedTestName = result.getMethod().getMethodName();
		System.out.println("==========="+failedTestName+"============");
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.driver);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		
		File dstFile = new File("./screenshot/"+failedTestName+currentDate+".png");
		try {
			FileUtils.copyFile(srcFile, dstFile);
		} 
		catch (IOException e)
		{
		}
		
		
		
		
	}
	
}
