package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirsttestNG {
	@Test(priority = 3,description="this test case will verify login functionality")
	public void loginapplication() {
		System.out.println("Login to application");
		Assert.assertEquals(12, 13);
	}

	@Test(priority = 1)
	public void selectitems() {
		System.out.println("item Selected");
	}

	@Test(priority = -2)
	public void checkout() {
		System.out.println("checkout completed ");
	}
}