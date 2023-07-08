package pageObjects;

import core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JobsPage extends PageBase {

    public JobsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@placeholder='location']")
    public WebElement filterLocationsBox;

    @FindBy(how = How.XPATH, using = "//*[@placeholder='position']")
    public WebElement filterPositionBox;

    @FindBy(how = How.XPATH, using = "//*[@placeholder='company']")
    public WebElement filterCompanyBox;

    @FindBy(how = How.XPATH, using = "//*[@placeholder='description']")
    public WebElement filterDescriptionBox;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = "//button[@class='search-butom']//following-sibling::*[contains(text(), 'reset')]")
    public WebElement resetButton;

}
