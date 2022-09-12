package murari1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LiveClass {
	@Test
	public void startonlineClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\selinium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://online.qspiders.com/user?meeting_id=476c64e5-fc34-4b9f-beb0-3ac204d9fb21");
		driver.manage().window().maximize();
		
	}

}
