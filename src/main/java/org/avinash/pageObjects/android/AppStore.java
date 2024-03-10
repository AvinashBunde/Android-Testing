package org.avinash.pageObjects.android;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppStore {
	
	public AndroidDriver driver;                                
	public AppiumDriverLocalService service;                      
        
	@BeforeClass
	public void GeneralTest() throws MalformedURLException, URISyntaxException
	{
	      service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\avina\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
		  withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(3000)).build();    
	   
	      service.start();                                        
	
		
	      UiAutomator2Options options = new UiAutomator2Options();     
		  options .setDeviceName("Rolex");                   
		  options.setApp("C:\\Users\\avina\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\General-Store.apk");   

		  driver= new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		 	 
	}
	
	public Double getFormattedAmount(String amount) {
		Double price = Double.parseDouble(amount.substring(1));
		return price;
	}
	
	@AfterClass
	      public void tearDown() throws InterruptedException 
	{
		driver.quit();
		Thread.sleep(2000);
		service.stop();   
		
	}
	
}


