package lc.com.pages.AutomationTask;

import lc.com.pages.CommonPages.base;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;

public class HomePagewithSearchField extends base {
    By SearchField = By.id("search");
    By SearchData = By.xpath("//*[@id=\"qs-option-0\"]");
    By Result = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/strong");

    public void SearchForProduct(){
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
        driver.findElement(SearchField).sendKeys("hoodie");
    }

    public void ClickOnSuggestionData(){
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
        driver.findElement(SearchData).click();
    }
    public void VerifyTheCorrectDataAppear(){
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
        Assert.assertTrue(driver.findElement(Result).isDisplayed());
    }

    public void ClickOnProduct(){
        wait.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
        driver.findElement(Result).click();
    }

}
