package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.WebBrowser;
/*When we test for alert it is called as yellow box testing
 * Alert is javacript or window message
 * Confirm alert is alert which display information where we can accept(ok) or deny(Cancel)
 */

public class ConfirmAlert {

	public static void main(String[] args) {
	
		WebDriver driver = WebBrowser.openBrowser("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				
		try
		{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert = driver.switchTo().alert();
		String expected = "Press a Button !";
		String actual =alert.getText();
		System.out.println(actual);
		if(expected.equals(actual))
		{
			System.out.println("Both matches");
		}
		//cancel click
		Thread.sleep(5000);
		alert.dismiss();
		/*ok click
		 * alert.accept();
		 */
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		driver.close();
	}
	}


