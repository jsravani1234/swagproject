package generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomclasses.HomePage;
import pomclasses.LoginPage;

public class BaseClass {
	public WebDriver driver;
	ReadDataFromprop r=new ReadDataFromprop();
	@BeforeClass(groups={"smoke,regression"})
	public void browserLaunch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod(groups={"smoke,regression"})
	public void Login() throws IOException, InterruptedException
	{
		String url=r.readData_FromProperty("url");
		String un=r.readData_FromProperty("un");
		String pwd=r.readData_FromProperty("pwd");
		LoginPage lp=new LoginPage(driver);
		driver.get(url);
		lp.login(un,pwd);
	}
	@AfterMethod(groups={"smoke,regression"})
	public void logout() throws Exception
	{
		HomePage hp=new HomePage(driver);
		hp.logout();
	}
	@AfterClass(groups={"smoke,regression"})
	public void browserclose()
	{
		driver.close();
		
	}
	
}
