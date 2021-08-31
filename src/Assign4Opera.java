import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Assign4Opera {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	/*	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		*/
		
		WebDriver C1=new OperaDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\samee\\Desktop\\Smita Gujar\\chromedriver.exe");
		
		System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		
		C1.manage().window().maximize(); 
		C1.get("https://www.myntra.com");

		
        Thread.sleep(5000);
		
		// G1.findElement(By.xpath("//*[@class='desktop-user']")).click();
		//G1.findElement(By.xpath("//*[@class='desktop-linkButton']")).click();
		//G1.findElement(By.xpath("//*[@class='form-control mobileNumberInput']")).sendKeys("7798993710");
		//G1.findElement(By.xpath("//*[@class='submitBottomOption']")).click();
		//G1.findElement(By.xpath("//*[@class='bottomeLink']")).click();
		
		C1.findElement(By.xpath("//*[@class='desktop-user']")).click();
		C1.get("https://www.myntra.com/login/password");
		
		C1.findElement(By.id("mobileNumberPass")).sendKeys("7798993710");
		C1.findElement(By.xpath("//*[@class='form-control has-feedback']")).sendKeys("Saanika@100");
		C1.findElement(By.xpath("//*[@class='form-control has-feedback']")).click();
		C1.findElement(By.xpath("//*[@class='btn primary  lg block submitButton']")).click();
		
		 Thread.sleep(2000);

		//C1.get("https://www.myntra.com/men-sweaters");
		
	 //	WebElement MenTab =C1.findElement(By.xpath("//*[@class='desktop-main']"));
		System.out.println ("Before");
		
		WebElement MenTab =C1.findElement(By.xpath("//*[@class='desktop-main']"));
		Actions act =new Actions(C1);
		act.moveToElement(MenTab).build().perform();
 
	 	System.out.println ("After");
	 	
	 	C1.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[6]/a")).click(); 
	       
	      // C1.findElement(By.xpath("//a[text()='Sweaters']")).click(); 

	       System.out.println ("After 1");
			
	
	   	 int size1 = C1.findElements(By.xpath("//*[@class='sort-list']/li/label")).size();
	 	 System.out.println("Links Count is :" + size1 );
	
	 	List <WebElement> Links1 = C1.findElements(By.xpath("//*[@class='sort-list']/li/label"));
	 		
	 	
	 	WebElement dropdown = C1.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[1]/div/div/div/span[2]"));
	 	dropdown.click();
	 	
	 	for(int i= 0; i < Links1.size(); i++ )
	 	{
	 		System.out.println("Text:" +  Links1.get(i).getText());
	 		System.out.println("HTML:" +  Links1.get(i).getAttribute("innerHTML"));
	 			 	
	 		Thread.sleep(2000);
	 		
	 		if (Links1.get(i).getText().contains("New"))
	 		{
	 		
	 			Links1.get(i).click();
	 			break;
	 		}
		}
	
	// select brand
	 	List <WebElement> Links2 = C1.findElements(By.cssSelector("[class='vertical-filters-label common-customCheckbox']"));
	 	System.out.println("Links2 Count is :" + Links2.size() );
	
	 	//Select Brand
		 	for(int i= 0; i < Links2.size(); i++ )
		 	{
		 		System.out.println("Text:" +  Links2.get(i).getText());
		 		System.out.println("HTML:" +  Links2.get(i).getAttribute("innerHTML"));
		 		
		 		Thread.sleep(3000);
		 		if (Links2.get(i).getText().contains("Roadster"))
		 		{
		 			Links2.get(i).click();
		 			break;
		 		}
			}
		 	
		        // Select Price Ranges			
		    	List <WebElement> Price = C1.findElements(By.cssSelector("[class='common-customCheckbox vertical-filters-label']"));
				 System.out.println("Price List Count is :" + Price.size() );
			    	for(int i= 0; i < Price.size(); i++ )
				 	{
				 		System.out.println("Price :" +  Price.get(i).getText());
				 		Thread.sleep(2000);
			    		if ( i < 3 )  // Select First Three Price List Items
				 		{
			    			Price.get(i).click();
				 		//	break;
				 		}
					}
			    	
			    	
			    	//Select Discount
				 	List <WebElement> Discount = C1.findElements(By.cssSelector("[class='common-customRadio vertical-filters-label']"));
					 System.out.println("Discount Count is :" + Discount.size() );
				    	for(int i= 0; i < Discount.size(); i++ )
					 	{
					 		System.out.println("Text:" +  Discount.get(i).getText());
					 		Thread.sleep(2000);
				    	//	if (Discount.get(i).getText().contains("40%")  )
					 	//	{
					 	//		Discount.get(i).click();
					 	//		break;
					 	//	}
				    		
				    		if ( i == 0  ) // Select first discount
					 		{
					 			Discount.get(i).click();
					 			break;
					 	    }
						}
				    		
				    	/*
			    	List <WebElement> Products = C1.findElements(By.cssSelector("[class='common-customCheckbox vertical-filters-label']"));
					 System.out.println("Price List Count is :" + Price.size() );
				    	for(int i= 0; i < Price.size(); i++ )
					 	{
					 		System.out.println("Price :" +  Price.get(i).getText());
					 		Thread.sleep(2000);
				    		if ( i < 3 )  // Select First Three Price List Items
					 		{
				    			Price.get(i).click();
					 		//	break;
					 		}
						}
				      */
				    	
				    	Thread.sleep(5000);
				     	// select third product from the list
						    	
				    	 List<WebElement> Prod = C1.findElements(By.cssSelector("[class='product-imageSliderContainer']"));
										    	
				   	 System.out.println("Product List Count is :" + Prod.size() );
						 for(int i= 0; i < Prod.size(); i++ )
						 	{
						 		System.out.println("Product Descr :" +  Prod.get(i).getText());
						 		Thread.sleep(2000);
					    		if ( i==2  )  // Select First Three Price List Items
						 		{
					    			Prod.get(i).click();
						 			break;
						 		}
							}
						 
						

						 String parent= C1.getWindowHandle();
						 System.out.println("Parent:- " + C1.getTitle());


						 Set<String>s= C1.getWindowHandles();
						 Iterator<String> I1= s.iterator();
						 
						 while(I1.hasNext())
						 {
						 String child_window=I1.next();
						// if(!parent.equals(child_window))
						// {
						 C1.switchTo().window(child_window);

						 System.out.println("Child:- " + C1.getTitle());
						 System.out.println(C1.switchTo().window(child_window).getTitle());

						// driver.close();
						// }

						 }
						 
						 
						    C1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

						 
						 // Select Size
					
						    List <WebElement> Siz = C1.findElements(By.xpath("//p[@class='size-buttons-unified-size']"));
						    
						//    C1.findElement(By.xpath("//p[contains(text(),'Enter Optionality']")).click();


						    
							 System.out.println("Siz List Count is :" + Siz.size() );
							 for(int i= 0; i < Siz.size(); i++ )
							 	{
							 		System.out.println("Size Text :" +  Siz.get(i).getText());
							 		Thread.sleep(2000);
						    		if ( i==0 )  // Select First Three Price List Items
							 		{
						    			Siz.get(i).click();
						    			break;
							 	
							 		}
								}
							
							 
						
							 System.out.println("Add to the cart");
							 WebElement Bag = C1.findElement(By.xpath("//*[@Class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']"));
							 Bag.click();
								
							 System.out.println("Open Cart");
							 WebElement Cart = C1.findElement(By.xpath("//*[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']"));
							 Cart.click();
						
							 System.out.println("Move to Wishlist->");
							 
							 
							 try 
							 {
							// WebElement CheckList = C1.findElement(By.xpath("//*[@class='bulkActionStrip-activeIcon']"));
							 
							 WebElement Gotit = C1.findElement(By.cssSelector("[class='itemComponents-base-invisibleBackDrop']"));
									 
							 Gotit.click();
							 
							 //2
					    	 WebElement Wish = C1.findElement(By.xpath("//*[@class='inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkWishlist']"));
							 System.out.println("Wish Text 2 :" +  Wish.getText());
					    	 Wish.click();
					    	 
					    	 
					    	 /*
					    	 System.out.println("Wishlist Items");
                         
					    	
					  	    List <WebElement> Wish1 = C1.findElements(By.xpath("//*[@class='inlinebuttonV2-base-actionButton bulkActionStrip-desktopBulkWishlist']"));
					  	    int WishSize = Wish1.size();
					  	    System.out.println("Wish List Count is :" + WishSize );
					      */
							 
							 }
							 
							 catch(Exception e)
							 {
								 //1
								 WebElement Wish = C1.findElement(By.xpath("//*[@class='inlinebuttonV2-base-actionButton itemContainer-base-inlineButton  wishlistButton']"));
								 System.out.println("Wish Text 1 :" +  Wish.getText());
						    	 Wish.click();
						    	 
						    	 /* 
						    	 System.out.println("Wishlist Items");
                               
						 	    List <WebElement> Wish1 = C1.findElements(By.xpath("//*[@class='inlinebuttonV2-base-actionButton itemContainer-base-inlineButton  wishlistButton']"));
						 	    int WishSize = Wish1.size();
						 	    System.out.println("Wish List Count is :" + WishSize );
						       */
								 
							 }
					 
							    
					 	    System.out.println("Test Ended Successfully");
						

							 
				    	
	 	}
	 }
