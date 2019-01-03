package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
//	@FindBy(xpath="//a[@class='close-reveal-modal hide-mobile']")
	@FindBy(linkText="Close")
	private WebElement closeBTN;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void closeButton() {
		closeBTN.click();
	}
}
