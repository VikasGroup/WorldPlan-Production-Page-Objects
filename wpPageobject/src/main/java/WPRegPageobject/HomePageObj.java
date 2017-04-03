package WPRegPageobject;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;


public class HomePageObj extends PageObject {

	@FindBy(id="ctl00_ctl11_hlLogin")
	WebElement login_btn;
	
	public void clickLogin(){
		login_btn.click();
	}
}
