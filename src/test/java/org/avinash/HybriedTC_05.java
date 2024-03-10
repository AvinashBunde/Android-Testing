package org.avinash;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.avinash.pageObjects.android.AppStore;
import org.avinash.pageObjects.android.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnsupportedCommandException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HybriedTC_05 extends AppStore{

	@Test
	public void Browser() throws UnsupportedCommandException,MalformedURLException,InterruptedException {
		
		FormPage obj = new FormPage(driver);
		obj.setCountrySelection("Argentina");
		Thread.sleep(2000);
		obj.setNameField("Maddy");
		Thread.sleep(2000);
		obj.name();
		obj.setGender("female");
		Thread.sleep(2000);
		obj.submitForm();
		Thread.sleep(2000);
		obj.AddtoCart1();
		Thread.sleep(2000);
		obj.AddtoCart2();
		Thread.sleep(2000);
		obj.AddedToCart();
		Thread.sleep(4000);
		obj.Products();
		Thread.sleep(2000);
		obj.CheckBox();
		Thread.sleep(2000);
		obj.longClick();
		Thread.sleep(2000);
		obj.Closed();
		Thread.sleep(2000);
		obj.Visit();
		Thread.sleep(2000);


		
	     
	}
	
}
