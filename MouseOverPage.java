package Pages;

import Utility.ActionUtility;
import Utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Testbase.WebTestBase.driver;

public class MouseOverPage {
    @FindBy(xpath = "//span[text()='New']")
    WebElement mouseOverElement;

    @FindBy(xpath = "//a[text()='Launch Calendar']")
    WebElement LaunchCalendar;

    public MouseOverPage(){
        PageFactory.initElements(driver, this);
    }
    public void mouseOverAction1(){
        ActionUtility.mouseOverAction(mouseOverElement);}


    public void clickOnLaunchCalendar(){
        Utility.explicitWaitForElement(LaunchCalendar);
}

}