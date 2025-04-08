package steps;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import lc.com.pages.CommonPages.base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Hooks extends base {


    @BeforeAll
    public static void start () {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);

    }

    @AfterAll
    public static void quit()
    {
        driver.quit();
    }
}

