package abstractclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class selui {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//String title=driver.getTitle();
		//System.out.println(title);
		//Thread.sleep(3000);
		//System.out.println(driver.getWindowHandle());
		//driver.close();
	}

}
