package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="user-name")
	private WebElement user;
	@FindBy(id="password")
	private WebElement pswd;
	@FindBy(id="login-button")
	private WebElement sub;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPswd() {
		return pswd;
	}
	public WebElement getSub() {
		return sub;
	}

	   public void login(String username,String pwd) throws InterruptedException
	   {
		   user.sendKeys(username);
		   Thread.sleep(3000);
		   pswd.sendKeys(pwd);
		   sub.click();
	   }
	   public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

}
