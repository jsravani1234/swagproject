package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath  = "//button[text()='Add to cart']")
	private WebElement add;
	@FindBy(className = "shopping_cart_link")
	private WebElement cart;
	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getAdd() {
		return add;
	}
	public void addshirt()
	{
		add.click();
	}
	public void addcart()
	{
		cart.click();
	}
	public WebElement getCart() {
		return cart;
	}
	@FindBy(id="react-burger-menu-btn")
	private WebElement logo;
	@FindBy(id="logout_sidebar_link")
	private WebElement log;
	public void logout() throws InterruptedException
	{
		logo.click();
		Thread.sleep(3000);
		log.click();
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLog() {
		return log;
	}
}
