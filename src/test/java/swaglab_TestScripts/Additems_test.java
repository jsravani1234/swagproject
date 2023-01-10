package swaglab_TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import generic.BaseClass;
import generic.ReadDataFromprop;
import pomclasses.Checkinfo;
import pomclasses.HomePage;




public class Additems_test extends BaseClass {
	@Test(groups= {"smoke"})
	public void additems() throws InterruptedException
	{
		ReadDataFromprop r=new ReadDataFromprop();
		//Faker f=new Faker();
		String frstname=r.name();
		String lstname=r.lname();
		String codee=r.pin();
		Thread.sleep(3000);
		HomePage hp=new HomePage(driver);
		hp.addshirt();
		hp.getCart().click();
		Thread.sleep(3000);
		Checkinfo cn=new Checkinfo(driver);
		cn.getCheck().click();
		cn.checkout(frstname,lstname,codee);
		cn.getFinish().click();
		cn.getBack().click();
		
	}
@Test(groups= {"regression"})
public void printElements()
{
	List<WebElement>l=driver.findElements(By.className("inventory_item_name"));
	for(WebElement ele:l)
	{
		System.out.println(ele.getText());
	}
}

}
