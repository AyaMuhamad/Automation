package steps.AutomationTask;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lc.com.pages.AutomationTask.ProductPage;

public class InvalidCouponCode {
    ProductPage ProductObj = new ProductPage();

    @And("Apply Invalid Coupon")
    public void applyInvalidCoupon() {
        ProductObj.applyInvalidCoupon();
    }

    @Then("The Error Message Will Appears and the Code not Applied")
    public void theErrorMessageWillAppearsAndTheCodeNotApplied() {
        ProductObj.VerifyErrorMessageAppearForInvalidCoupon();
    }
}
