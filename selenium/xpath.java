package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/robbi/OneDrive/Desktop/grotechminds.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("rupal");
	WebElement e1=driver.findElement(By.xpath("(/html/body/form)[2]/input[1]"));
	e1.click();		
	}

}
