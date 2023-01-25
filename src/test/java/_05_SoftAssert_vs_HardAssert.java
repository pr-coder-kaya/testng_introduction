import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _05_SoftAssert_vs_HardAssert {
    /*
    Soft asserts are the asserts which continue the execution even the Assert condition fails.
    Soft asserts are mainly used to verify certain test conditions in the code.
    It is used in a case when the passing of one test condition is not necessary to execute the upcoming tests.

    Hard Asserts are used when you want to stop the execution of the test when the assert condition does not match with the expected result.
    It throws AssertionError at the line that does not meet the expected result.

    In the hardAssertionExample below, it will throw an AssertionError and will not print the "Hello World" as execution will stop due to the error

    However, in the softAssertionExample, the execution will continue even though assertion fails and "Hello World" will be printed
    assertAll() method at the end is going to attach failure to the console.
     */

    @Test
    public void hardAssertionExample(){
        Assert.assertEquals("Hello", "abc"); // Failure but it will stop the test execution
        System.out.println("Hello World");
    }

    @Test
    public void softAssertionExample(){
        //We need create an object of SoftAssert class
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals("Hello", "abc"); // Failure but it will allow the test execution to continue
        System.out.println("Hello World");
        softAssert.assertAll();
    }
}
