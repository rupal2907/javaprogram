package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.navigate().to("https://www.google.com");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();


//WebElement e1=driver.findElement(By.linkText("Gmail"));
//WebElement e2=driver.findElement(By.partialLinkText("Gmail"));
//e2.sendKeys(Keys.ENTER);

	}

}
