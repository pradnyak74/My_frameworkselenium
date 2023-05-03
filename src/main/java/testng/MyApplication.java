package testng;

import org.testng.annotations.Test;

public class MyApplication {
	
	
	
	@Test
	public void startapp()
	{
		
		System.setProperty("webdriver.chromedriver","Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
	}
	@Test
	public void Login()
	{
		
	}
	@Test
	public void Logout()
	{
		
	}

}
