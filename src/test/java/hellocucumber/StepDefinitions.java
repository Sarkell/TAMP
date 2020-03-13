package hellocucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import itvdn.page_object.MainPage;
import itvdn.page_object.SearchPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class StepDefinitions {
    private static WebDriver driver;
    private MainPage mainPage;
    private SearchPage searchPage;

    @Before
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("Customer open site")
    public void openSite() {
        mainPage = new MainPage(driver);
    }

    @When("Customer perform search with '{word}'")
    public void performeSearch(String key) {
        searchPage = new SearchPage(driver);
        mainPage.search(key);
    }

    @Then("Customer see results")
    public void checkSearchResults() {
        List<WebElement> results = searchPage.getResults();
        Assert.assertEquals("", 10, results.size());
    }

    @After
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
