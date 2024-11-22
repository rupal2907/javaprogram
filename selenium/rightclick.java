package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method st
		ChromeDriver d =new ChromeDriver();
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		d.manage().window().maximize();
		Thread.sleep(3000);//press function+f12 when right click not working in banking app
		WebElement e = d.findElement(By.linkText("CONTINUE TO LOGIN"));
		e.click();
	}

}
