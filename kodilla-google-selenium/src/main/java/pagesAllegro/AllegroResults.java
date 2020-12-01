package pagesAllegro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AllegroResults extends AbstractPage {

    @FindBy(xpath = "//article[@data-item=\"true\"]")
    static List<WebElement> foundItems;

    public AllegroResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iCanSeeResults() {
        System.out.println("I can see the results");
        System.out.println("Found items on the page: " + foundItems.size());
    }
}
