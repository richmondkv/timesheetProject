package myTestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class myHomePage {
	
	private static WebElement element = null;
	
	public static WebElement empSelfService (WebDriver driver){
		//element = driver.findElement(By.xpath("//a[@href = '#dummyAnchor1' and text() = 'Genpact CM Singapore Employee Self Service']"));
		element = driver.findElement(By.xpath("//*[text()[contains(.,'Employee Self Service')]]"));
		//element = driver.findElement(By.xpath(x));
		return element;
	}
	
	public static WebElement managerSelfService (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[text()[contains(.,'Manager Self Service')]]"));
		return element;
	}
	
	public static WebElement timeSheetSelfService (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[text()[contains(.,'Timesheet Self Service')]]"));
		return element;
	}
	
}
