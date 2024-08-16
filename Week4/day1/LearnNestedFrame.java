package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) throws InterruptedException {
		// https://www.leafground.com/frame.xhtml
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//first frame
		driver.switchTo().frame(2);
		
		//second frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		//my control main web page
		//driver.switchTo().defaultContent();
		
		//parentFrame()-its going  before frame tag
		//driver.switchTo().parentFrame();
		

	}

}