package commonmethods;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import testbase.Browser;

public class Screenshot extends Browser {

	//public static WebDriver driver;
	
	public static void screenshot1() throws IOException {
		
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date(0));
		File scrsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrsht, new File("C:\\Users\\Jigna Dabhi\\Desktop\\Software Testing\\abc12.png"));
	}
}
