package pagesAllegro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class AllegroResults extends AbstractPage {

    @FindBy(xpath = "//article[@data-item=\"true\"]")
    static List<WebElement> foundItems;

    @FindBy(xpath = "//a[@class=\"_w7z6o _uj8z7 meqh_en mpof_z0 mqu1_16 _9c44d_2vTdY  \"]")
    static List<WebElement> foundItemsNames;


    public AllegroResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    private static ItemPage itemPage;

    public void iCanSeeResults() {
        System.out.println("I can see the results");
        System.out.println("Found items on the page: " + foundItems.size());
    }

    public void itemPageResult() {
        itemPage = goIntoRandomResult(driver);
    }


    public ItemPage goIntoRandomResult(WebDriver driver) {
        Random random = new Random();
        int randomIndex = random.nextInt(foundItems.size());

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(foundItems.get(randomIndex))).click();

        ItemPage itemPage = new ItemPage(driver);
        return itemPage;
    }
}
