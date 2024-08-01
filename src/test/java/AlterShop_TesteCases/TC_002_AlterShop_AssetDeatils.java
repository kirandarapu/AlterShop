package AlterShop_TesteCases;

import org.testng.annotations.Test;

import AlterShop_PageObjects.AlterShop_HomePage;
import jdk.internal.org.jline.utils.Log;

public class TC_002_AlterShop_AssetDeatils  extends AlterShop_BaseClass{
	
	@Test
	public void AssetDetailsTest() throws InterruptedException {
		
		AlterShop_HomePage ash=new AlterShop_HomePage(driver);
		
		ash.AssetDetailsFunctionality();
		Thread.sleep(3000);
		Log.info("Asset is successfully opened ....");
	}

}
