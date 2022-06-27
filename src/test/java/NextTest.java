import org.junit.jupiter.api.Test;

public class NextTest extends BaseTest {
    FindingElements Find = new FindingElements(driver);

    CreateAcountPage CreateTheAcount = new CreateAcountPage(driver);

    @Test
    void CreateTheAcount() {
        Find.FillAcountForm();
        CreateTheAcount.UserName("Jurgita");
        CreateTheAcount.Password("1@1");
        CreateTheAcount.ComfirmPassword("1@1");
        CreateTheAcount.Submit();

    }
}
