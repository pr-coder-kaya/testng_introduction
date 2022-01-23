import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

    @Parameters({"username", "password"})
    @Test()
    public void signIn(String username, String password){
        System.out.println("Username = " + username);
        System.out.println("Password = " + password);
    }
}
