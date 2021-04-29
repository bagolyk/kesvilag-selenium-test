import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideSearchPanel extends PageBase {

    private String pathBase = "//form[@class='filter-form']/div[@class='panel-sidememnu']";
    private By searchFieldBy = By.xpath(pathBase + "/div/div/div/input[@name='search']");
    private By searchButton = By.xpath("//form[@class='filter-form']/div/button[@class='btn btn-default']");

    public SideSearchPanel(WebDriver driver) {
        super(driver);
    }

    public void fillSearchField(String input) {
        this.waitAndReturnElement(searchFieldBy).sendKeys(input);
    }

    public SearchPage submitSearch() {
        this.waitAndReturnElement(searchButton).click();
        return new SearchPage(this.driver);
    }
}
