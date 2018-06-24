package com.dice2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiceJobSearch2 {

	public static void main(String[] args) throws InterruptedException {
		
		
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      
      String url = "https://www.dice.com";
      driver.get(url);
      
      driver.manage().window().fullscreen();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      
      
      ArrayList<String> namesOfPosition = new ArrayList<String>();
      
         namesOfPosition.add("Java Developer");   // :1
		 namesOfPosition.add("Python Developer"); // :2
		 namesOfPosition.add("C# developer");     // :3
		 namesOfPosition.add("selenium tester");  // :4
		 namesOfPosition.add("api tester");       // :5
		 namesOfPosition.add("linux system administrator");  // :6
		 namesOfPosition.add("linux engineer"); // :7
		 namesOfPosition.add("amazon web services"); // :8
		 namesOfPosition.add("linux net work administrator"); // :9
		 namesOfPosition.add("api developer"); // :10
		 namesOfPosition.add("AWS Cloud Engineer"); // :11
		 namesOfPosition.add("AWS DevOps Engineer"); // :12
		 namesOfPosition.add("Software Engineer"); // :13
		 namesOfPosition.add("Software Developer"); // :14
		 namesOfPosition.add("Software Test Engineer"); // :15
		 namesOfPosition.add("Software Tester"); // :16
		 namesOfPosition.add("QA Analyst"); // :17
		 namesOfPosition.add("QA analist "); // :18
		 namesOfPosition.add("Data Scientist"); // :19
		 namesOfPosition.add("data base server admin"); // :20
		
      for (int i = 0; i < 20; i++) {
    	  driver.get(url);
    	  
    	WebElement jobs =driver.findElement(By.id("search-field-keyword"));
    	jobs.clear();
    	jobs.sendKeys(namesOfPosition.get(i));
    	Thread.sleep(1000);
//    	String location =driver.findElement(By.id("Chicago,IL")).
    	WebElement location = driver.findElement(By.id("search-field-location"));
    	location.clear();
    	location.sendKeys("Chicago IL");
    	Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='findTechJobs']")).click();;
        

    	
    	
    	  
		
	}
      
	
      
      
      
      
	}

}
//1)Create arraylist of keywords.
//add 20 different keyworks
//list.add("java");
//
//pass each item to search box and print accordingly.
//modify your arraylist
//
//java-1234
//
//2) Store all keywords into a text file
//read the text file and repeat above steps.
//
//store keyword and results count into an arraylist.
//----
//
//after closing browser.
//print contents of arraylist that was updated each time
//we looped.
//
//commit > push > share your github link