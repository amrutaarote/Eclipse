import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// provide location of webdriver in your system
		System.setProperty("webdriver.chrome.driver", "D:\\Amruta\\Selenium\\Selenium\\WebDriver exe\\chromedriver.exe"); 
		// create driver object for Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.name("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}

}
