package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Loginpage.Login;

public class Logintest {

	WebDriver driver;
	Login hp;
	
	  @BeforeTest
	  
  public void openapp() {
	driver=new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php?");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();
	  
	  }
	  @Test
	  public void loginapp() {
		  hp = new Login(driver);
		  hp.loginby("test122@gmail.com", "test1234");
	  }
	  
  }



