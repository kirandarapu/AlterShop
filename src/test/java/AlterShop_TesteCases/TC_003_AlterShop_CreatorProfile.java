package AlterShop_TesteCases;

import org.testng.annotations.Test;

import AlterShop_BasePackage.AlterShop_BaseClass;
import AlterShop_PageObjects.AlterShop_HomePage;

public class TC_003_AlterShop_CreatorProfile extends AlterShop_BaseClass {

	
	@Test
	public void createProfileTest() throws InterruptedException {
		
		AlterShop_HomePage ash1=new AlterShop_HomePage(driver);
		 
		ash1.CreateProfile();
		Thread.sleep(4000);
		log.info("Profile creation completed...");
	}
	
	
	 
	
}
