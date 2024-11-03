import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzaMenuPage {
    public WebDriver driver;

    public PizzaMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHyperlinkPizzaMenuPage(){
        driver.findElement(By.xpath(PizzaMenuXpath.HYPERLINK_PIZZA_MENU_XPATH)).click();
    }

    public void addToCartMargarita() {
        driver.findElement(By.xpath(PizzaMenuXpath.BUTTON_ADD_TO_CART_PIZZA_MARGARITA_XPATH)).click();
    }

    public PizzaMenuPage confirmAddToCartMargarita() {
        driver.findElement(By.xpath(PizzaMenuXpath.BUTTON_CONFIRM_ADD_TO_CART_PIZZA_MARGARITA_XPATH)).click();
        return this;
    }

    public String getOrderPopupMessage() {
        return driver.findElement(By.xpath(PizzaMenuXpath.OUTPUT_ORDER_PIZZA_POPUP_XPATH)).getText();
    }
}
