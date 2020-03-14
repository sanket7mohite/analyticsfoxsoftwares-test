package Sample_Test.Sample_Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.soft.utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;

	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getAppURL();

	@BeforeTest
	public void setup() {
		System.out.println("Iniztialing chrome driver...");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Project\\Sample-Test\\chromedriver.exe");
//		D:\Selenium-Project\Sample-Test\chromedriver.exe
//		System.setProperty("webdriver.chrome.driver", System."D:\\Testing_Software\\Chrome_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

	public void javascriptExecutorClick(WebDriver driver, WebElement element, String label) throws IOException {

		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Actions actions = new Actions(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			actions.moveToElement(element).click();
			js.executeScript("arguments[0].click()", element);

		} catch (Exception e) {

			System.out.println(label + " is not working due to" + e.getMessage());
		}
	}

	@AfterTest
	public void tearDown() {
//		driver.quit();
	}

}
