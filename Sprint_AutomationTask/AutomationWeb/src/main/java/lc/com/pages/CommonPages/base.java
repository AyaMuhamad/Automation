package lc.com.pages.CommonPages;

import com.fasterxml.jackson.databind.JsonNode;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class base {
    public static WebDriver driver;

    public static String RandomCoupon= UUID.randomUUID().toString();
    public static String ShortRandomCoupon = RandomCoupon.substring(0, 10);
    public static FluentWait<WebDriver> wait = new FluentWait<>(driver);







}

