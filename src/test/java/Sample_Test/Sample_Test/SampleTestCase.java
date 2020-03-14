package Sample_Test.Sample_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.soft.pageobject.CarLoan;
import com.soft.utilities.ReadConfig;


public class SampleTestCase extends BaseClass {
	
	
	
	
		@Test 
		public void Test1() throws IOException, InterruptedException, AWTException {
		CarLoan cl =  new CarLoan(driver);
		
		
/*	************************************************************
		
		 EXAMPLE OF PAGE OBJECT MODEL.....
		 CALLING THREE FUNCTIONS OF POM...
		 
	*************************************************************
*/	
		cl.clickCarLoanbutton(); //click  Loan Link Button
		cl.clickbtnCarLoan();  // Click on Car Loan Button
		cl.clickbtnNewCar(); // Click on New Car Button
		cl.clickOtherModel(); // Click on other car
		
		/*******************************************/
		
		driver.findElement(By.xpath("//a[contains(text(),'Nexon Ev')]")).click(); // select the Nexon Ev
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//span[contains(text(),'Mumbai')]/following-sibling::span")).click();  
		WebElement ele_ClickOnCity = driver.findElement(By.xpath("//span[contains(text(),'Mumbai')]/following-sibling::span")); // select the city
		javascriptExecutorClick(driver, ele_ClickOnCity, "Click on Mumbai");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// String temp_text1 = driver.findElement(By.xpath("//span[contains(text(),'When did you move to Mumbai?')]")).getText();

		WebElement ele_SelectYear = driver.findElement(By.xpath("(//A[@data-value='2015'][text()='Before 2016'][text()='Before 2016'])[1]")); // select year
		javascriptExecutorClick(driver, ele_SelectYear, "Select Year");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// String temp_text2 = driver.findElement(By.xpath("//div[contains(text(),'When did you move to current residence?')]")).getText();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele_SelectYearResi = driver.findElement(By.xpath("(//A[@data-value='2015'][text()='Before 2016'][text()='Before 2016'])[2]")); // select year of residence
		javascriptExecutorClick(driver, ele_SelectYearResi, "Select Residence Year");


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele_RentedWithFamily = driver.findElement(By.xpath("//input[@value='RENTED_AND_STAYING_WITH_FAMILY']")); // Rented - With Family
		javascriptExecutorClick(driver, ele_RentedWithFamily, "Select Rented - With Family");


		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement slider1= driver.findElement(By.xpath("//DIV[@class='rangeslider__handle-label']/parent::div"));
		js.executeScript("arguments[0].setAttribute('style', 'left: 165px;')", slider1);


		Thread.sleep(2000);
		driver.findElement(By.xpath("//DIV[@class='rangeslider__handle-label']")).click();



		//A[@data-value='1987-07'][text()='Jul 1987']
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele_SelectBirthYear= driver.findElement(By.xpath("//A[@data-value='1987-07'][text()='Jul 1987']")); // select birth year
		javascriptExecutorClick(driver, ele_SelectBirthYear, "Select Birth year");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele_SelectBirthDate= driver.findElement(By.xpath("//TD[@class=''][text()='11']")); // select birth Date
		javascriptExecutorClick(driver, ele_SelectBirthDate, "Select Birth Date");


		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele_ClickOnContinue= driver.findElement(By.xpath("//A[@class='btn btn-large '][text()='Continue']")); // Click on continue
		javascriptExecutorClick(driver, ele_ClickOnContinue, " Click on continue");


		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele_selectSalaried= driver.findElement(By.xpath("//SPAN[@class='EmploymentType_iconSalaried_kRvpm']")); // select Salaried
		javascriptExecutorClick(driver, ele_selectSalaried, "select Salaried");


		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// WebElement ele_txtCompany= driver.findElement(By.xpath("//INPUT[@aria-activedescendant='react-select-2--value']")); // Enter Company Name
		// javascriptExecutorClick(driver, ele_txtCompany, "select Salaried");

		WebElement ele_txtCompany= driver.findElement(By.xpath("//INPUT[@aria-activedescendant='react-select-2--value']"));
		ele_txtCompany.sendKeys("IBM INDIA PVT LTD");
		Thread.sleep(2000);
		ele_txtCompany.sendKeys(Keys.ARROW_DOWN);
		ele_txtCompany.sendKeys(Keys.ENTER);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele_selectCompnayYear= driver.findElement(By.xpath("//A[@data-value='2015'][text()='Before 2016']")); // select Company Year
		javascriptExecutorClick(driver, ele_selectCompnayYear, "select Company Year");




		WebElement expSlider= driver.findElement(By.xpath("//DIV[@class='rangeslider__handle-label']/parent::div"));
		js.executeScript("arguments[0].setAttribute('style', 'left: 314px;')", expSlider);


		Thread.sleep(2000);
		driver.findElement(By.xpath("//DIV[@class='rangeslider__handle']")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		driver.findElement(By.xpath("//input[@name='grossMonthlyIncome']")).sendKeys("50000"); // Enter Salary
		Thread.sleep(2000);
		driver.findElement(By.xpath("//DIV[@class='rangeslider__handle']")).click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Continue']")).click();  // Click on continue


		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele_selectBank= driver.findElement(By.xpath("//SPAN[@class='BankLogo_iconHdfcBank_uewyx']")); // select Bank
		javascriptExecutorClick(driver, ele_selectBank, "select Bank");


		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele_clickSkipMonthlySkip= driver.findElement(By.xpath("//a[text()='Skip']")); // click skip button  of monthly incentive
		javascriptExecutorClick(driver, ele_clickSkipMonthlySkip, "Click on Skip monthly incentive");

		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele_clickSkiptotalEMI= driver.findElement(By.xpath("//a[text()='Skip']")); // click skip button  of total EMI
		javascriptExecutorClick(driver, ele_clickSkiptotalEMI, "Click on Skip totatl EMI");  // click skip button of total EMI

		
		
//		cl.txtFirstName(FirstName);
//		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
//		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(mobile);


//		WebElement ele_clickViewOffer= driver.findElement(By.xpath("//a[contains (text(), 'View FREE Offers')]")); // click Click view offer button
//		javascriptExecutorClick(driver, ele_clickViewOffer, "Click on View Offer");
		
		
		
	}

		// Using data-provider to get the data from the excel sheet.
	
		@Test(dataProvider="DataSet")
		public void personalInformation(String FirstName, String Mobile, String Email) throws IOException
		{
			System.out.println("Personal Infromation function has been called...!");

			CarLoan cl =  new CarLoan(driver);
			cl.txtFirstName(FirstName);
			cl.txtMoible(Mobile);
			cl.txtEmail(Email);
			
			cl.clickbtnViewOffer(); // Click on View Offer Button


		}
		
	@DataProvider(name="DataSet")
	String[][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/DataProviderExp.xlsx";
		
		System.out.println("Path of excel FILe >" +path);
		int rownNum = XLUtils.getRowCount(path, "Sheet");
		int colCount = XLUtils.getCellCount(path, "Sheet", 1);
		
		System.out.println("Number of rows >" + rownNum +" " + "and number of column" + colCount);
		String Data[][] = new String[rownNum][colCount];
		
		for(int i=1; i<=rownNum; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				Data[i-1][j] = XLUtils.getCellData(path, "Sheet", i, j); //1  0
				System.out.println("Data - >>"+Data[i-1][j]);
			}
		}
		return Data;
	}
	

}
