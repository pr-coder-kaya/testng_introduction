import org.testng.annotations.Test;

public class _04_Dependency_Between_Tests {
    /*
    Without any dependency created between below test cases, the order of execution will be as below
    This is method1
    This is method2
    This is method3

    However, TestNG provides us a property known as "dependsOnMethods" which can be used to override
    priority and create dependency between tests. Here, we will make method1 to be dependant from method2
    using "dependsOnMethods" property and the new order of execution will be as below
    This is method2
    This is method1
    This is method3
     */

    @Test(priority = 1, dependsOnMethods = "method2")
    public void method1(){
        System.out.println("This is method1");
    }

    @Test(priority = 2)
    public void method2(){
        System.out.println("This is method2");
    }

    @Test(priority = 3)
    public void method3(){
        System.out.println("This is method3");
    }

}
