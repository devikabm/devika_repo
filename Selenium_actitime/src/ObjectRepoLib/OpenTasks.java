package ObjectRepoLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasks {

     @FindBy(linkText="Projects & Customers")
     private WebElement projectsAndCustomerLink;

	public WebElement getProjectsAndCustomerLink() {
		return projectsAndCustomerLink;
	}
	
}
