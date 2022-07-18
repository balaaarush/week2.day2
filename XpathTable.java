package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/in/bangalore");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='placeholder']")).click();
		driver.findElement(By.xpath("//div[text()='Bangalore International Airport']")).click();
		
		
		

	}

}
