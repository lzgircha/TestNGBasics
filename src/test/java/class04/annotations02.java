package class04;

import org.testng.annotations.*;

public class annotations02 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }
    @BeforeMethod
    public void before(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("I am after method");
    }
    @Test
    public void TestA(){
        System.out.println("I an test A");
    }
    @Test
    public void TestB(){
        System.out.println("I an test B");
    }
}
