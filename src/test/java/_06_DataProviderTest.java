import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class _06_DataProviderTest {

    @Test(dataProvider = "loginCredentials")
    public void signIn(String username, String password, String message){
        System.out.println("\n--------------------------\n");
        System.out.println("Username = " + username);
        System.out.println("Password = " + password);
        System.out.println("Message = " + message);
    }

    @Test(dataProvider = "search")
    public void search(String company){
        System.out.println("Company = " + company);
    }

    @DataProvider
    public Object[] loginCredentials(){
        return new Object[][]{
                {"", "", "Invalid Username entered!"},
                {"john", "Test1234", "Invalid Username entered!"},
                {"john", "abcd", "Invalid Username entered!"},
                {"TechGlobal", "abcd", "Invalid Password entered!"}
        };
    }


    @DataProvider
    public Object[] search(){
        return new Object[]{"Apple", "Tesla", "Microsoft"};
    }
}
