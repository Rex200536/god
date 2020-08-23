package rexproject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	static WebDriver driver;

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("file:///E:/Eclipse/RexProject/src/rexproject/table.html");
		driver.manage().window().maximize();

	}

	public void totalNoofrows() {

		List<WebElement> row = driver.findElements(By.xpath("//table[@name='salary']/tbody/tr"));

		int size = row.size();
		System.out.println(size);
		for (WebElement tor : row) {
			System.out.println(tor.getText());

		}
	}

	public void headerList() {
		List<WebElement> header = driver.findElements(By.xpath("//table[@name='salary']/tbody/tr[1]/th"));
		for (WebElement header1 : header) {
			System.out.println(header1.getText());

		}
	}

	public void allRows() {
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@name='salary']//tr"));
		for (int i = 1; i <= allrows.size(); i++) {
			List<WebElement> alr = allrows.get(i).findElements(By.tagName("td"));
			for (WebElement al1 : alr) {
				System.out.print(al1.getText());
			}
			System.out.println();
		}

	}

	public static void addCost() {

		List<WebElement> fin = driver.findElements(By.xpath("//table//tr[position()>1]/td[1]"));

		
		for (int i = 0; i < fin.size(); i++) {
			System.out.println(fin.get(i).getText());
		}

	}
	
	
	public void addSalary() {
		
		List<WebElement> addSalary = driver.findElements(By.xpath("//table//tr[position()>1]/td[3]"));
		int sum = 0;
		for (int i = 0; i < addSalary.size(); i++) {
			
		sum= sum+Integer.parseInt(addSalary.get(i).getText());
		
			
		}
System.out.println(sum);
	}

	public static void main(String[] args) {
		WebTable we = new WebTable();
		we.launchbrowser();
		/*
		 * we.totalNoofrows(); we.headerList(); we.allRows();
		 */
		we.addCost();
		we.addSalary();

	}

}
