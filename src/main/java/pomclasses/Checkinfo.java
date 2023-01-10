package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkinfo {
	@FindBy(id="checkout")
	private WebElement check;
	@FindBy(id="first-name")
	private WebElement fname;
	@FindBy(id="last-name")
	private WebElement lname;
	@FindBy(id="postal-code")
	private WebElement pcode;
	@FindBy(id="continue")
	private WebElement sub;
	public WebElement getCheck() {
		return check;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getPcode() {
		return pcode;
	}
	public WebElement getSub() {
		return sub;
	}
	public Checkinfo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void checkout(String firstname,String lastname,String pincode)
	{
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		pcode.sendKeys(pincode);
		sub.click();
	}
	@FindBy(id="finish")
	private WebElement finish;
	public WebElement getFinish() {
		return finish;
	}
	@FindBy(id="back-to-products")
	private WebElement back;
	public WebElement getBack()
	{
		return back;
		
	}
		
}


