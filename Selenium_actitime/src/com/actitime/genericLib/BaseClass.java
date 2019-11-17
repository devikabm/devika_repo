package com.actitime.genericLib;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import ObjectRepoLib.Home;
import ObjectRepoLib.Login;

public class BaseClass {
	/*global objects*/
	public static WebDriver driver;
	public ClassFileLib fLib  = new ClassFileLib();

	@BeforeClass
	public void configBC() throws Throwable
	{
		System.out.println("===launch as browser====");
		String BROWSERNAME = fLib.getPropertyValue("browser");
		
		if(BROWSERNAME.equals("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		
	}
	@BeforeMethod
	public void configBM() throws Throwable
	{
		System.out.println("=====login====");
		
		/*read URL, username,password from property files*/
		
		String URL =fLib.getPropertyValue("url");
		String USERNAME =fLib.getPropertyValue("username");
		String PASSWORD =fLib.getPropertyValue("password");
		
		
		
		driver.get(URL);
		
		/*create an object to login POM Class*/
		Login lp = PageFactory.initElements(driver,Login.class);
		lp.LoginToApp(USERNAME, PASSWORD);
		
	}
	
	
	@AfterMethod
	public void configAM()
	{
		System.out.println("===lagout====");
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.logout();
		
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("===close the browser====");
		driver.close();
		
	}
	
}
