import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Test {
	WebDriver driver = new FirefoxDriver();
	@BeforeClass
	public void launch(){
		System.out.println("Launch browser");
		driver.get("http://www.seleniumhq.org/download/");
	}
	@AfterClass
	public void close(){
		System.out.println("Close browser");
		driver.quit();
	}
	
	@BeforeMethod
	
	public void login(){
		System.out.println("login applicatiom");
		
	}
	
	
	@AfterMethod
	public void logout(){
		System.out.println("logout applicatiom");
	}
	
	
	 @org.testng.annotations.Test
	 public void creatUser(){
			System.out.println("user Created");
		}
	 
	 @org.testng.annotations.Test
	 public void editUser(){
			System.out.println("user edited");
		}
	 
	 @org.testng.annotations.Test
	 public void deleteUser(){
			System.out.println("user deleted");
		}
		

}
