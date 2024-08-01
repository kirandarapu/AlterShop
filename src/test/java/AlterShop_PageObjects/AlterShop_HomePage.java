package AlterShop_PageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import jdk.internal.org.jline.utils.Log;

public class AlterShop_HomePage extends BasePage {

	public AlterShop_HomePage(WebDriver driver) {
		super(driver);

	}


	@FindBy (xpath="//button[@data-testid='categoryButton']")
	WebElement drp_AllCategory;

	@FindBy (xpath="//input[@id='auto-suggestion-search']")
	WebElement input_Search;

	@FindBy(xpath="(//div[text()='Body'])[1]")
	WebElement btn_Body;


	@FindBy(xpath="//span[text()='Watch for TEST']")
	WebElement txt_Asset;

	@FindBy (xpath="//span[text()='Categories']")
	WebElement btn_categories;

	@FindBy(xpath="(//div[@data-testid='typeLabel'])[2]")
	WebElement Asset_btn;

	@FindBy(xpath="(//span[text()='Mallikarjun M G'])[1]")
	WebElement creator_Name;

	@FindBy(xpath="//span[text()='Connect']")
	WebElement btn_Connect;

	@FindBy(xpath="(//span[text()='Dive in with'])[1]")
	WebElement btn_Dive_inGoogle;

	@FindBy (xpath="//input[@type='email']")
	WebElement txt_email;

	@FindBy (xpath="//span[text()='Next']")
	WebElement btn_next;

	@FindBy (xpath="//input[@type='password']")
	WebElement btn_password;


	public void searchfunctionality() throws InterruptedException {
		input_Search.sendKeys("Watch");
		Thread.sleep(3000);
		btn_Body.click();


	}

	public void AssetDetailsFunctionality() throws InterruptedException {

		Actions ac=new Actions(driver);

		ac.moveToElement(btn_categories).build().perform();

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", btn_Body);
		//btn_Body.click();

		Thread.sleep(4000);

		Asset_btn.click();

		Thread.sleep(4000);

		String Act_result=driver.getTitle();
		System.out.println(Act_result);
		String Exp_result="Pistols Mobilesss";

		if(Act_result.equals(Exp_result)) {

			Assert.assertTrue(true);
			Log.info("Test case passed");
		} else
		{
			Assert.assertTrue(false);
			Log.info("Testcase is failed");
		}



	}

	public void CreateProfile() throws InterruptedException {

		btn_Connect.click();

		Thread.sleep(5000);

		Set<String>Windows=driver.getWindowHandles();

		//convert set to List

		List<String>windowids=new ArrayList(Windows);

		String parent_window=windowids.get(0);
		String child_window=windowids.get(1);

		driver.switchTo().window(child_window);
		Thread.sleep(4000);

		btn_Dive_inGoogle.click();

		Set<String>Window=driver.getWindowHandles();

		//convert set to List

		List<String>windowid=new ArrayList(Window);

		String parent_window11=windowid.get(0);
		String child_window12=windowid.get(1);
		String subChile_window13=windowid.get(2);

		driver.switchTo().window(subChile_window13);

		driver.manage().window().maximize();
		Thread.sleep(3000);

		txt_email.sendKeys("kirandarapu2006@gmail.com");
		btn_next.click();
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("arguments[0].setAttribute('value','Amma@2747')", btn_password);
		//btn_password.sendKeys("Amma@2747");;






	}



}
