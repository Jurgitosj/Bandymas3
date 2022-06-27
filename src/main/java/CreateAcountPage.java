import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAcountPage extends BasePage {


    public CreateAcountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath =" /html/body/div/form/div/h4/a")
    public WebElement registracijosFormosMygtukas;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement username;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"passwordConfirm\"]")
    public WebElement passwordComfirm;

    @FindBy(xpath = "//*[@id=\"userForm\"]/button")
    public WebElement submit;

    public void RegistracijosFormosMygtukas() {registracijosFormosMygtukas.click();}

    public void UserName(String value) {username.sendKeys(value);}

    public void Password(String value) {password.sendKeys(value);}

    public void ComfirmPassword(String value) {passwordComfirm.sendKeys(value);}

    public void Submit() {submit.click();}


}

