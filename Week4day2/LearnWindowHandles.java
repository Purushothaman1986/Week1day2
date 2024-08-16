package Week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");

		//String pw = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		Set<String> pw = driver.getWindowHandles();
		System.out.println(pw);

		String title = driver.getTitle();
		System.out.println("Parent window :"+title);

		//set in to list -list -get(1)
		List<String> window=new ArrayList<String>(pw);

		//switch to child window
		String cw = driver.switchTo().window(window.get(1)).getTitle();
		System.out.println("Child window :"+cw);

		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("my control in child window");

		Thread.sleep(3000);
		//driver.close()- it will close current window -child window
		driver.close();

		//now my control will come back parent window
		driver.switchTo().window(window.get(0));

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		//it will close all opened window or tab
		driver.quit();

	}

}