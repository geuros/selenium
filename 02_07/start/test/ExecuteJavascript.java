import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://energy.devel");

        WebElement modalButton = driver.findElement(By.className("b-language-switcher__link"));
        modalButton.click();

        //WebElement closeButton = driver.findElement(By.id("close-button"));
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("arguments[0].click();", closeButton);

        //driver.quit();
    }
}
