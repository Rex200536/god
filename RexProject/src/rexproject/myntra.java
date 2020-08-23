package rexproject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	
	List<WebElement> fe = driver.findElements(By.xpath("//div[@class='desktop-categoryContainer']/li/ul/li/a"));
	for (WebElement webElement : fe) {
		System.out.println(webElement.getText());
	}
}
}
