package tests;

import Pages.FirstPage;
import Pages.SecondPage;
import browser.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {

    @BeforeTest
    void initialize(){
        Browser.launch();
        Browser.navigate();
    }

    @Test
    void test1() throws InterruptedException {
        FirstPage.firstPage();
    }

    @Test
    void test2(){
        SecondPage.secondPage();
    }

    @AfterTest
    void endTests(){
        Browser.close();
    }

}
