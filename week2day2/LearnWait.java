package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Purushothaman");
		
		//webDriver methods
		//title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		//verify  the title
		if(title.contains("Facebook")) {
			System.out.println("Login");
		}else {
			System.out.println("not Login ");
		}
		
		//get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//get text from web application
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		if(text.contains("Purushothaman")) {
			System.out.println("Lead created");
		}else {
			System.out.println("Lead not created");
		}
	}

}
