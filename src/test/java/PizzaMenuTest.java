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

    @Test(testName = "Заказ пиццы Маргарита")
    public void addMargaritaToCartTest() {
        pizzaMenuPage.addToCartMargarita();

        AssertJUnit.assertEquals(PizzaMenuMessage.OUTPUT_PIZZA_ORDER_POPUP, pizzaMenuPage.getOrderPopupMessage());

        pizzaMenuPage.confirmAddToCartMargarita();

        AssertJUnit.assertEquals(PizzaMenuMessage.OUTPUT_ORDER_COUNTER, pizzaMenuPage.getOrderCounter());

        pizzaMenuPage.clickCart();

        AssertJUnit.assertEquals(PizzaMenuMessage.ADDED_TO_CART_MARGARITA, pizzaMenuPage.getAddedPizzaName());
    }

    @Test(testName = "Заказ пиццы Маргарита и колы")
    public void addMargariteAndColaTest() {
        pizzaMenuPage
                .addToCartMargarita()
                .confirmAddToCartMargarita()
                .clickHyperlinkDrinksMenuPage()
                .addToCartCola()
                .clickCart();

        AssertJUnit.assertEquals(PizzaMenuMessage.ADDED_TO_CART_MARGARITA, pizzaMenuPage.getAddedPizzaName());
        AssertJUnit.assertEquals(PizzaMenuMessage.ADDED_TO_CART_COLA, pizzaMenuPage.getAddedColaName());
    }
}
