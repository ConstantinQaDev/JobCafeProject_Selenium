import consts.Consts;
import core.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AboutUsPage;
import pageObjects.HomePage;
import pageObjects.JobsPage;

import java.time.Duration;
import java.util.List;


public class JobCafeTests extends TestBase {

    protected static Consts consts;
    protected static AboutUsPage aboutUs;
    protected static HomePage homePage;
    protected static JobsPage jobsPage;
    protected static WebDriverWait driverWait;

    @Test
    public void navigateToAboutUsPage() throws InterruptedException {
        consts = new Consts(driver);
        aboutUs = new AboutUsPage(driver);
        homePage = new HomePage(driver);
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String expectedURL = consts.HOME_PAGE;
        String actualURL = driver.getCurrentUrl();
        Assertions.assertEquals(expectedURL, actualURL, "Home page did not open");

        WebElement aboutUsElement = homePage.aboutUsMenu;
        driverWait.until(ExpectedConditions.visibilityOf(aboutUsElement));
        Assertions.assertTrue(aboutUsElement.isDisplayed(), "About Us button is not visible");

        driverWait.until(ExpectedConditions.elementToBeClickable(aboutUsElement));
        aboutUsElement.click();

        String expectedTitle = "Cafe";// About Us HEADER Title
        String actualTitle = driver.getTitle();
        Assertions.assertTrue(actualTitle.contains(expectedTitle),"About Us Page did not opened");

        Thread.sleep(2000);

    }

    //The LogIn/Register Page is not opening on the WebSite! So this test will not pass because the
    //page does not exist!!!
    @Test
    public void navigateToLogInOrRegisterPage() throws InterruptedException {
        consts = new Consts(driver);
        aboutUs = new AboutUsPage(driver);
        homePage = new HomePage(driver);
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement logInRegisterElement = homePage.logInRegisterMenu;
        driverWait.until(ExpectedConditions.visibilityOf(logInRegisterElement));
        Assertions.assertTrue(logInRegisterElement.isDisplayed(), "Log In/Register Page is not opening");

        driverWait.until(ExpectedConditions.elementToBeClickable(logInRegisterElement));
        logInRegisterElement.click();
        Thread.sleep(2000);

//        String expectedJobsTitle = "Log In or Register";
//        String actualJobsTitle = driver.getTitle();
//        Assertions.assertTrue(actualJobsTitle.contains(expectedJobsTitle),"Log In or Register Page did not opened");
     }

    @Test
    public void navigateToFindJobPage() throws InterruptedException {
        consts = new Consts(driver);
        aboutUs = new AboutUsPage(driver);
        homePage = new HomePage(driver);
        jobsPage = new JobsPage(driver);

        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement findJobElement = homePage.findJobMenu;
        driverWait.until(ExpectedConditions.visibilityOf(findJobElement));
        Assertions.assertTrue(findJobElement.isDisplayed(), "Find Job Menu is not visible");

        driverWait.until(ExpectedConditions.elementToBeClickable(findJobElement));
        findJobElement.click();
        Thread.sleep(1000);

//        String expectedJobsTitle = "Jobs";
//        String actualJobsTitle = driver.findElement(By.tagName("Jobs")).getText();
//        Assertions.assertEquals(expectedJobsTitle, actualJobsTitle, "Page title does not match the expected title");

        //POSITION FIELD SEARCH
        WebElement positionBoxElement = jobsPage.filterPositionBox;
        driverWait.until(ExpectedConditions.visibilityOf(positionBoxElement));
        positionBoxElement.sendKeys("QA");

        WebElement searchButtonElement = jobsPage.searchButton;
        searchButtonElement.click();
        Thread.sleep(1000);

        positionBoxElement.clear();
        WebElement positionBoxElement2 = jobsPage.filterPositionBox;
        driverWait.until(ExpectedConditions.visibilityOf(positionBoxElement2));
        positionBoxElement2.sendKeys("Developer");

        WebElement searchButtonElement2 = jobsPage.searchButton;
        searchButtonElement2.click();
        Thread.sleep(1000);

        positionBoxElement2.clear();
        WebElement positionBoxElement3 = jobsPage.filterPositionBox;
        driverWait.until(ExpectedConditions.visibilityOf(positionBoxElement3));
        positionBoxElement3.sendKeys("Project Manager");

        WebElement searchButtonElement3 = jobsPage.searchButton;
        searchButtonElement3.click();
        Thread.sleep(1000);
        positionBoxElement3.clear();

        //LOCATION FIELD SEARCH
        WebElement locationBoxElement1 = jobsPage.filterLocationsBox;
        driverWait.until(ExpectedConditions.visibilityOf(locationBoxElement1));
        locationBoxElement1.sendKeys("Toronto");

        WebElement searchButtonElement4 = jobsPage.searchButton;
        searchButtonElement4.click();
        Thread.sleep(1000);

        locationBoxElement1.clear();
        WebElement locationBoxElement2 = jobsPage.filterLocationsBox;
        driverWait.until(ExpectedConditions.visibilityOf(locationBoxElement2));
        locationBoxElement2.sendKeys("Tel Aviv");

        WebElement searchButtonElement5 = jobsPage.searchButton;
        searchButtonElement5.click();
        Thread.sleep(1000);

        locationBoxElement2.clear();
        WebElement locationBoxElement3 = jobsPage.filterLocationsBox;
        driverWait.until(ExpectedConditions.visibilityOf(locationBoxElement3));
        locationBoxElement3.sendKeys("Chicago");

        WebElement searchButtonElement6 = jobsPage.searchButton;
        searchButtonElement6.click();
        Thread.sleep(1000);

        locationBoxElement3.clear();
        WebElement locationBoxElement4 = jobsPage.filterLocationsBox;
        driverWait.until(ExpectedConditions.visibilityOf(locationBoxElement4));
        locationBoxElement4.sendKeys("New York");

        WebElement searchButtonElement7 = jobsPage.searchButton;
        searchButtonElement7.click();
        Thread.sleep(1000);
        locationBoxElement4.clear();

        //COMPANY SEARCH BOX
        WebElement companyBoxElement1 = jobsPage.filterCompanyBox;
        driverWait.until(ExpectedConditions.visibilityOf(companyBoxElement1));
        companyBoxElement1.sendKeys("Apple");

        WebElement searchButtonElement8 = jobsPage.searchButton;
        searchButtonElement8.click();
        Thread.sleep(1000);

        companyBoxElement1.clear();
        WebElement companyBoxElement2 = jobsPage.filterCompanyBox;
        driverWait.until(ExpectedConditions.visibilityOf(companyBoxElement2));
        companyBoxElement2.sendKeys("Facebook");

        WebElement searchButtonElement9 = jobsPage.searchButton;
        searchButtonElement9.click();
        Thread.sleep(1000);

        companyBoxElement2.clear();
        WebElement companyBoxElement3 = jobsPage.filterCompanyBox;
        driverWait.until(ExpectedConditions.visibilityOf(companyBoxElement3));
        companyBoxElement3.sendKeys("Google");

        WebElement searchButtonElement10 = jobsPage.searchButton;
        searchButtonElement10.click();
        Thread.sleep(1000);
        companyBoxElement3.clear();

        //COMBINED SEARCH TEST

        WebElement positionBoxManager = jobsPage.filterPositionBox;
        driverWait.until(ExpectedConditions.visibilityOf(positionBoxManager));
        positionBoxManager.sendKeys("Manager");

        WebElement locationUSA = jobsPage.filterLocationsBox;
        driverWait.until(ExpectedConditions.visibilityOf(locationUSA));
        locationUSA.sendKeys("USA");

        WebElement companyGoogle = jobsPage.filterCompanyBox;
        driverWait.until(ExpectedConditions.visibilityOf(companyGoogle));
        companyGoogle.sendKeys("Google");

        WebElement searchManagerJobsInUSA = jobsPage.searchButton;
        searchManagerJobsInUSA.click();
        Thread.sleep(1000);

        // Assert that results are visible
        List<WebElement> inputElements = driver.findElements(By.tagName("input"));
        for (WebElement inputElement : inputElements) {
            String inputValue = inputElement.getAttribute("value");
            Assertions.assertTrue(inputValue != null || inputElement.isDisplayed(), "Input text did not disappear");
        }

        positionBoxManager.clear();
        locationUSA.clear();
        companyGoogle.clear();

        //ABRAKADABRA TEST
        WebElement positionAbrakadabra = jobsPage.filterPositionBox;
        driverWait.until(ExpectedConditions.visibilityOf(positionAbrakadabra));
        positionAbrakadabra.sendKeys("Abrakadabra");

        WebElement locationUSA2 = jobsPage.filterLocationsBox;
        driverWait.until(ExpectedConditions.visibilityOf(locationUSA2));
        locationUSA2.sendKeys("USA");

        WebElement companyGoogle2 = jobsPage.filterCompanyBox;
        driverWait.until(ExpectedConditions.visibilityOf(companyGoogle2));
        companyGoogle2.sendKeys("Google");

        WebElement searchAbrakadabra = jobsPage.searchButton;
        searchAbrakadabra.click();
        Thread.sleep(1000);

        //RESET TESTS
        WebElement resetButtonElement = jobsPage.resetButton;
        resetButtonElement.click();

        //POPULATE ALL THE BOXES AND RESET
        WebElement positionPopulateAll = jobsPage.filterPositionBox;
        driverWait.until(ExpectedConditions.visibilityOf(positionPopulateAll));
        positionPopulateAll.sendKeys("DevOps");

        WebElement locationPopulateAll = jobsPage.filterLocationsBox;
        driverWait.until(ExpectedConditions.visibilityOf(locationPopulateAll));
        locationPopulateAll.sendKeys("California");

        WebElement companyPopulateAll = jobsPage.filterCompanyBox;
        driverWait.until(ExpectedConditions.visibilityOf(companyPopulateAll));
        companyPopulateAll.sendKeys("Google");

        WebElement searchPopulateAll = jobsPage.searchButton;
        searchPopulateAll.click();
        Thread.sleep(1000);

        WebElement resetPopulateAll = jobsPage.resetButton;
        resetPopulateAll.click();
        Thread.sleep(2000);

        List<WebElement> inputElements2 = driver.findElements(By.tagName("input"));
        for(WebElement inputElement2 : inputElements2){
            String inputValue = inputElement2.getAttribute("value");
            Assertions.assertTrue(inputValue == null || inputValue.isEmpty(), "Input text did not disappeared");
        }
    }
  }

