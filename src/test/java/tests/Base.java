package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import utils.BrowserFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("Chrome", "https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homepage = PageFactory.initElements(driver, HomePage.class);
}
