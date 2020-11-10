package uitesting;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonmethods.Exceldata;
import commonmethods.Extentreport;
import commonmethods.Screenshot;
import objrep.Homepage;
import testbase.Browser;

public class Popularlinkstest extends Browser {
	@BeforeTest
	public static void esetup() {
		Extentreport.setup();
	}
	
	static Homepage hp;
	
	@BeforeMethod
	public static void invokebrowser () throws Exception {
		
		Browser.invokbrowser();
	}
	
	@AfterMethod
	
	public static void closeb() {
		driver.close();
	}
	
	
	@Test
	public static void tablet() throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		hp=new Homepage (driver);
		hp.popular_item().click();
		hp.tablet_link().click();
		
		String actualtext_tablet=hp.tablet_desc_text().getText();
		System.out.println(actualtext_tablet);
		
		if (actualtext_tablet.contains(Exceldata.readdata(3, 0))) {
				System.out.println("test is pass");
				Exceldata.writedata(3, 1, "valid data");
				Extentreport.repopass();
		}
		else {
			Screenshot.screenshot1();
			System.out.println("test is fail");
			Exceldata.writedata(3, 1, "invalid data");
			Extentreport.repofail();
		}
	}

	@Test
	public static void alaptop() throws InterruptedException, IOException {
		Thread.sleep(5000);
	
		hp=new Homepage (driver);
		hp.popular_item().click();
		hp.laptop_link().click();
		String actualtext_laptop=hp.laptop_desc_text().getText();
		System.out.println(actualtext_laptop);
		
		if (actualtext_laptop.contains(Exceldata.readdata(1, 0))) {
				System.out.println("test is pass");
				Exceldata.writedata(1, 1, "valid data");
				Extentreport.repopass();
		}
		else {
			Screenshot.screenshot1();
			System.out.println("test is fail");
			Exceldata.writedata(1, 1, "invalid data");
			Extentreport.repofail();
		}
	}

	@Test
	public static void speaker() throws InterruptedException, IOException {
		Thread.sleep(5000);
		hp=new Homepage (driver);
		hp.popular_item().click();
		hp.speaker_link().click();
		String actualtext_speaker=hp.speaker_desc_text().getText();
		System.out.println(actualtext_speaker);
		if (actualtext_speaker.contains(Exceldata.readdata(2, 0))) {
			System.out.println("test is pass");
			Exceldata.writedata(2, 1, "valid data");
			Extentreport.repopass();
	}
	else {
		Screenshot.screenshot1();
		System.out.println("test is fail");
		Exceldata.writedata(2, 1, "invalid data");
		Extentreport.repofail();
	}

	
	}
}