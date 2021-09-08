package TestCases;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class homeWork1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bryan\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		checkboxes.get(0).click();
		Thread.sleep(1000);
		Assert.assertTrue(checkboxes.get(0).isSelected());
		checkboxes.get(0).click();
		Thread.sleep(1000);
		Assert.assertFalse(checkboxes.get(0).isSelected());		
		System.out.println(checkboxes.size());		
		driver.quit();
		

	}

}
