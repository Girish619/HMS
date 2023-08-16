package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckException {
public static void main(String[] args) {
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
//	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("cern");
//	driver.navigate().refresh();
//	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("cern");
}
}
