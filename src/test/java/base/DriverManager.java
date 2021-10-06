package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {

        WebDriver driver=null;//to use it for chrome & edge
        public WebDriver getBrowserDriver(String driverName){//WebDriver as returning driver
            if(driverName.equalsIgnoreCase("chrome")) {//chrome
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }else if(driverName.equalsIgnoreCase("msedge")){//edge
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            }
            driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return driver;
        }
    }

//mvn compile this class