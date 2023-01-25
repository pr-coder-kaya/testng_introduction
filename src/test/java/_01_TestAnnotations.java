import org.testng.annotations.Test;

public class _01_TestAnnotations {
    /*
    @Test annotation marks a method as part of the test.
    -We can have multiple tests created in same class
    -All tests will execute alphabetically unless you define an order externally

    The result of tests below will be:
    This is login method
    This is logout method
    This is validate method

    NOTE: You can run specific method with the run button on the method level left to the method name
    NOTE: You can run all methods with the run button on the class level left to the class name on the top
     */

    @Test
    public void login(){
        System.out.println("This is login method");
    }

    @Test
    public void validate(){
        System.out.println("This is validate method");
    }

    @Test
    public void logout(){
        System.out.println("This is logout method");
    }
}
