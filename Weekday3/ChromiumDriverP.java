package Weekday3;

public class ChromiumDriverP extends RemoteWebdrivergp{

	public void chromedriver() {
		System.out.println("ChromeDriver - parent");
	}
	
	
	public void edgedriver() {
		System.out.println("EdgeDriver - parent");
	}
	
	public static void main(String[] args) {
		
		ChromiumDriverP cd=new ChromiumDriverP();
		cd.allbrowser();
		cd.chromedriver();
		cd.edgedriver();
	}
}