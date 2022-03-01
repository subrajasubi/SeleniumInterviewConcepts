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
import org.openqa.selenium.Alert;
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

public class WebTable {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table_id']//th"));
		int size = columns.size();
		System.out.println("No : of Columns - " +size);
		System.out.println("*****");
		System.out.println("List of columns : ");
		for (WebElement each : columns) {
			String data = each.getText();
			System.out.println(data);
		}
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr//td[1]"));
		int size1 = rows.size();
		System.out.println("No : of rows - " +size1);
		System.out.println("*****");
		System.out.println("List of rows : ");
		for (WebElement eachlist : rows) {
			String data2 = eachlist.getText();
			System.out.println(data2);
		}
		String text = driver.findElement(By.xpath("(//td[text()='80%'])[1]")).getText();
		System.out.println("Progress value of learn to interact is : "  +text);
		driver.findElement(By.xpath("(//input[@name='vital'])[3]")).click();
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement eachcheck : checkbox) {
			eachcheck.click();
			
		}
		
		
		
		
		
		
		
		
		
		
		
	
		}
		
	
		}
		

	 




			
		
        
	    
	

	
   
    

	
	
	


