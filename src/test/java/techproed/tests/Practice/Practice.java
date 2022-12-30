package techproed.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Practice {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void softAssert(){
        String googleTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Beginning of soft assert");
        softAssert.assertEquals("Google",googleTitle);
        System.out.println("Running after first assert");
        softAssert.assertEquals("3","3");
        System.out.println("Running after second assert");
        softAssert.assertTrue(true);
        System.out.println("Running after third assert");
        softAssert.assertAll();
        System.out.println("Running after soft assertAll() assert");

    }



}
