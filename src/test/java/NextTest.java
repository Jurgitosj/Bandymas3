import org.junit.jupiter.api.Test;

public class NextTest extends BaseTest {
    FindingElements Find = new FindingElements(driver);

    CreateAccountPage createTheAccount = new CreateAccountPage(driver);

    @Test
    void createAccount() {
        Find.fillAccountForm();
        createTheAccount.userNameMethod("Jurgita");
        createTheAccount.passwordMethod("1@1");
        createTheAccount.confirmPasswordMethod("1@1");
        createTheAccount.toRegisterMethod();

    }
}
