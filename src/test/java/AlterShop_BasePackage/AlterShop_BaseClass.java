package AlterShop_BasePackage;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AlterShop_BaseClass {
	
	public static WebDriver driver;
	public Logger log;
	
	@BeforeClass
	public void Setup() {
		
		log=LogManager.getLogger(this.getClass());
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://betashop.alter.game/");
		log.info("========> Application Lauched<=========");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void Teardown() {
		
		driver.close();
		
	}
	
	

}
