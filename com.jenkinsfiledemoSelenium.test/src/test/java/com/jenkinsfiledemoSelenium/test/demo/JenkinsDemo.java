package com.jenkinsfiledemoSelenium.test.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JenkinsDemo {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       String baseUrl = "https://www.google.com";
	       String expectedTitle = "Google";
	       String actualTitle = "";
	       driver.get(baseUrl);
	       actualTitle = driver.getTitle();
	       if (actualTitle.contentEquals(expectedTitle)){
	           System.out.println("TEST PASSED!");
	       } else {
	           System.out.println("TEST FAILED");
	       }
	       driver.close();

	}

}
