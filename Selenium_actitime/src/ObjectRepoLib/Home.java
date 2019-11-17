package ObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

	@FindBy(xpath = "//div[text()='Tasks']")
	private WebElement taskImg;
	

	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public WebElement getTaskImg() {
		return taskImg;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	/*buiness mts*/
	public void logout()
	{
		logoutLink.click();
	}

	
	
}
