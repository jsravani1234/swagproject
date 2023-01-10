package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.github.javafaker.Faker;

public class ReadDataFromprop {
	Faker f=new Faker();
	public String readData_FromProperty(String key) throws IOException
	{
FileInputStream fis=new FileInputStream(IAutoConstants.CRED);
Properties p= new Properties();
p.load(fis);
String value=p.getProperty(key);
return value;

	}
	public String name()
	{
		return f.name().firstName();
	}
	public String lname()
	{
		return f.name().lastName();
	}
	public String pin()
	{
		return f.address().zipCode();
	}
}
