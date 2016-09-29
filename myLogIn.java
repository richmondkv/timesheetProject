package myTestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import myTestPack.xpathLib;

public class myLogIn {
	
	private static WebElement element = null;
	private static Select select = null;
	
	public static Select mainSelect (WebDriver driver){
		xpathLib path = new xpathLib();
		//select = new Select(driver.findElement(By.xpath("//select[@name = 'menu1']")));
		select = new Select(driver.findElement(By.xpath(path.mainSelectPath())));
		return select;
	}
	
	public static WebElement myUsername (WebDriver driver){
		xpathLib path = new xpathLib();
		//element = driver.findElement(By.xpath("//input[@name = 'USER']"));
		element = driver.findElement(By.xpath(path.myUsernamePath()));
		return element;
	}
	
	public static WebElement myPassword (WebDriver driver){
		xpathLib path = new xpathLib();
		//element = driver.findElement(By.xpath("//input[@name ='PASSWORD']"));
		element = driver.findElement(By.xpath(path.myPasswordPath()));
		return element;
	}

	public static WebElement logInBtn (WebDriver driver){
		xpathLib path = new xpathLib();
		//element = driver.findElement(By.xpath("//input[@value = 'Log In']"));
		element = driver.findElement(By.xpath(path.logInBtnPath()));
		return element;
	}
	
}


