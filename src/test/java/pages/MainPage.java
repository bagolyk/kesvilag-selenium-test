import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


class MainPage extends PageBase {

    private SideSearchPanel searchPanel = new SideSearchPanel(this.driver);

    private By titleImageBy = By.xpath("//div/img[contains(@src,'/logo.png')]");
    private By loginNavElementBy = By.xpath("//div[@class='collapse navbar-collapse']/ul/li/a[contains(@href,'belepes')]");
    private By logoutNavElementBy = By.xpath("//div[@class='collapse navbar-collapse']/ul/li/a[contains(@href,'kijelentkezes')]");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean verifyLogoRendered() {
        return this.waitAndReturnElement(titleImageBy).isDisplayed();
    }
    
    public LoginPage goTologin() {
        this.waitAndReturnElement(loginNavElementBy).click();
        return new LoginPage(this.driver);
    }

    public MainPage logout() {
        this.waitAndReturnElement(logoutNavElementBy).click();
        return new MainPage(this.driver);
    }

    public boolean isLogoutNavElementDisplayed() {
        return this.waitAndReturnElement(logoutNavElementBy).isDisplayed();
    }

    public boolean isLoginNavElementDisplayed() {
        return this.waitAndReturnElement(loginNavElementBy).isDisplayed();
    }

    public SideSearchPanel getSearchPanel() {
        return this.searchPanel;
    }
}
