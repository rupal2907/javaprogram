package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
public static void main(String args[])
{
	ChromeDriver d= new ChromeDriver();
	d.get("https://www.facebook.com");
	d.manage().window().maximize();
	d.findElement(By.name("email")).sendKeys("roopalsatija@gmail.com");	
	d.findElement(By.name("pass")).sendKeys("Rupal@29");
	d.findElement(By.name("login")).sendKeys(Keys.ENTER);
}
}