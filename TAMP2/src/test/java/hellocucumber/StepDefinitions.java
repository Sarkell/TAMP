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
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.List;


public class StepDefinitions {
    private static RemoteWebDriver driver;
    private MainPage mainPage;
    private SearchPage searchPage;

    @Before
    public static void setupClass() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("80.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        driver = new RemoteWebDriver(
                URI.create("http://34.217.145.51:4444/wd/hub").toURL(),
                capabilities
        );
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
