package techproed.tests.day13;

import org.testng.annotations.Test;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;

public class Day13_FirstDriverClass {

    @Test
    public void firstDriverTest(){
        //driver =>>>> Driver.getDriver();
//        Driver.getDriver().get("https://www.amazon.com/");
//        Driver.getDriver().navigate().to("https://www.google.com/");

        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("google_url"));


        System.out.println("Google Title : " + Driver.getDriver().getTitle());
        Driver.closeDriver();

    }

}
