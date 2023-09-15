package Pages;

import Utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Testbase.WebTestBase.driver;


public class Homepage {

    @FindBy(xpath ="(//button[@type='button'])[3]")
    WebElement LoginRegisterBtb;

    @FindBy(xpath = "//div[text()='Login']")
    WebElement loginBtn;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
    public void clickOnLogin() {
        Utility.waitUntilElementToBeClickable(LoginRegisterBtb);
    }
    @FindBy(xpath = "//span[text()='New']")
    WebElement mouseoverelement;

    @FindBy(xpath = "//a[text()='Launch Calendar']")
    WebElement LaunchCalendar;

}
