package techproed.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
        What is Driver? = Create and initialize Driver instance
        Why? => Reusable . Avoid duplication.
        Faster development
     */

    private static WebDriver driver;

    private Driver(){
    }
    //Create getDriver method to Create and initialize the driver instance
    public static WebDriver getDriver(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){//If the driver is Pointing somewhere such as chromedriver
            driver.quit();//close it
            driver=null;//After you quit set the driver null again.
        }
    }


}
