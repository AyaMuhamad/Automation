package lc.com.pages.AutomationTask;

import io.cucumber.java.an.E;
import lc.com.pages.CommonPages.base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;

public class ProductPage extends base {
    By Size = By.id("option-label-size-143-item-166");
    By Color = By.id("option-label-color-93-item-57");
    By Add_toCartButton = By.id("product-addtocart-button");
    By Cart_link = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a");
    By CartPag= By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span");
    By CouponSection = By.id("block-discount-heading");
    By CouponCodeField = By.id("coupon_code");
    By CouponCodeButton = By.xpath("//*[@id=\"discount-coupon-form\"]/div/div[2]/div/button");
    By ErrorMessage = By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div");

    public void AddProduct_toCart()  {
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
        driver.findElement(Size).click();
        driver.findElement(Color).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(Add_toCartButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(Cart_link));
        driver.findElement(Cart_link).click();


    }

    public void VerifyProductAdd_toCart(){
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
        Assert.assertTrue(driver.findElement(CartPag).isDisplayed());
    }

    public void applyInvalidCoupon(){
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
        driver.findElement(CouponSection).click();
        driver.findElement(CouponCodeField).sendKeys(ShortRandomCoupon);
        driver.findElement(CouponCodeButton).click();
    }

    public void VerifyErrorMessageAppearForInvalidCoupon(){
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
        Assert.assertTrue(driver.findElement(ErrorMessage).isDisplayed());
    }
}
