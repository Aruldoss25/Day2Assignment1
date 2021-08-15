package testLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		 driver.findElement(By.name("firstname")).sendKeys("Arul");
		 driver.findElement(By.name("lastname")).sendKeys("doss");
		 driver.findElement(By.name("reg_email__")).sendKeys("aruldoss15@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("doss123");
		 
		 WebElement dropdown1 = driver.findElement(By.name("birthday_day"));
		    Select drDown1 = new Select(dropdown1);
		    drDown1.selectByIndex(25);
		 
	
		    WebElement dropdown2 = driver.findElement(By.name("birthday_month"));
		    Select drDown2 = new Select(dropdown2);
		    drDown2.selectByValue("12");
		    
		    WebElement dropdown3 = driver.findElement(By.name("birthday_year"));
		    Select drDown3 = new Select(dropdown3);
		    drDown3.selectByValue("1993");
		    
		    driver.findElement(By.className("_58mt")).click();
		
		
		
		
		

	}

}
