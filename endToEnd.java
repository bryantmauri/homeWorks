package TestCases;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class endToEnd {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bryan\\eclipse\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL of the browser
	driver.manage().window().maximize();
	//From To Flight
	WebElement departureFlight = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	departureFlight.click();
	driver.findElement(By.xpath("//a[@value= 'DEL']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@value= 'MAA'])[2]")).click();
	//One Way
	if(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected()==false) {
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	}
	Thread.sleep(1000);
	//Calendar
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	Thread.sleep(1000);
	Assert.assertEquals(driver.findElement(By.id("Div1")).getAttribute("style"), "display: block; opacity: 0.5;");
	//Family and Friend Checkbox
	driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).click();
	//Add 4 adults
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(1000);
	for(int i=1;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	//Currency USD
	WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown = new Select(staticDropdown);
	dropdown.selectByIndex(3);
	//Search
	driver.findElement(By.cssSelector("input[id*='FindFlights']")).click();
	System.out.println("sucesss!");
	driver.quit();
	
	
	}

}
