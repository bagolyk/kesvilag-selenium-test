package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

class LoginPage extends PageBase {

    private By nameInputBoxBy = By.name("username");
    private By passwordInputBoxBy = By.name("password");
    private By loginButtonBy = By.xpath("//form/div/div[@class='col-xs-12 text-center']/button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }    
    
    public MainPage loginUser(String username, String password){
        this.waitAndReturnElement(nameInputBoxBy).sendKeys(username);
        this.waitAndReturnElement(passwordInputBoxBy).sendKeys(password);
        this.waitAndReturnElement(loginButtonBy).click();
        return new MainPage(this.driver);
    }
    
}
