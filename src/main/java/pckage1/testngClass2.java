package pckage1;
import org.openqa.selenium.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterSuite;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;
public class testngClass2 {
	WebDriver driver=new ChromeDriver();
	public String baseurl="https://demo.guru99.com/telecom/index.html";
	@BeforeSuite
	public void launchbrowse()
	{
		driver.get(baseurl);
		System.out.println("Launching browser successfully");
	}
	@Test(priority=1)
	public void verifyHomepageTitle() {
		String expectedTitle="Guru99 Telecom";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle,"Homepage title mismatch!");
		
	}
    @Test(priority=2)
    public void addcustomerlink() {
    	WebElement addcustomer=driver.findElement(By.xpath("//a[text()='Add Customer']"));
    	addcustomer.click();

    }
    @Test(priority=3)
   public void addcustomerradiobutton1() throws InterruptedException {
    	WebElement radiobutton1=driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label"));
    	radiobutton1.click();
    	Thread.sleep(4000);
    }
    @Test(priority=4)
    public void addcustomerradiobutton2() {
    	WebElement radiobutton2=driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[2]/label"));
    radiobutton2.click();
    }
}
//*[@id="main"]/div/form/div/div[2]/label