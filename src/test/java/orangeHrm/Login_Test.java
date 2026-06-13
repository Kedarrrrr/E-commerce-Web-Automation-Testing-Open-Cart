package orangeHrm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Test extends BaseClass{

	/*public Login_Test(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/
	
	@Test
	public void Login_test_case() {
		Registration r= new Registration(driver);
		r.register();
		logger.info("Registration Clicked");
		r.setName("Kulnal", "Yelole");
		r.setEmail("yleole@gmail.com");
		r.setTelephone("0900000000");
		r.setPassword("fjeijais");
		logger.info("Details filled.");
		r.final_Reg();
		Assert.assertEquals(true, r.msg);
	}
	

	
}
