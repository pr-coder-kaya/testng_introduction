import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class _06_DataProviderTest {
    /*
    TestNG comes up with DataProvider to automate the process of providing test cases for execution.
    DataProvider helps with data-driven test cases that carry the same methods but can be run multiple times with different data sets.
    It also helps in providing complex parameters to the test methods.

    You can see 2 separate tests below utilizing different data sets to execute the same test repeatedly with different data.

    The result of signIn test will be as below
        Username =
        Password =
        Message = Invalid Username entered!
        Username = john
        Password = Test1234
        Message = Invalid Username entered!
        Username = john
        Password = abcd
        Message = Invalid Username entered!
        Username = TechGlobal
        Password = abcd
        Message = Invalid Password entered!


     The result of search test will be as below
        Company = Apple
        Company = Tesla
        Company = Microsoft
     */

    @Test(dataProvider = "loginCredentials")
    public void signIn(String username, String password, String message) {
        System.out.println("Username = " + username);
        System.out.println("Password = " + password);
        System.out.println("Message = " + message);
    }

    @Test(dataProvider = "search")
    public void search(String company) {
        System.out.println("Company = " + company);
    }

    @DataProvider(name = "loginCredentials")
    public Object[] loginCredentials() {
        return new Object[][]{
                {"", "", "Invalid Username entered!"},
                {"john", "Test1234", "Invalid Username entered!"},
                {"john", "abcd", "Invalid Username entered!"},
                {"TechGlobal", "abcd", "Invalid Password entered!"}
        };
    }

    @DataProvider(name = "search")
    public Object[] search() {
        return new Object[]{"Apple", "Tesla", "Microsoft"};
    }
}
