import org.testng.annotations.Test;

public class _03_Description_of_Tests {
    /*
    "description" keyword is used to give a test some description to show in results when executed

    NOTE: In below example, both priority and description are used together. This is possible with coma (,) separator.
     */

    @Test(priority = 1, description = "Validate some method1")
    public void method1(){
        System.out.println("This is method1");
    }

    @Test(priority = 1, description = "Validate some method2")
    public void method2(){
        System.out.println("This is method2");
    }
}
