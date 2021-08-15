package testLeaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver login = new ChromeDriver();
		login.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement assign = login.findElement(By.id("dropdown1"));
		Select dropDown = new Select(assign);
		dropDown.selectByIndex(1);

		WebElement assign1 = login.findElement(By.name("dropdown2"));
		Select dropDown1 = new Select(assign1);
		dropDown1.selectByValue("2");

	WebElement assign2 = login.findElement(By.name("dropdown3"));
		Select dropDown2 = new Select(assign2);
		dropDown2.selectByVisibleText("UFT/QTP");

		int dropDown3 = dropDown2.getOptions().size();
		System.out.println(dropDown3);

	}

}
