package Testbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyaccPage extends WebTestBase {
    @FindBy(xpath = "(//button[@type='button'])[3]")
    WebElement myAccountText;

    public MyaccPage() {
        PageFactory.initElements(driver,this);
    }

    public long getTextOfmMyAccount() {

        return 0;
    }
}
