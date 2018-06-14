package com.mineone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDiceJobs {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://dice.com");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<String> key = new ArrayList<>();
		key.add("Java");
		key.add("Selenium");
		key.add("Selenium Automation Engineer");
		key.add("SDET");
		key.add("Manual Tester");
		key.add("Business Analyst");
		key.add("Java Developer");
		key.add("Javascript");
		key.add("Senior Automation Tester");
		key.add("Front End Developer");
		key.add("Back End Developer");
		key.add("Database Engineer");
		key.add("QA");
		key.add("QA Tester");
		key.add("Data Analyst");
		key.add("Project Manager");
		key.add("Scrum Master");
		key.add("Tech Team Lead Position");
		key.add("Scrum Team");
		key.add("Android Developer");
		
		List<String> newkey = new ArrayList<>();
		List<String> secondkey = new ArrayList<>();
		
		for(String list: key) {
			driver.findElement(By.id("search-field-keyword")).sendKeys(list);
			driver.findElement(By.id("search-field-location")).clear();
			driver.findElement(By.id("search-field-location")).sendKeys("22204");
			driver.findElement(By.id("findTechJobs")).click();
			String count = driver.findElement(By.id("posiCountId")).getText();
			newkey.add("Job position: "+ list + " - has " + count.replace(",", "") +
					" position openings in your area");
			driver.navigate().back();
		}		
		for(String prints: newkey) {
			System.out.println(prints);
		}		
		
		
		//====================================================================================
		
				

	       
	
	}
}
