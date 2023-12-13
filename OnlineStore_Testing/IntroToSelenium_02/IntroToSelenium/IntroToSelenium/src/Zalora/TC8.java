package Zalora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC8 {

		public static void main(String[] args)throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver wd = new ChromeDriver();
			
			wd.get("https://zalora.co.id/");
			
	
			//mencari ribuan fashion brand
			wd.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div[1]/div[6]/a")).click();
			wd.get("https://www.zalora.co.id/kelebihan-belanja-online/#fashionBrands");
			//mencari brand selengkapnya
			wd.findElement(By.xpath("//*[@id=\"tabOne\"]/div[4]/div/div[8]/a")).click();
			//memilih brand berdasarkan abjad G
			wd.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/ul/li[7]/a")).click();
			
		
			
			System.out.println("Successfully opened the website Zalora DemoQA");
			
			Thread.sleep(5000);
			
			//		wd.quit();
			{

			}

		}
		}