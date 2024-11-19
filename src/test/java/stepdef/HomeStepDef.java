package stepdef;

import helper.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.HomePage;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

    @Then("user click add to cart")
    public void userClickAddToCart() {
        homePage = new HomePage(driver);
        homePage.clickAddtoCart();
    }

    @And("remove button error")
    public void removeButtonError() {
        homePage = new HomePage(driver);
        homePage.clickRemoveFromCart();
    }
}
