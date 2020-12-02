package pagesAllegro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends AbstractPage {

    @FindBy(xpath = "//h1")
    static WebElement itemNameOnItemPage;

    public ItemPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String iCanSeeItemPage() {
        System.out.println("Item page is present");

        return itemNameOnItemPage.getText();
    }

}
