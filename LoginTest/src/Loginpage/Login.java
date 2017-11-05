package Loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;





 public Login(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath = "//*[@class='login']")
	WebElement loginbtn;

	@FindBy(xpath = "//*[@id='email']")
	WebElement txt_username;

	@FindBy(xpath = ".//*[@id='passwd']")
	WebElement txt_password;

	@FindBy(xpath = ".//*[@id='SubmitLogin']")
	WebElement submit;

	public void loginby(String username, String password) {
		loginbtn.click();
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		submit.click();
	}

}
