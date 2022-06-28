import org.junit.jupiter.api.Test;

public class NextTest extends BaseTest {

    CreateAccountPage createTheAccount = new CreateAccountPage(driver);

    LoginPage loginToPage = new LoginPage(driver);

    LoginOutPage outButton = new LoginOutPage(driver);

    @Test
    void createAccount() {

        createTheAccount.fillAccountForm();
        createTheAccount.userNameMethod("JOVITA");
        createTheAccount.passwordMethod("01234567");
        createTheAccount.confirmPasswordMethod("01234567");
        createTheAccount.toRegisterMethod();
        outButton.logOutMethod();


    }
//    @Test
//    void loginPage() {
//        loginToPage.loginUsernameMethod("Jurgita");
//        loginToPage.loginPasswordMethod("01234567");
//        loginToPage.toLoginMethod();
//        outButton.logOutMethod();
//    }



}
