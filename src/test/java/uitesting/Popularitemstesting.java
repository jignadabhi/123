package uitesting;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import objrep.Homepage;
import testbase.Browser;

 



public class Popularitemstesting extends Browser {
	
	static SoftAssert sa = new SoftAssert();
	
	
	static Homepage hp;
	//checking number of items in popular clm
	@BeforeMethod
	
	public static void launchbrowswer() throws Exception {
		
		Browser.invokbrowser();
		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\Vinay Dabhi\\Downloads\\geckodriver27\\geckodriver.exe"); driver
		 * = new FirefoxDriver(); driver.manage().timeouts().implicitlyWait(20,
		 * TimeUnit.SECONDS); driver.get("https://www.advantageonlineshopping.com/#/");
		 */
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	
	public static void m() throws Exception {
		
	
		Thread.sleep(10000);
		
	hp=new Homepage (driver);
	hp.popular_item().click();
	int itemsize=hp.popular_block().findElements(By.tagName("div")).size();
	System.out.println(itemsize);
    Assert.assertEquals(3, 3);
	
	
	}
	
	//Check popular item Text
	@Test
	public static void popitemtext() throws InterruptedException {
		Thread.sleep(10000);
		 hp= new Homepage(driver);
		hp.popular_item().click();
		String acttbtext=hp.tablet_text().getText();
		
		if(acttbtext.contains("HP ELITEPAD")) {
			
			sa.assertTrue(true);
			
			System.out.println("test pass");
		} else {
			
			sa.assertTrue(false);
			System.out.println("test fail");
			
		}
		
		String actlptext=hp.laptop_text().getText();
		if(actlptext.contains("HP 123BOOK")) {
			sa.assertTrue(true);
			System.out.println("test pass");
			} else {
				
				sa.assertTrue(false);
				System.out.println("test fail");
			}
		
		String actsptext=hp.speaker_text().getText();
		if(actsptext.contains("HP ROAR PLUS")) {
			
			sa.assertTrue(true);
			System.out.println("test pass");
			} else {
				
				sa.assertTrue(false);
				System.out.println("test fail");
			}
		sa.assertAll();
	}
	
	
}