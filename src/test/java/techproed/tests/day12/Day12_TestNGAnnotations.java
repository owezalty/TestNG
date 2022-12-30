package techproed.tests.day12;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day12_TestNGAnnotations {

    /**
     * @Test:  creates test case
     * @BeforeMethod => This runs before each @Test annotation. Same as  @Before in Junit.
     * @AfterMethod  => This runs after each @Test annotation. Same as  @After in Junit.
     * @Ignore       => skips the test case.
     * @Test(enabled = false) => disables the test case. You cannot run that test anymore.
     *
     *
     *
     * @Test(priroty=1) =>
     * TestNG runs in alphabetical order by default.
     * Use priority to order test cases.
     * TestNG @Test methods run by alphabetical order, NOT FROM TOP TO THE BOTTOM by default.
     * Priority is used to prioritize the test cases that are in the same class.
     *
     * Why do you need @BeforeMethod?
     * -Pre conditions(setUp) : Create driver, implicitly wait, maximize window, used to avoid repetition.
     * Why do you need @AfterMethod?
     * - Post condition : Closing driver(tearDown), generating reports, taking screenshots, used to avoid repetition.
     * Why do you need @Test annotation?
     * - To create test scripts(cases).
     *
     *
     *
     */

    @BeforeMethod
    public void setUp(){
        System.out.println("This is before method");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("This is after method");
    }

    @Test(enabled = false)
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test
    @Ignore
    public void test2(){
        System.out.println("This is test 2");
    }

    @Test(priority = 1)
    public void test4(){
        System.out.println("This is test 4");
    }

    @Test(priority = 2)
    public void test5(){
        System.out.println("This is test 5");
    }

    @Test(priority = 3)
    public void test3(){
        System.out.println("This is test 3");
    }







}
