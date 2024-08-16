package Week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnap {

	public static void main(String[] args) throws IOException {

ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://login.salesforce.com/");
WebElement d = driver.findElement(By.id("Login"));

//step 1 takesnap
File scr = d.getScreenshotAs(OutputType.FILE);

//step 2 set the path to be stored
File dest=new File("./SnapShots/img1.png");

//step 3
FileUtils.copyFile(scr, dest);
	}

}