package com.soft.pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sample_Test.Sample_Test.BaseClass;

public class CarLoan extends BaseClass{
WebDriver localdriver;
	
	public CarLoan(WebDriver remotedriver) {
		// TODO Auto-generated constructor stub
		localdriver = remotedriver;
		PageFactory.initElements(remotedriver, this);
	}
	
	
	@FindBy(xpath="//a[@href='/loan.html']")
	@CacheLookup
	WebElement carLoan;
	
	@FindBy(xpath="//SPAN[@class='sprite-generic-page icon-car-loan'][text()=' ']")
	@CacheLookup
	WebElement btnCarLoan;
	
	@FindBy(xpath="//span[@class='VehicleAgeType_iconNew_1ZaqE']/parent::label")
	@CacheLookup
	WebElement btnNewCar;
	
	@FindBy(xpath="//span[contains(text(),'Other model')]/following-sibling::input")
	@CacheLookup
	WebElement btnOtherCar;
	
	@FindBy(xpath="//input[@name='firstName']")
	@CacheLookup
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@name='email']")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(xpath="//input[@name='mobileNumber']")
	@CacheLookup
	WebElement txtmobile;
	
	@FindBy(xpath="//a[contains (text(), 'View FREE Offers')]")
	@CacheLookup
	WebElement btnViewOffer;
	

	public void clickCarLoanbutton() 
	{
		carLoan.click();
	}
	
	public void clickbtnCarLoan() throws IOException 
	{
		javascriptExecutorClick(driver, btnCarLoan, "Click on Car Loan");
		
	}
	
	public void clickbtnNewCar() throws IOException 
	{
		javascriptExecutorClick(driver, btnNewCar, "Click on New Car");
		
	}

	public void clickOtherModel() throws IOException 
	{
		javascriptExecutorClick(driver, btnOtherCar, "Click on Other Car");
		
	}
	
	public void txtFirstName(String fname) throws IOException 
	{
		txtfirstname.sendKeys(fname);		
	}

	public void txtEmail(String email) throws IOException 
	{
		txtemail.sendKeys(email);		
	}
	
	public void txtMoible(String mobile) throws IOException 
	{
		txtmobile.sendKeys(mobile);		
	}
	
	public void clickbtnViewOffer() throws IOException 
	{
		javascriptExecutorClick(driver, btnViewOffer, "Click on Other Car");
	}
	
	
	
}
