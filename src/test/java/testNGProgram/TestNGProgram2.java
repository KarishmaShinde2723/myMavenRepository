package testNGProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGProgram2 {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Velocity Class\\\\Selenium\\\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name= 'pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()= 'Login ']")).click();
		
	}
	
	@Test(priority = 1)
	public void verifyActiTimeHomePageLogo()
	{
		boolean logo = driver.findElement(By.xpath("//img[@src='/img/default/"
				+ "top_nav/default-logo.png?hash=274618146']")).isDisplayed();
		
	/*	if(logo == true) //validation way 1
		{
			System.out.println("Logo is Visible");
		}
		else
		{
			System.out.println("Logo is NOT visible");
		}
		*/
		
		Assert.assertEquals(logo, false, "Logo is NOT Visible");
		
		
	}
	
	@Test(priority = 2)
	public void verifyActiTimeHomePageTasksTab()
	{
		boolean tasks = driver.findElement(By.xpath("//div[text() = 'Tasks']")).isDisplayed();
	/*	if(tasks == true) //validation way 1
		{
			System.out.println("Tasks Tab is Visible");
		}
		else
		{
			System.out.println(" NOT visible");
		}
		*/
		
		Assert.assertFalse(tasks , "ujagjagka");
		
		
	
	}
	
	@Test(priority = 3)
	public void verifyActiTimeHomePageLogoutLink()
	{
		boolean logout = driver.findElement(By.xpath("//a[@id = 'logoutLink']")).isDisplayed();
		if(logout == true) //validation way 1
		{
			System.out.println("LogoutLink is Visible");
		}
		else
		{
			System.out.println(" NOT visible");
		}
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
