import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends PageBase {

    By orderByButtonBy = By.id("dropdownMenu1");
    By priceAscending = By.xpath("//ul/li/a[@href='kereses/1/0,1319990,1,damaszk,,,']");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void orderByPriceAsc() {
        this.waitAndReturnElement(orderByButtonBy).click();
        this.waitAndReturnElement(priceAscending).click();
    }
}
