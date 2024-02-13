import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionSel {

	public static void main(String[] args) {
		
		//Invoke browser
		//Chrome -> ChromeDriver->methods
		//webdriver methods + class methods of own driver
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyamac/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
