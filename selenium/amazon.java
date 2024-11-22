package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon
{
public static void main (String [] args)
{
	ChromeDriver driver =new ChromeDriver();
	//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskstdin-21%26ref%3Dnav_ya_signin%26adgrpid%3D1328211703591630%26hvadid%3D83013495293827%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D157555%26hvtargid%3Dkwd-83014163717471%3Aloc-90%26hydadcr%3D5621_2377279%26msclkid%3D960c646b67c01b342d92035b816b1a5d&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//span"))
	WebElement e4 =driver.findElement(By.linkText("Customer Service"));
	e4.click();
	/*WebElement e1 =driver.findElement(By.id("ap_email"));
	e1.sendKeys("roopalsatija@gmail.com");
	WebElement e2 =driver.findElement(By.id("continue"));
	e2.click();
	WebElement e3 =driver.findElement(By.id("ap_password"));
e3.sendKeys("xyz");
WebElement e4 =driver.findElement(By.id("signInSubmit"));
e4.click();*/
}
}
