package day08;

import org.junit.Test;
import utilities.TestBase;

public class C03BaseClass extends TestBase {

    @Test
    public void test() {

        driver.get("https://www.google.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @Test
    public void test2() {

        driver.get("https://www.clarusway.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @Test
    public void test3() {

        driver.get("https://www.Amazon.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }


}
