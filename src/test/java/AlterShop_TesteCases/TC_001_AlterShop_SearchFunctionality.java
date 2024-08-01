package AlterShop_TesteCases;

import org.testng.annotations.Test;

import AlterShop_BasePackage.AlterShop_BaseClass;
import AlterShop_PageObjects.AlterShop_HomePage;

public class TC_001_AlterShop_SearchFunctionality extends AlterShop_BaseClass{

	@Test
	public void seacrhFunctionalitytest() throws InterruptedException {
		
		
	 AlterShop_HomePage ash=new AlterShop_HomePage(driver);
	 ash.searchfunctionality();
	 Thread.sleep(3000);
	 log.info("product is successfully displayed on the page...");
	 
	}
}
