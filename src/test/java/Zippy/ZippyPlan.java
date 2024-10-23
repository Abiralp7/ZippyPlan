package Zippy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


	
	public class ZippyPlan  {
		@Test
		public static void ZippyPlan() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			 
			driver.manage().window().maximize();

			 driver.get("https://app.zippyplan.com/");
			 
			//Dashboard
			 
			 //Thread.sleep(3000);
			@SuppressWarnings({ "unused", "deprecation" })
			Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			driver.findElement(By.xpath("//a[contains(@class, 'w-40') and contains(@class, 'grow') and contains(@href, '/register')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[placeholder='Enter your full name'][class*='rounded-lg']\r\n"+ "")).sendKeys("");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input.w-full.rounded-lg.py-2\\.5.pl-3\\.5.pr-9.text-base.font-normal.text-gray-gray1.outline-none.ring-1.placeholder\\:text-gray-gray5.focus\\:outline-none.read-only\\:focus\\:ring-gray-gray6.ring-gray-gray6.focus\\:shadow-input.focus\\:ring-primary")).sendKeys("");	
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input.w-full.rounded-lg.py-2\\.5.pl-3\\.5.pr-9.text-base.font-normal.text-gray-gray1.outline-none.ring-1.placeholder\\:text-gray-gray5.focus\\:outline-none.ring-gray-gray6.focus\\:shadow-input.focus\\:ring-primary[type='password'][placeholder='Enter Your Password'][name='password']")).sendKeys("");					
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input.w-full.rounded-lg.py-2\\.5.pl-3\\.5.pr-9.text-base.font-normal.text-gray-gray1.outline-none.ring-1.placeholder\\:text-gray-gray5.focus\\:outline-none.ring-gray-gray6.focus\\:shadow-input.focus\\:ring-primary[type='password'][placeholder='Confirm Password'][name='confirmPassword']")).sendKeys("");
			//signup garako
			
			driver.findElement(By.cssSelector("a.w-40.grow.rounded-none.border-b.pb-2\\.5.text-center.font-medium.transition-all.duration-300.ease-in-out.focus\\:ring-0[href='/login']")).click();		        
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='email'][placeholder='Enter your email'].rounded-lg.py-2\\.5.pl-3\\.5.pr-9.text-base.font-normal.text-gray-gray1.outline-none.ring-1.placeholder\\:text-gray-gray5.focus\\:outline-none.read-only\\:focus\\:ring-gray-gray6.ring-gray-gray6.focus\\:shadow-input.focus\\:ring-primary.w-full.items-center.flex")).sendKeys("");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input.w-full.rounded-lg.py-2\\.5.pl-3\\.5.pr-9.text-base.font-normal.text-gray-gray1.outline-none.ring-1.placeholder\\:text-gray-gray5.focus\\:outline-none.ring-gray-gray6.focus\\:shadow-input.focus\\:ring-primary[type='password'][placeholder='Enter your password'][name='password']")).sendKeys("");
			Thread.sleep(1000);
			
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("rect.custom-checkbox-box")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("button.rounded-lg.transition-colors.font-medium.disabled\\:cursor-not-allowed.flex.justify-center.items-center.focus\\:ring-1.focus-visible\\:ring-primary.bg-primary.hover\\:bg-opacity-\\[95\\].text-white.disabled\\:bg-opacity-70.p-2\\.5.mb-4.w-full[type='submit']")).click();
			Thread.sleep(1000);
			//login garako
			   
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'This month')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M19.9812 3')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='Create Meeting Type']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Business']")).sendKeys("Urgent meeting");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='url']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='url']")).clear();
			driver.findElement(By.xpath("//input[@name='url']")).sendKeys("Very Important");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='inPerson']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='inPersonMeetingLocation']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='inPersonMeetingLocation']")).sendKeys("Chabahil");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@placeholder='Enter meeting description']")).click();
			driver.findElement(By.xpath("//textarea[@placeholder='Enter meeting description']")).sendKeys("This is the first round of the interview Please don't hesitate to speak with us");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h1[contains(text(),'30')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h1[contains(text(),'45')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h1[contains(text(),'60')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h1[contains(text(),'90')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h1[contains(text(),'120')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h1[contains(text(),'15')]")).click();
            Thread.sleep(1000);
            Actions actions1 = new Actions(driver);
    		WebElement button1 =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[3]/button[1]"));
			actions1.moveToElement(button1).click().sendKeys("\uE007").perform();
           Thread.sleep(1000);
		   driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Asia/Katmandu");
		   Thread.sleep(1000);
		   Actions action2 = new Actions(driver);
		   WebElement button2 =driver.findElement(By.id(":rm9:"));
		   actions1.moveToElement(button2).click().sendKeys("\uE007").perform();
		   Thread.sleep(1000);
		   Actions action3 = new Actions(driver);
		   WebElement button3 =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/button[1]"));
		   actions1.moveToElement(button3).click().sendKeys("\uE007").perform();
		   Thread.sleep(1000);
           
           Actions action4 = new Actions(driver);
		   WebElement button4 =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[2]/button[1]"));
		   actions1.moveToElement(button4).click().sendKeys("\uE007").perform(); 
           Thread.sleep(1000);
           driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/button[2]")).click();
          //Thread.sleep(2000);
       //driver.findElement(By.xpath("//button[@id='sunday']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
       Thread.sleep(2000);
       Actions actions = new Actions(driver);
       for (int i = 0; i < 1; i++) {  // Scroll up 1 times
       	
           actions.sendKeys(Keys.ARROW_UP).sendKeys("\uE007").perform();
           driver.findElement(By.xpath("//button[contains(text(),'Submit Booking Type')]")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]/div[1]")).click();
           Thread.sleep(1000);
           driver.findElement(By.xpath("//p[contains(text(),'Edit')]")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
           Thread.sleep(1000);
           driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]/div[1]")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[4]/button[1]")).click();
           //meeting type ko in person meeting samma saakyo
           
          Thread.sleep(2000);
           driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]")).click();
         Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Business']")).sendKeys("Urgent meeting");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[1]/div[5]/textarea[1]")).sendKeys("Hello world");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
			Thread.sleep(1000);
			 Actions actions5 = new Actions(driver);
	    		WebElement button5 =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/button[1]"));
				actions1.moveToElement(button5).click().sendKeys("\uE007").perform();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[contains(text(),'Submit Booking Type')]")).click();
				Thread.sleep(1000);
				
        }
		}
		}
