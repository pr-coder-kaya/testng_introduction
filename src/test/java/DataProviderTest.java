import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @Test(dataProvider = "loginCredentials")
    public void signIn(String username, String password){
        System.out.println("Username = " + username);
        System.out.println("Password = " + password);
    }

    @Test(dataProvider = "search")
    public void search(String company){
        System.out.println("Company = " + company);
    }

    @DataProvider
    public Object[] loginCredentials(){
        Object[][] credentials = new Object[4][2];
        credentials[0][0] = "user1";
        credentials[0][1] = "password1";
        credentials[1][0] = "user2";
        credentials[1][1] = "password2";
        credentials[2][0] = "user3";
        credentials[2][1] = "password3";
        credentials[3][0] = "user4";
        credentials[3][1] = "password4";

        return credentials;
    }


    @DataProvider
    public Object[] search(){
        return new Object[]{"Apple", "Tesla", "Microsoft"};
    }
}
