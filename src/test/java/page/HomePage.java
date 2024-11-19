package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    By removeFromCart = By.id("remove-sauce-labs-backpack");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void clickAddtoCart() {
        driver.findElement(addToCart).click();
    }

    public void clickRemoveFromCart() {
        driver.findElement(removeFromCart).click();
        System.out.println("Failed Remove Item From Cart");
    }

}
