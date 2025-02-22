import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Amruta\\Selenium\\Selenium\\WebDriver exe\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.linkText("Interview Guide")).click();
		// Syntax to traverse between the siblings- Xpath/following-siblings::tagName[sibling number]
		driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li")).click();
		driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//li[@id=\"tablist1-tab1\"]/following-sibling::li[3]")).click();
		driver.findElement(By.xpath("//*[text()='29']"));
		
		
		//Xpath using Parent-child relation
		//driver.findElement(By.xpath("//body/section/div/div/div/div/ul/li[2]")).click();
		
		//Xpath for child-Parent relation
		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		

}
}