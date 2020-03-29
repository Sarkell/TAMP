package itvdn.page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    private static String PAGE_URL = "https://itvdn.com/ru";

    @FindBy(css = "#search-on-top")
    private WebElement searchElement;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public void search(final String text) {
        searchElement.click();
        searchElement.sendKeys(text);
        searchElement.sendKeys(Keys.ENTER);
    }

}
