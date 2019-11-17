package ObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCustomer {

	@FindBy(name="name")
	private WebElement CustomerNameEdit;
	
	@FindBy(name="description")
	private WebElement CreateCustomerDEsEdit;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement CreateCustomerBtn;

	public WebElement getCustomerNameEdit() {
		return CustomerNameEdit;
	}

	public WebElement getCreateCustomerDEsEdit() {
		return CreateCustomerDEsEdit;
	}
	
	/*buisness class*/
	public void createCustomer(String customerName)
	{
		CustomerNameEdit.sendKeys(customerName);
		
		CreateCustomerBtn.click();
		
		
	}
	
	
	public void createCustomer(String customerName,String desp)
	{
		CustomerNameEdit.sendKeys(customerName);
		CreateCustomerDEsEdit.sendKeys(desp);
		CreateCustomerBtn.click();
		
		
	}
	
}
