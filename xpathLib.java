package myTestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathLib {

	private String tempString = null;
	private String mainSelect = "//select[@name = 'menu1']";
	private String myUsername = "//input[@name = 'USER']";
	private String myPassword = "//input[@name ='PASSWORD']";
	private String logInBtn = "//input[@value = 'Log In']";
	
	public String mainSelectPath (){
		this.tempString = mainSelect;
		return this.tempString;
	}
	
	public String myUsernamePath (){
		this.tempString = myUsername;
		return this.tempString;
	}
	
	public String myPasswordPath (){
		this.tempString = myPassword;
		return this.tempString;
	}
	
	public String logInBtnPath (){
		this.tempString = logInBtn;
		return this.tempString;
	}
	
}
