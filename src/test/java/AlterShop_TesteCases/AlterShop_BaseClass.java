package AlterShop_TesteCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AlterShop_BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeSuite
	public void setUp() {
		logger=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure("log4j.properties");
		driver=new ChromeDriver();
		//driver=new EdgeDriver();
		driver.get("https://betashop.alter.game/");
		logger.info("=========>Application Launched<========");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public String captureScreen(String name)  {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		String destination= "./Screenshots/"+name+timeStamp+".png";
		
		try {
			FileUtils.copyFile(source, new File(destination));
		}catch(Exception e) {
			e.getMessage();
		}
		return destination;
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	

}
