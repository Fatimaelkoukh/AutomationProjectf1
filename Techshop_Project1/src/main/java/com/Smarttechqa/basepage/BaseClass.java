package com.Smarttechqa.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass {

	
	public static void setUp(){
					
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe ");	
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.smarttechqa.com/login");
		
		//driver.findElement(By.id("email")) .sendKeys("Ftestuser@email.com");
		driver.findElement(By.xpath("//*[@type='email']")) .sendKeys("Ftestuser@email.com");
		//driver.findElement (By.id("password")) .sendKeys("qwerty");
		driver.findElement(By.cssSelector("#password")) .sendKeys("qwerty");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")) .click();
		//System.out.println(driver.getTitle());
		System.out.println("This application name is: "+driver.getTitle());
	    System.out.println("Create my first automation project and apload it to GitHub");
			
		driver.quit();
		
		
	
		
	}
		
		public static void main(String[] args) {
			BaseClass.setUp();
			
		}
	}
	


