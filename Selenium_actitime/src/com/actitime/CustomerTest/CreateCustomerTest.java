package com.actitime.CustomerTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClass;
import ObjectRepoLib.ActiveCustAndPro;
import ObjectRepoLib.CreateCustomer;
import ObjectRepoLib.Home;
import ObjectRepoLib.OpenTasks;

public class CreateCustomerTest extends BaseClass {

	@Test
	public void createCustomerTest() throws Throwable {
	/*read the data from the excel sheet*/
	String customerName = fLib.getExcelData("Sheet1", 1, 1);
	
	/*step 2: navigate to Task Page*/
	Home hp = PageFactory.initElements(driver,Home.class);
	hp.getTaskImg().click();
	

	 /* step 3: click on projects and customer */
	OpenTasks op = PageFactory.initElements(driver, OpenTasks.class);
	op.getProjectsAndCustomerLink().click();
	
	/*step 4 : click on create customer*/
	ActiveCustAndPro ap = PageFactory.initElements(driver, ActiveCustAndPro.class);
	ap.getCreateCustomerBtn().click();
	
	/*step 5 : create customer*/
	CreateCustomer cc = PageFactory.initElements(driver, CreateCustomer.class);
	cc.createCustomer(customerName);
	
	/*verify*/
	String actMsg = ap.getSuccessfulMsg().getText();
	
	boolean stat = actMsg.contains("successfully created");
	Assert.assertTrue(stat);
	
	
}
}	

