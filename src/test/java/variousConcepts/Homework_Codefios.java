package variousConcepts;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_Codefios {
	WebDriver driver;

	@Before
	// launching chrome and opening codefios url
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/login");
		driver.manage().window().maximize();

	}

	@Test
	// enter username and password and click on login
	public void logIn_Addcompany() throws InterruptedException {
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
		Thread.sleep(2000);

		driver.navigate().to("https://codefios.com/ebilling/admin/dashboard");
		driver.findElement(By.cssSelector("a[title='Company']")).click();
		driver.navigate().to("https://codefios.com/ebilling/admin/client/companylist");
		driver.findElement(By.xpath("//button[@type = 'button' and @class='btn btn-primary']")).click();
		driver.findElement(By.cssSelector("//input[@type='text' and @name='company_name']")).sendKeys("Febhomeworkoctober");
		driver.findElement(By.cssSelector("//input[@type='email' and @name='company_email']")).sendKeys("fishpetcodefios123@gmail.com");
		driver.findElement(By.cssSelector("//input[@type='text' and @name='company_phone']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("//input[@type='text' and @name='company_url']")).sendKeys("abchfgrdytuhh");
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button#companyformsubmit")).click();

	}

	// @After
	// public void tearDown()
	// {
	// driver.close();
//	}
}
