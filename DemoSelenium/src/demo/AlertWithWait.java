package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.WebBrowser;

public class AlertWithWait {

	public static void main(String[] args) {
		WebDriver driver = WebBrowser.openBrowser("https://demoqa.com/alerts");
		driver.findElement(By.id("timerAlertButton")).click();
		try
		{
			Alert a =driver.switchTo().alert();
			a.accept();
			}
		catch(NoAlertPresentException e)
		{
			WebDriverWait wait = new WebDriverWait(driver,15);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert a =driver.switchTo().alert();
			a.accept();
		}

	}

}
