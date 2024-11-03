import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PizzaMenuTest extends HomeTest {
    private PizzaMenuPage pizzaMenuPage;

    @BeforeMethod
    public void setUpPizzaMenu() {
        pizzaMenuPage = new PizzaMenuPage(driver);
        pizzaMenuPage.clickHyperlinkPizzaMenuPage();
    }

    @Test
    public void addMargaritaToCartTest() {
        pizzaMenuPage.addToCartMargarita();

        AssertJUnit.assertEquals(PizzaMenuMessage.OUTPUT_PIZZA_ORDER_POPUP, pizzaMenuPage.getOrderPopupMessage());
    }
}
