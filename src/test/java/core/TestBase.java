package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import static consts.Consts.HOME_PAGE;

public class TestBase {

    protected static WebDriver driver;


    @BeforeEach
    public void setUpHomePage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

    }

    @AfterEach
    public void quitDriver(){
        if(driver!=null){
            driver.quit();
        }
    }

}
