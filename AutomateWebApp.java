package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebApp {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: load the chrome driver
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); // this intializes the chrome web browser
	    
	    driver.manage().window().maximize(); // this enables the browser to maximize its width and height
	    Thread.sleep(6000);
	    driver.get("https://accounts.lambdatest.com/register");
	    
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gurram Anusha");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anusha@gmail.com");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='userpassword']")).sendKeys("AnushaGurram123");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9000163322");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@data-testid='signup-button']"));
	    Thread.sleep(2000);
	    
	    System.out.println("successfull");
	    driver.close();	  

	}

}
