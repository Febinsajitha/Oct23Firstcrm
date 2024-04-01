package variousConcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class LoginTest {

		static WebDriver driver;
		static int abc;
		
		
		public static void main(String[] args) {
			
			setUp();
			loginTest();
			tearDown();
			
			setUp();
			negetiveLoginTest();
			tearDown();
			
		}

		public static void setUp() {
	
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

			driver = new ChromeDriver();
			
			
			driver.manage().deleteAllCookies();

			
			driver.get("https://codefios.com/ebilling/login");

			
			driver.manage().window().maximize();
		}

		public static void tearDown() {
			driver.close();
		}

		public static void loginTest() {
			
			driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.id("login_submit")).click();
		}

		public static void negetiveLoginTest() {
			
			driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
			driver.findElement(By.id("password")).sendKeys("abc1234");
			driver.findElement(By.id("login_submit")).click();

		}

	}
