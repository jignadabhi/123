package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	static WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
	@FindBy(linkText="POPULAR ITEMS") static WebElement Popitem;
	@FindBy(xpath="//*[@id=\"popular_items\"]/div") static WebElement Popblock;
	@FindBy(name="popular_item_16_name") static WebElement item1;
	@FindBy(name="popular_item_10_name") static WebElement item2;
	@FindBy(name="popular_item_21_name") static WebElement item3;
	@FindBy(id="details_16") static WebElement item1link;
	@FindBy(id="details_10") static WebElement item2link;
	@FindBy(id="details_21") static WebElement item3link;
	@FindBy(xpath="//*[@id=\"Description\"]/h1") static WebElement tabdestxt;
	@FindBy(xpath="//*[@id=\"Description\"]/h1") static WebElement lapdestxt;
	@FindBy(xpath="//*[@id=\"Description\"]/h1") static WebElement spkdestxt;	
	
	public static 	WebElement popular_item() {
	
		return Popitem;
	}
	
	public static 	WebElement popular_block() {
		
		return Popblock;
	}
	public static 	WebElement tablet_text() {
		
		return item1;
	}
	public static 	WebElement laptop_text() {
		
		return item2;
	}
	public static 	WebElement speaker_text() {
		
		return item3;
	}
	public static 	WebElement tablet_link() {
		
		return item1link;
	}
	public static 	WebElement laptop_link() {
		
		return item2link;
	}
	public static 	WebElement speaker_link() {
		
		return item3link;
	}
	
   public static 	WebElement tablet_desc_text() {
		
		return tabdestxt;
	}
	
	
   public static 	WebElement laptop_desc_text() {
		
		return lapdestxt;
	}
	
	
   public static 	WebElement speaker_desc_text() {
		
		return spkdestxt;
	}
}

