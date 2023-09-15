package Testbase;

import Utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends WebTestBase {

    @FindBy(xpath = "//div[text()='Login with Email and Password']")
    WebElement clickOnLoginBtn;
    @FindBy(id = "email")
    WebElement emailTextBox;
    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(xpath = "//div[text()='Login']")
    WebElement getClickOnLoginBtn;
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


        public void login(String email, String password){
            clickOnLoginBtn.click();
            emailTextBox.sendKeys(email);
            passwordTextBox.sendKeys(password);
            getClickOnLoginBtn.click();

    }
}
