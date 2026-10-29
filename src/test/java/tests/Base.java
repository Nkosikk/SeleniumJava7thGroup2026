package tests;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;
import utils.BrowserFactory;
import utils.TakeScreenshots;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homepage = PageFactory.initElements(driver, HomePage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    public TakeScreenshots takeScreenshots = new TakeScreenshots();
    public LearnPage learnPage = PageFactory.initElements(driver, LearnPage.class);
    public WebAutoAdvanced webAutoAdvanced = PageFactory.initElements(driver, WebAutoAdvanced.class);

}
