package day02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02JunitAnnotations {

      /*
    * *****ANNOTATIONS******
    "There are 6 annotations commonly used:

     @Test: Allows us to create an independent test that can run on its own. Return type -> void

     * @Before: Used for the method where preparations to be done before the test starts. It runs before each method.

     @BeforeClass: Similar to @Before but runs only once at the beginning of the class, unlike @Before. Must be static.

     @After: Runs after each test, performing functions such as closing after the test is done.

     @AfterClass: Runs once at the end of each class, must be static.

     @Ignore: Ensures that the annotated method is not executed. When the test is run, the report shows that this method is marked as ignored."

     */

    WebDriver driver; // we nede to use this her out side to use it every time

    @Before
    public void beforeEachTest() {

        driver = new ChromeDriver();

        System.out.println("Before Annotation is executed ... ");

    }

    @After
    public void afterEveryTest() {

        driver.quit();
        System.out.println("After annotation is executes... ");
    }

    @Test
    public void test1() {

        driver.get("https://www.clarusway.com");
        System.out.println("Test 1 is executes... ");
    }

    @Test
    public void test2() {

        driver.get("https://www.google.com");
        System.out.println("Test 2 is executes... ");
    }

}
