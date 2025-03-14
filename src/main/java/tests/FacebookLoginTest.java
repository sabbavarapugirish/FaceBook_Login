package tests;


import base.baseclass;
import org.testng.annotations.Test;
import pages.FBLogin;

public class FacebookLoginTest extends baseclass {
    static FBLogin page;
    @Test
    public void Login() {
        page = new FBLogin(driver);
        page.login();
    }

    @Test
    public void SignUp()
    {
        page = new FBLogin(driver);
        page.signup();
    }

}

