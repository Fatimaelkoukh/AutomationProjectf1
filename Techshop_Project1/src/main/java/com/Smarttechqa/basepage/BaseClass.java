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
		
	    
	    driver.findElement(By.xpath("//a[@href='/cart']")).click();
		//driver.findElement(By.linkText("Go Back")).click(); //this will take me back to the home page from the cart page
		driver.findElement(By.partialLinkText("Go")).click();
		driver.findElement(By.name("q")).sendKeys("iphone"); //Sends keys to the searchbox
		//driver.findElement(By.cssSelector(".p-2 btn btn-outline-success")).click();
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		driver.navigate().back(); //This takes to the previous page.
		driver.navigate().refresh(); //This will click on the refresh button and refreshes the page. 
		//driver.navigate().to("https://www.smarttechqa.com/"); //This is the same as the get method
		//driver.quit();
		//added comment for git pull
		
		
		
	
		
	}
		
		public static void main(String[] args) {
			BaseClass.setUp();
			
		}
	}
	


