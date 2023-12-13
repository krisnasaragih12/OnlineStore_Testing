package Zalora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10 {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://zalora.co.id/");
		//masuk ke halaman produk original dan produk
		wd.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div[1]/div[2]/a")).click();
		wd.get("https://www.zalora.co.id/kelebihan-belanja-online/#originalProducts");
		//memutar video
		wd.findElement(By.xpath("//*[@id=\"movie_player\"]/div[4]/button")).click();		
		
		System.out.println("Successfully opened the website Zalora DemoQA");
		
		Thread.sleep(5000);
		
		//		wd.quit();
		{

		}

	}
	}
