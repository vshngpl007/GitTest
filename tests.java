
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable


        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open Facebook
        driver.get("https://www.facebook.com");

        // Optional: Maximize the browser window
        driver.manage().window().maximize();

        // Optional: Add some wait time to see the opened page
        try {
            Thread.sleep(3000); // Sleep for 3 seconds (you might want to use WebDriverWait in real scenarios)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
