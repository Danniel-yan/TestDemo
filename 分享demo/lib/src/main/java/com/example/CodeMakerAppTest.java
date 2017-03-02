//package com.example;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//import io.appium.java_client.android.AndroidDriver;
//
//
//public class CodeMakerAppTest {
//
//	public static void main(String[] args) throws MalformedURLException {
//
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("appium-version", "1.0");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("platformVersion", "4.4.4");
//		capabilities.setCapability("deviceName", "HM NOTE 1LTE");
//		capabilities.setCapability("app", "/Users/admin/appium_test/app-release.apk");
//		capabilities.setCapability("appPackage", "com.newgame.sdk");
//		capabilities.setCapability("appActivity", "com.newgame.sdk.MainActivity");
//
////        AppiumDriver wd;
//        AndroidDriver wd;
//        wd = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//
//        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//
//       String text = wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]")).getText();
//        System.out.println("text---------------------------->" + text);
//		assert "测试".equals(text):"Out assertion failed!";
//		System.out.println("测试结束----------->");
//
////        assert
//        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[3]")).click();
//        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
//        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
//        wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[2]/android.widget.ImageView[1]")).click();
//        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();
//        wd.close();
//
//	}
//}
