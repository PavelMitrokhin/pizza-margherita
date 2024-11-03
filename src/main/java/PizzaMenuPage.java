import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzaMenuPage {
    public WebDriver driver;

    public PizzaMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public PizzaMenuPage clickHyperlinkPizzaMenuPage() {
        driver.findElement(By.xpath(PizzaMenuXpath.HYPERLINK_PIZZA_MENU_XPATH)).click();
        return this;
    }

    public PizzaMenuPage addToCartMargarita() {
        driver.findElement(By.xpath(PizzaMenuXpath.BUTTON_ADD_TO_CART_PIZZA_MARGARITA_XPATH)).click();
        return this;
    }

    public PizzaMenuPage confirmAddToCartMargarita() {
        driver.findElement(By.xpath(PizzaMenuXpath.BUTTON_CONFIRM_ADD_TO_CART_PIZZA_MARGARITA_XPATH)).click();
        return this;
    }

    public String getOrderPopupMessage() {
        return driver.findElement(By.xpath(PizzaMenuXpath.OUTPUT_ORDER_PIZZA_POPUP_XPATH)).getText();
    }

    public String getOrderCounter() {
        return driver.findElement(By.xpath(PizzaMenuXpath.OUTPUT_ORDER_COUNTER_XPATH)).getText();
    }

    public PizzaMenuPage clickCart() {
        driver.findElement(By.xpath(PizzaMenuXpath.HYPERLINK_CART_XPATH)).click();
        return this;
    }

    public String getAddedPizzaName() {
        return driver.findElement(By.xpath(PizzaMenuXpath.OUTPUT_ADDED_MARGARITA_XPATH)).getText();
    }

    public PizzaMenuPage addToCartCola() {
        driver.findElement(By.xpath(PizzaMenuXpath.BUTTON_ADD_TO_CART_COLA_XPATH)).click();
        return this;
    }
}
