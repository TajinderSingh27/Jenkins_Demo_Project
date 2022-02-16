package loginTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_TC {

	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin" ) ; 
		driver.findElement(By.id("txtPassword")).sendKeys( "admin123") ; 
		driver.findElement(By.id("btnLogin")).click() ; 
		Assert.assertEquals(driver.getTitle() , "OrangeHRM");
		System.out.println("Test scenario got passed successfully.");
		driver.close(); 	
	}
}
