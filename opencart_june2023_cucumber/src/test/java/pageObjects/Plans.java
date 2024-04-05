package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Plans extends BasePage{

	public Plans(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/summary/p")
	WebElement sortby;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/ul/li[2]")
	WebElement lowest;
	
	@FindBy(xpath = "//*[@class='quotesCard__planName']")
	List<WebElement> Names;
	
	@FindBy(xpath = "//*[@id=\"modal-root\"]/div/div/span")
	WebElement alert;
	
	public void plans() {
		


			
		sortby.click();
		lowest.click();
		System.out.println(Names.get(0).getText());
		System.out.println(Names.get(1).getText());
		System.out.println(Names.get(2).getText());


		alert.click();
	}
	
	
	
}
