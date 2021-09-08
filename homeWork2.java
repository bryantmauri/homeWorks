package TestCases;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class homeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bryan\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cleartrip.com/"); //URL of the browser
		driver.manage().window().maximize();
		
		//Select all the dropdowns on the site
		List<WebElement> dropdowns = driver.findElements(By.cssSelector("select.bc-neutral-100.bg-transparent"));
		
		//identify and assing names to the dropdowns
		Select adults = new Select(dropdowns.get(0));
		Select children = new Select(dropdowns.get(1));
		
		//Select values inside the dropdown
		adults.selectByIndex(1);
		children.selectByIndex(2);
		
		//click and select current date on the calendar
		driver.findElement(By.cssSelector("div[class*='homeCalender']")).click();
		driver.findElement(By.cssSelector("div[class*='DayPicker-Day--today']")).click();
		
		//click on a link where "linktext" does not work
		driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div[1]/div[2]/div/div[5]/div/div/a")).click();
		
		//find a text box and enter "Aeromexico" in it
		driver.findElement(By.cssSelector("input[placeholder='Airline name']")).sendKeys("Aeromexico");
		
		//click submit
		driver.findElement(By.xpath("//div[@class='col flex flex-middle']/button")).click();
		
		//print the expected error on site
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'bg-error-600')]/span")).getText());
		
		driver.quit();

	}

}
/*
 * cleartrip.com
 * ignore from to
 * any adult dropdown
 * any children
 * click on depart date
 * click on todays date
 * clic on link
 * enter preferren airline
 * click on search flights
 * get the error and print output
 */
