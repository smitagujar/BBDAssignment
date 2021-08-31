import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3yahooabsolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver C1=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\samee\\Desktop\\Smita Gujar\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
				
		C1.manage().window().maximize(); 
		C1.get("https://in.yahoo.com/");
		
	  	   System.out.println("Links Count is :"+ C1.findElements(By.xpath("//*[@class='trending-list']//ul/li")).size());
   
	   int i;
	   for (i=1; i<= C1.findElements(By.xpath("//*[@class='trending-list']//ul/li")).size(); i++)	
	   {
	   WebElement Web1 =  C1.findElement(By.xpath("//*[@id=\"applet_p_50000352\"]/div/div/ul/li/ul/li["+ i +"]/a/span[2]"));
	   System.out.println("Link :"+ Web1.getText());
	    Web1.click();
	   C1.navigate().back();
	   }
	   
	      
	   C1.findElement((By.xpath("//div/div[4]/div/div/ul/li[2]"))).click(); // absolute xpath 
	   
	   String Head1, Head2, Head3;
	   Head1 =  C1.findElement(By.xpath("//div/table/tbody/tr/th[1]")).getText(); // absolute xpath 
	   Head2 =  C1.findElement(By.xpath("//div/table/tbody/tr/th[2]")).getText();
	   Head3 =  C1.findElement(By.xpath("//div/table/tbody/tr/th[3]")).getText();
	   
	   System.out.println ( Head1 + "      " +  Head2 + "     " + Head3);
	   
	   String R1, R2, R3, R4, R5, R6;
	   R1 = C1.findElement(By.xpath("//div/table/tbody/tr[2]/th")).getText(); // absolute xpath 
	   R2 = C1.findElement(By.xpath("//div/table/tbody/tr[2]/td[1]")).getText();
	   R3 = C1.findElement(By.xpath("//div/table/tbody/tr[2]/td[2]")).getText();
	   System.out.println ( R1 + "         " +  R2 + "        " + R3);		
	   
	   R4 = C1.findElement(By.xpath("//div/table/tbody/tr[3]/th")).getText(); // absolute xpath 
	   R5 = C1.findElement(By.xpath("//div/table/tbody/tr[3]/td[1]")).getText();
	   R6 = C1.findElement(By.xpath("//div/table/tbody/tr[3]/td[2]")).getText();
	   System.out.println ( R4 + "         " +  R5 + "        " + R6);	
	   
	   
			
		  
	   C1.quit();

	}

}
