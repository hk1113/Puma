package Testbase;

import Utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public static WebDriver driver;
    public Properties prop;

    public WebTestBase() {
        prop = new Properties();
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/Properties/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            prop.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void intialization() {
        String browseName = prop.getProperty("browser");
        if (browseName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.setBinary("C:/Users/ajayh/Downloads/chrome-win64/chrome.exe");

            System.setProperty("webDriver.chrome.driver","C:\\Users\\ajayh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver(options);

        } else if (browseName.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            //set the path of Edge Browser
            options.setBinary("C:/Users/ajayh/Downloads/msedgedriver.exe");
            options.addArguments("--remote-allow-origins=*");
            //set the path of Edge Driver
            System.setProperty("webdriver.edge.driver","C:\\Users\\ajayh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver(options);

        } else {
            throw new RuntimeException("Please Select Correct Browser option");
        }
        driver.navigate().to(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds((Utility.PAGE_LOAD)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.IMPLICIT_WAIT));
        driver.manage().deleteAllCookies();
    }

}


