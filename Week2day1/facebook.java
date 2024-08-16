package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver .findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
				driver  .findElement(By.id("pass")).sendKeys("Tuna@321");
				driver .findElement(By.name("login"));
				
				
				Thread.sleep(3000);
				
				
		driver.close();
		
			
 
		
		
		

	}

}
