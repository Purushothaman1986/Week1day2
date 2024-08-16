package Weekday3;

public class LearnMethodOverLoading {

	public void chromeDriver(String url) {
		System.out.println(url);
	}
	
	public void chromeDriver() {
		System.out.println("no arguments");
	}
	
	public void chromeDriver(String data,int version,boolean r) {
		
		System.out.println(data+" "+version+" "+r);
	}
	
	public void chromeDriver(int value,String f ,boolean j) {
		System.out.println(value+" "+f+" "+j);
	}
	
	
	public static void main(String[] args) {
		LearnMethodOverLoading ol=new LearnMethodOverLoading();
		ol.chromeDriver();
		ol.chromeDriver("https://www.testleaf.com");
		ol.chromeDriver(99, "July", true);
		ol.chromeDriver("TestLeaf", 15, true);
		
		//System.out.println();
		//System.out.println(value);
		//System.out.println("Testleaf");
		
		//frame(index)
        //frame(id or name)
		//frame(webElement)

	}
}