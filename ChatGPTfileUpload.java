package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChatGPTfileUpload {
    public static void main(String[] args) {
        // Set path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
   //     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Navigate to ChatGPT
        driver.get("https://chat.openai.com/");

        // ✅ Manually log in to ChatGPT before continuing.
        // Or wait here until login is successful
        // Thread.sleep(60000); // allow time to log in manually

        // ✅ Locate file input on ChatGPT's "Attach file" section.
        // NOTE: this selector might change often as UI updates.
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));

        // ✅ Send the path to your file
        fileInput.sendKeys("/bugclassiferfile/file.xlsx");
        
        driver.findElement(By.id("prompt-textarea")).sendKeys("please classify bug type from uploaded excel file");
        driver.findElement(By.id("prompt-textarea")).sendKeys(Keys.ENTER);
       

        // ✅ You can wait and verify the file uploaded successfully
        // e.g. wait for file chip or confirmation element to appear
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".your-confirmation-selector")));

        // 🚀 Done
    }
}

//public class ChatGPTfileUpload {

	

