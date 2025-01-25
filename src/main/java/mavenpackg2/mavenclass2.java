package mavenpackg2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mavenclass2 {

	public static void main(String[] args)throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\selenium drivers\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);                                                       
		//WebElement user=driver.findElement(By.id("user-name")) ;
		//user.click(); 
		// user.sendKeys("standard_user");
		// Thread.sleep(2000);
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 Thread.sleep(2000);
		 //syntax of relative xpath=driver.findElement(By.locator("//tagname[@attribute='value']"));
		driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        driver.close();
		// TODO Auto-generated method stub

	}

}
