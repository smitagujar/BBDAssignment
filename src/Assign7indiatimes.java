import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign7indiatimes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver C1=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\samee\\Desktop\\Smita Gujar\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver.exe");

		
		C1.manage().window().maximize(); 
		C1.get("https://www.indiatimes.com");
		//C1.getTitle().contains("Videos");
	    C1.findElement((By.xpath("//*[@id='sectiontrending']/ul/li[1]/a"))).click();	
		System.out.println("Videos");
		
		Thread.sleep(3000);
		C1.navigate().back();
		
		Thread.sleep(3000);
		
	
	// Open Trending	
	Actions act =new Actions(C1);
			
	WebElement News= C1.findElement(By.xpath("//*[@id='sectiontrending']/ul/li[2]/a"));
	System.out.println("link visited:"+ News.getText());
	act.moveToElement(News).build().perform();
 	Thread.sleep(3000);
		
	WebElement Technology=C1.findElement(By.xpath("//*[@id='sectiontrending']/ul/li[3]/a"));
	System.out.println("link visited:"+ Technology.getText());
	act.moveToElement(Technology).build().perform();
	Thread.sleep(3000);
	
	WebElement Explainers=C1.findElement(By.xpath("//*[@id='sectiontrending']/ul/li[4]/a"));
	System.out.println("link visited:"+ Explainers.getText());
	act.moveToElement(Explainers).build().perform();
	Thread.sleep(3000);
	
	WebElement Mobility=C1.findElement(By.xpath("//*[@id='sectiontrending']/ul/li[5]/a"));
	System.out.println("link visited:"+ Mobility.getText());
	act.moveToElement(Mobility).build().perform();
	Thread.sleep(3000);
	
	WebElement Entertainment=C1.findElement(By.xpath("//*[@id='sectiontrending']/ul/li[6]/a"));
	System.out.println("link visited:"+ Entertainment.getText());
	act.moveToElement(Entertainment).build().perform();
	Thread.sleep(3000);
	
	WebElement Trending=C1.findElement(By.xpath("//*[@id='sectiontrending']/ul/li[7]/a"));
	System.out.println("link visited:"+ Trending.getText());
	act.moveToElement(Trending).build().perform();
	Thread.sleep(3000);
	
	WebElement Health=C1.findElement(By.xpath("//*[@id='sectiontrending']/ul/li[8]/a"));
	System.out.println("link visited:"+ Health.getText());
	act.moveToElement(Health).build().perform();
	Thread.sleep(3000);
	
	//Trending News
	
	WebElement TrendingTab =C1.findElement(By.xpath("//div/ul/li[7]/a"));
	Actions act2 =new Actions(C1);
	act2.moveToElement(TrendingTab).build().perform();
	List<WebElement>  Cards= C1.findElements(By.xpath("//*[@class='card-title']"));
    System.out.println("Links Count is :"+ Cards.size());
 
    //Print Trending news
	   int i;
	   for (i=2; i<= 5; i++)	
	   {
	   WebElement Web1 =  C1.findElement(By.xpath("//*[@id=\"sectiontrending\"]/ul/li[7]/div/ul/li/div[2]/div/div["+ i +"]"));
	   System.out.println("Link :"+ Web1.getText());
	   }
	   
	//Footer Links
	   
		 Thread.sleep(15000);
		 
		 List<WebElement>  AboutUs = C1.findElements(By.xpath("//*[@class='footer-links']"));
	   
	   System.out.println("Links Count 2 is :"+  AboutUs.size());
	   
	    for( i=1;i<= AboutUs.size() + 1 ;i++)
		{
		
	    	  C1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement Web1 =  C1.findElement(By.xpath("//*[@id=\"indiatimes_app_id\"]/div/div/footer/div[1]/div[2]/div[7]/a["+ i +"]"));
		 System.out.println("Link :"+ Web1.getText());
		// Thread.sleep(7000);
       
		 Web1.click();
		
		  
		} 
	 
	    
	     // go back to main home page
		   C1.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/a[1]")).click();
		   Thread.sleep(3000);
		   
		   //Go to IPL
		   C1.findElement(By.xpath("//*[@id=\"indiatimes_app_id\"]/div/div/div[2]/div/div/div[2]/div/div[3]/div/a")).click();
	
			  System.out.println("Page Title" + C1.getTitle() );
				
			  System.out.println("Page URL" + C1.getCurrentUrl() );
             
			  Thread.sleep(5000);
		   
		   // Print 5 IPL NEws
		  			   
	
		//   System.out.println("IPL News 2" + C1.findElement(By.xpath("//*[@id=\"indiatimes_app_id\"]/div/div/div[2]/div[4]/div[3]/div/div[7]/div/div/div[1]/a")).getText());
		   
			for( i=1; i< 5 ;i++)
			{
		      WebElement Web1 =  C1.findElement(By.xpath("//*[@id=\"indiatimes_app_id\"]/div/div/div[2]/div[4]/div[3]/div/div["+ i +"]/div/div/div[1]/a"));
		      System.out.println("IPL News :"   + i + " : "  + Web1.getText());
			  
			} 
		
	  
	   
	   
	   
	   
	   
	   
	   
	   
	}

	

}
