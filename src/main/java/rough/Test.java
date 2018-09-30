package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;

public class Test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+ "\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(System.getProperty("user.dir"));
		driver.navigate().to("https://www.facebook.com/")
//updateds
		
		
	
	}

}
