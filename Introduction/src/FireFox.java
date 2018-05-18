import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Amruta\\Selenium\\Selenium\\WebDriver exe\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("This is my emailID");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		
		
		
		
		
		
		
		
		/*driver.get("http://Google.com");
		//Get title of web page
		System.out.println(driver.getTitle());
		//get URL
		System.out.println(driver.getCurrentUrl());
		// navigate to URL
		driver.get("http://yahoo.com");
		//Navigate back to the previous URL
		driver.navigate().back();
		//close the browser
		driver.close();	 */	
	}

}
