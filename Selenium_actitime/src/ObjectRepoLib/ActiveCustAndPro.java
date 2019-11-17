package ObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveCustAndPro {

	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement CreateCustomerBtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement successfulMsg;

	public WebElement getCreateCustomerBtn() {
		return CreateCustomerBtn;
	}

	public WebElement getSuccessfulMsg() {
		return successfulMsg;
	}
	
	
}
