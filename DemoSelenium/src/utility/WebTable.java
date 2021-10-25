package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable {
	public static List<String>getRowData(WebDriver driver, By locator, int rownum)
	{
		List<String> rowdata = new ArrayList<>();
		WebElement table = driver.findElement(locator);
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> cells = rows.get(rownum).findElements(By.tagName("td"));
		for(WebElement cell : cells) {
			rowdata.add(cell.getText());
		}
		return rowdata;
	}
	
public static String getCellData(WebDriver driver, By locator, int rownum, int column)
{
	WebElement table = driver.findElement(locator);
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	List<WebElement> cells = rows.get(rownum).findElements(By.tagName("td"));
	String data = cells.get(column).getText();
	return data;
}
}

