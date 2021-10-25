package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");
		//create an object of ChromeBrowser - new instance of a browser 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium books");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String title=driver.getTitle();
		if(title.equals("Amazon.in : selenium books"))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
	}
	
}
