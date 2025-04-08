package steps.AutomationTask;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lc.com.pages.AutomationTask.HomePagewithSearchField;
import lc.com.pages.AutomationTask.ProductPage;

public class AddProducttoCart {

    HomePagewithSearchField HomeObj = new HomePagewithSearchField();
    ProductPage ProductObj = new ProductPage();

    @And("Choose a Product")
    public void chooseAProduct() {
        HomeObj.ClickOnProduct();
    }

    @And("Add it to Cart")
    public void addItToCart() {
        ProductObj.AddProduct_toCart();
    }

    @Then("The Product will Add to Cart Successfully")
    public void theProductWillAddToCartSuccessfully() {
        ProductObj.VerifyProductAdd_toCart();
    }

}
