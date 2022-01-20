import org.testng.annotations.Test;

public class _02_Priority_of_Tests {
    /*
    In the  class "_01_TestAnnotation", we have seen that tests will execute alphabetically unless you define an order externally
    "priority" keyword can be used to define a pattern (order of execution) between the tests you have in a class
    NOTE: Every test has priority of zero (0) by default
    NOTE: Lower priorities will be executed first.
    NOTE: Priority can be set as negative number as well
    NOTE: If multiple tests are given same priority, then they will execute alphabetically in their own order

    So, below 3 methods will execute alphabetically and result will be as below if you don't define any priority
    RESULT WITHOUT PRIORITY
    This is method1
    This is method2
    This is method3

    BUT, with priority added, we will get tests executed as below
    This is method2
    This is method1
    This is method3

    Note that, method1 has priority of 2, method2 has priority of 1 and method3 has priority of 3
     */

    @Test(priority = 2)
    public void method1(){
        System.out.println("This is method1");
    }

    @Test(priority = 1)
    public void method2(){
        System.out.println("This is method2");
    }

    @Test(priority = 3)
    public void method3(){
        System.out.println("This is method3");
    }
}
