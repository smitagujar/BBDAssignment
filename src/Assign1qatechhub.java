

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1qatechhub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver D1=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\samee\\Desktop\\Smita Gujar\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		
		D1.manage().window().maximize();

		
		D1.get("https://qatechhub.com/");
		String titleOfThePage = D1.getTitle();  //get title of the page
		System.out.println("Title of the page is " + titleOfThePage);  
		String currentUrl = D1.getCurrentUrl(); //get current url
        System.out.println("Current URL  :: " + currentUrl);
		
		
        Thread.sleep(5000);
		
		D1.get("https://www.facebook.com/");
		String titleOfThePage1= D1.getTitle(); 
		System.out.println("Title of the page is " + titleOfThePage1);  //print title of the page
		String currentUrl1 = D1.getCurrentUrl();
        System.out.println("Current URL  :: " + currentUrl1); //print current url
		
        D1.navigate().back();
        Thread.sleep(5000);
        
	    D1.navigate().refresh();
	    D1.navigate().forward();
	    
	    Thread.sleep(5000);
	    D1.navigate().refresh();
	    
	    Thread.sleep(5000);
	    
	    D1.quit();
	}

}
