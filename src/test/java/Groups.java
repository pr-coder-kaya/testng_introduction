import org.testng.annotations.Test;

@Test(groups = "Login")
public class Groups {

    @Test(groups = "Smoke")
    public void groupMethod1(){
        System.out.println("This is group method 1 | Smoke");
    }

    @Test(groups = {"Smoke", "Functional"})
    public void groupMethod2(){
        System.out.println("This is group method 2 | Smoke & Functional");
    }

    @Test(groups = {"Regression", "Functional"})
    public void groupMethod3(){
        System.out.println("This is group method 3 | Regression & Functional");
    }

    @Test(groups = "Regression")
    public void groupMethod4(){
        System.out.println("This is group method 4 | Regression");
    }

    @Test(groups = "Regression")
    public void groupMethod5(){
        System.out.println("This is group method 5 | Regression");
    }
}
