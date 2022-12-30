package techproed.utilities;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    //This class will only be used for getting the data
    //from configuration.properties file.
    private static Properties properties;
    static {
        //path of the config file
        String path = "configuration.properties";

        try {
            //opening the file
            FileInputStream file = new FileInputStream(path);
            //loading the file
            properties = new Properties();
            properties.load(file);
            //closing the file
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //This method accepts the key and returns the value
    public static String getProperty(String key){
        String value = properties.getProperty(key);
        return value;
    }

    //Test
//    @Test
//    public void test1(){
//        System.out.println(getProperty("google_url"));//https://www.google.com
//        System.out.println(getProperty("test_environment"));
//        System.out.println(getProperty("url"));
//    }



}
