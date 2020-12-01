import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesAllegro.AllegroSearch;

public class TestAllegro {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://allegro.pl/");
    }

    @Test
    public void allegroSearchTest() {
        AllegroSearch search = new AllegroSearch(driver);
        search.searchResults("Spalding", "/kategoria/sport-i-turystyka");
    }

    @After
    public void tearDown() {

    }
}
