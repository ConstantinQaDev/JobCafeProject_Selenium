package consts;

import core.PageBase;
import org.openqa.selenium.WebDriver;

public class Consts extends PageBase {

    public Consts(WebDriver driver){
        super(driver);
    }

    public static final String HOME_PAGE = "http://167.99.178.249:3000/";

    public static final String ABOUT_US = "//*[@name='About Us']";
   //public static final String FIND_JOB = "//*[@name='Find Job']";
    //public static final String LOG_IN_REGISTER = "//*[@name='Log in/Register']"; // link is not working
    //public static final String FILTER_POSITION = "//*[@name='position']";
    //public static final String FILTER_LOCATION = "//*[@name='location']";
    //public static final String FILTER_COMPANY = "//*[@name='company']";
    //public static final String FILTER_DESCRIPTION = "//*[@name='description']";
    //public static final String SEARCH_BUTTON = "//button[@type='submit']";
    //public static final String SEARCH_RESET = "//button[@class='search-butom']//following-sibling::*[contains(text(), 'reset')]";


}
