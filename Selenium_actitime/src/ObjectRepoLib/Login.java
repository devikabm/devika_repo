package ObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author deepak
 *
 */
public class Login {

	/*Identification or initialisation of elements*/
	@FindBy(name="username")
	private WebElement usernameEdit;
	
	@FindBy(name="pwd")
	private WebElement passwordedit;
	
	@FindBy(id="loginButton")
    private WebElement loginbtn;
	
	public WebElement getUsername() {
		return usernameEdit;
	}

	public WebElement getPasswordedit() {
		return passwordedit;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	/*buisness method*/
	public void LoginToApp(String username, String password)
	{
		usernameEdit.sendKeys(username);
		passwordedit.sendKeys(password);
		loginbtn.click();
		
		
	}

	
}

