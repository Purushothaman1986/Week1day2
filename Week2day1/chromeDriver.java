package Week2day1;

import org.openqa.selenium.chrome.ChromeDriver;


public class chromeDriver {

	public static void main(String[] args) throws InterruptedException {
//after 4.6.0 -> Selenium Manager
		//before 4.6.0 -> WebDriverManager 
		//WebDriverManager().chromedriver().setup();
		//ChromeDriver driver= new ChromeDriver();
		
		// afterb4.6.0 -> one line of code to LaunchBowser
		ChromeDriver driver=new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//Load the Url 
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		
		//java wait 
		Thread.sleep(5000);
		
		
		//close browser
		driver.close();
		
	}

}