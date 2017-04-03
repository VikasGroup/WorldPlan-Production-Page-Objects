package wpPageobject;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class Online_Login_VOPageObj extends PageObject {
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtTCO")
	WebElement IRID_txt;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtPassword")
	WebElement PWD_txt;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_btnLogin")
	WebElement login_btn;
	
	public void enterIRID(String text){
		IRID_txt.sendKeys(text);
	}	
	public void enterPWD(String text){
		PWD_txt.sendKeys(text);
	}
	public void clickLogin(){
		login_btn.click();
	}

}
