package com.gt.Sep12.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon extends FunctionalLibrary{
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driverInit(chrome);
		driver.get("https://www.amazon.in/");
	
			public static void click(WebElement element) {
			try {
				element.click();
				Reporter.addStepLogPass(element.toString() + "element is clicked successfully");

			} catch (Exception e) {
				Reporter.addStepLogInfo(element.toString() + "element is not clicked" + e.getMessage());
			}
		}}
	public static void Filter_based_on_Rating_4star(WebElement element) {
		click(WebElement Rating_4star_btn);
			
	}

}

