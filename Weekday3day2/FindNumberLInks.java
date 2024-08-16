package Weekday3day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumberLInks {

	public static void main(String[] args) {

ChromeDriver  driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.manage().window().maximize();
driver.get("https://login.salesforce.com/");
//return type findElements- List<WebElement>
List<WebElement> totalLink = driver.findElements(By.tagName("a"));
int size = totalLink.size();
System.out.println(size);

String text = totalLink.get(2).getText();
System.out.println(text);


for (int i = 0; i <totalLink.size(); i++) {
	
	String text2 = totalLink.get(i).getText();
	System.out.println(text2);
}






	}

}