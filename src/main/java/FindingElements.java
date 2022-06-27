import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindingElements extends BasePage {
    public FindingElements(WebDriver driver){
        super(driver);}

    @FindBy(xpath =" /html/body/div/form/div/button")
    public WebElement Login;

    @FindBy(xpath = "/html/body/div/form/div/h4/a")
    public WebElement CreateAcount;

    @FindBy(xpath = "//*[@id=\"userForm\"]/button")
    public WebElement Registration;

    public void FillAcountForm() {CreateAcount.click();}

    public void ToRegister() {Registration.click();}

    public void ToJoin() {Login.click();}



}

