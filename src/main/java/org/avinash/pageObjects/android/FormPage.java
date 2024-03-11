package org.avinash.pageObjects.android;

import java.io.File;
import java.io.IOException;

import org.avinash.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;
import com.google.common.io.Files;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage extends AndroidActions{
	
	AndroidDriver driver;
	
	public FormPage(AndroidDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
	
		

	@AndroidFindBy(id="android:id/text1")
	private WebElement countrySelection;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter name here']")
	private WebElement nameField;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement female;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement shopButton;

	@AndroidFindBy(xpath="(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")
	public WebElement addcart1;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[2]")
	public WebElement addcart2;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\" and @text=\"ADDED TO CART\"]")
	public WebElement addedtocart;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	public WebElement product;
	
	@AndroidFindBy(className="android.widget.CheckBox")
	public WebElement checkbox;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/termsButton")
	public WebElement pleaseread;
	
	@AndroidFindBy(id="android:id/button1")
	public WebElement close;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
	public WebElement visitWebSite;
	
	
	public void setNameField(String name)
	{	
		nameField.sendKeys(name);
	}
	
	public void name() 
	{
		driver.hideKeyboard();	
	}
	
	public void setGender(String gender) throws IOException, InterruptedException 
	{
		female.click();
	    Thread.sleep(2000);
    	File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\avina\\OneDrive\\Desktop\\Personal Project\\Appium Automation Testing(General Store)\\lets shop.jpg"));
	}

	public void setCountrySelection(String countryName) throws IOException, InterruptedException 
	{
		countrySelection.click();
		//scrollToText(countryName);
		Thread.sleep(2000);
		File d =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(d, new File("C:\\Users\\avina\\OneDrive\\Desktop\\Personal Project\\Appium Automation Testing(General Store)\\CountryScroll.jpg"));
		scrollToText(countryName);
	}
	
	public void submitForm() 
	{
		shopButton.click();
	}
	
	public void AddtoCart1()
	{
		addcart1.click();
	}
	
	public void AddtoCart2() throws IOException
	{
		addcart2.click();
		File E =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(E, new File("C:\\Users\\avina\\OneDrive\\Desktop\\Personal Project\\Appium Automation Testing(General Store)\\AddtoProduct.jpg"));
	}
	
    public void AddedToCart() throws IOException 
    {
    	addedtocart.click();
		File G =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(G, new File("C:\\Users\\avina\\OneDrive\\Desktop\\Personal Project\\Appium Automation Testing(General Store)\\AddedtoCart.jpg"));
    }
	
	public void Products() 
	{
		product.click();
		
	}
	public void CheckBox()
	{
	    checkbox.click();	
	}
	
	public void longClick() throws IOException 
	{
		WebElement ele = pleaseread;
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",
		    	((RemoteWebElement) ele).getId(), "duration",3000));
		
		File H =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(H, new File("C:\\Users\\avina\\OneDrive\\Desktop\\Personal Project\\Appium Automation Testing(General Store)\\Close.jpg"));
	}
	public void Closed() throws IOException, InterruptedException 
	{
		close.click();
		Thread.sleep(2000);
		File I =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(I, new File("C:\\Users\\avina\\OneDrive\\Desktop\\Personal Project\\Appium Automation Testing(General Store)\\CompletePurchase.jpg"));
	}
	
	public void Visit() 
	{
		visitWebSite.click();
	}
	
	
}
