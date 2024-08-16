package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//alert 
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		//alert.accept();
		
		driver.findElement(By.xpath("//i[@class='pi pi-home layout-menuitem-icon']")).click();

		
	//	alert.dismiss();
   //	alert.sendKeys("dilip");
		
		//exception
		//1.NoAlertPresentException -if alert is not presented you are trying to handle it 
		//2.UnHandledAlertException - while alert present you are not handling .
	}

}