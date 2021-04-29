import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyAgeModal extends PageBase {

    private By yesButtonBy = By.xpath("//div/div/a[@class='btn btn-default age-accept']");

    public VerifyAgeModal(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.kesvilag.hu/");
    }

    public MainPage verify() {
        this.waitAndReturnElement(yesButtonBy).click();
        return new MainPage(this.driver);
    }
}
