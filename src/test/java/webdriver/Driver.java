package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {

    private static WebDriver driver = null;

    public static WebDriver getDriver() {

        if (driver == null) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless"); // Executa o Chrome em modo headless
            options.addArguments("--disable-gpu"); // Desativa a aceleração de GPU (opcional)
            options.addArguments("--no-sandbox"); // Desativa o sandbox (opcional)

            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void setDriver(WebDriver dri) {
        driver = dri;
    }
}