package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		ChromeDriver d =new ChromeDriver();
		d.get("https://grotechminds.com/drag-and-drop/");
		d.manage().window().maximize();
		
		WebElement e1= d.findElement(By.xpath("//div[@id='container-6']"));
		WebElement e2= d.findElement(By.xpath("//div[@id='div2']"));
		Actions a1= new Actions(d);
		a1.dragAndDrop(e1, e2).perform();
		a1.dragAndDrop(e2, e1).perform();
	}
}
