package org.avinash.pageObjects.android;

import org.avinash.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

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
	
	public void setGender(String gender) 
	{
			female.click();
	
	}

	public void setCountrySelection(String countryName) 
	{
		countrySelection.click();
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
	
	public void AddtoCart2()
	{
		addcart2.click();
	}
	
    public void AddedToCart() 
    {
    	addedtocart.click();
    }
	
	public void Products() 
	{
		product.click();
		
	}
	public void CheckBox()
	{
	   checkbox.click();	
	}
	
	public void longClick() 
	{
		WebElement ele = pleaseread;
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",
		    	((RemoteWebElement) ele).getId(), "duration",3000));
	}
	public void Closed() 
	{
		close.click();
	}
	
	public void Visit() 
	{
		visitWebSite.click();
	}
	
	
}
