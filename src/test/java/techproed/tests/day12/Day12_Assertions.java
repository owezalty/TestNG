package techproed.tests.day12;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day12_Assertions {
    @Test
    public void hardAssert(){
        //import org.testng.Assert; is Hard assertion
        System.out.println("This is line 11");
        Assert.assertEquals(4,4);//fail
        System.out.println("This is line 13");//Hard assert fails, next lines will not run
    }


    @Test
    public void softAssert(){
        //1. Create a SoftAssert object
        //import org.testng.asserts.SoftAssert; is Soft Assert

        SoftAssert softAssert = new SoftAssert();
        System.out.println("This is line 21");
        softAssert.assertEquals(4,5);//fails. This will be on the console as it Failed
        System.out.println("This is line 23");

        softAssert.assertTrue("java".contains("e"));//fails. This will be on the console as it Failed.
        System.out.println("This is line 26");
        softAssert.assertEquals(5,5);//passes. This will NOT be on the console because it Passed.
        softAssert.assertEquals(10,11);
        System.out.println("This is line 28");
        //Be careful when you use soft assertion
        //We must use assertAll() to check which softAssertion pass which one fails
        //softAssert.assertAll();

        /**
        What is soft assertion? => Verifying all test cases using soft assertion. This is like if else statement.
         In this type of assertion, we use soft assert object.
         We also use assertAll to actually see if any soft assert fails.

        What is difference between hard and soft assertion?
         Hard assert => If hard assert fails, the test case will not continue to run.
         Soft assert => If soft assert fails, the test case will continue to run. We must create the object.

        Which assertion do you prefer to use? Why?(Which one is good for testing?) Which one is preferable?
         Ahmet's answer: I prefer hard assertion, because if a step fails, we should immediately check the issue
         without wasting my time.
         Sometimes I use soft assert when I write my initial test cases. Then I see what fails what pass at the end.
         (In testing perspective hard assertion is better.)
         Soft assert is good for writing scratch work.


         */

    }
}
