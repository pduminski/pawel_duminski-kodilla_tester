package pagesAllegro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroSearch extends AbstractPage {

    @FindBy(xpath = "//button[@data-role=\"accept-consent\"]")
    static WebElement consent;

    @FindBy(xpath = "//input[@name=\"string\"]")
    static WebElement searchField;

    @FindBy(xpath = "//select[@data-role=\"filters-dropdown-toggle\"]")
    static WebElement categorySelector;

    @FindBy(xpath = "//button[@data-role=\"search-button\"]")
    static WebElement searchButton;

    public AllegroSearch(WebDriver driver) {
        super(driver);
    }

    private static AllegroResults allegroResults;

    public void searchResults(String itemName, String category) {
        PageFactory.initElements(driver, AllegroSearch.class);
        // we dismiss consent from Allegro
        consent.click();

        searchField.sendKeys(itemName);
        Select select = new Select(categorySelector);
        select.selectByValue(category);
        allegroResults = loadResults(driver);
        allegroResults.iCanSeeResults();
        allegroResults.goIntoRandomResult(driver);
    }

    public AllegroResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        AllegroResults allegroResults = new AllegroResults(driver);
        return allegroResults;
    }
}
