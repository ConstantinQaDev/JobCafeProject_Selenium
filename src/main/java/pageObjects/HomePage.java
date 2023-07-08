package pageObjects;

import core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@id='2']")
    public WebElement aboutUsMenu;

    @FindBy(how = How.XPATH, using = "//*[@name='Find Job']")
    public WebElement findJobMenu;

    @FindBy(how = How.XPATH, using = "//*[@name='Log in/Register']")
    public WebElement logInRegisterMenu;
}
