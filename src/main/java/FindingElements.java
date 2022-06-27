import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindingElements extends BasePage {
    public FindingElements(WebDriver driver){
        super(driver);}

    @FindBy(xpath =" /html/body/div/form/div/button")
    public WebElement login;

    @FindBy(xpath = "/html/body/div/form/div/h4/a")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[@id=\"userForm\"]/button")
    public WebElement submitRegistrationButton;

    void fillAccountForm() {
        createAccountButton.click();}

//    void toRegister() {
//        submitRegistrationButton.click();}

    void toJoin() {
        login.click();}



}

