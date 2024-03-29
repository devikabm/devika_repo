package com.actitime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * it contains reusable methods,which is used to handle wait and dropdown elements
 * 
 * @author deepak
 */

public class WebDriverCommonUtile {

	public void WaitForPageToLoad()
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	public void WaitForElementPresent(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(BaseClass.driver,20);
        wait.until(ExpectedConditions.visibilityOf(element));
        		
		
	}
	public void select(WebElement element, String data)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(data);
		
	}
	public void select(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
		
	}
	
}
