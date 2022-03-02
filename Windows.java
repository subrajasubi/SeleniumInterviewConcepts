package week1.day2.test;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.leafground.com/pages/Window.html");
		String title = driver.getTitle();
		System.out.println("Old window : " +title);
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
	    Set<String> window = driver.getWindowHandles();
	    List<String> handles = new ArrayList<String>(window);
	    driver.switchTo().window(handles.get(1));
	    String title2 = driver.getTitle();
	    System.out.println("New window : " +title2);
	    driver.switchTo().window(handles.get(0));
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> window1 = driver.getWindowHandles();
	    List<String> handles1 = new ArrayList<String>(window1);
	    driver.switchTo().window(handles1.get(1));
	    System.out.println("Number of windows opened : " +handles1.size());
	    driver.switchTo().window(handles1.get(2));
	    driver.close();
	    driver.switchTo().window(handles.get(0));
	    driver.findElement(By.id("color")).click();
		
		
	
		}
		
	
		}
		

	 




			
		
        
	    
	

	
   
    

	
	
	


