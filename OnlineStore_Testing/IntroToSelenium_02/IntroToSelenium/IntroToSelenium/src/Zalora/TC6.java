package Zalora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC6 {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://zalora.co.id/");
		
		/* wd.get("https://iddesk.freshdesk.com/support/home"); */
		//mencari barang di pencarian
		wd.findElement(By.xpath("//*[@id=\"onsiteSearch\"]/input")).sendKeys("sepatu");
		wd.findElement(By.xpath("//*[@id=\"onsiteSearch\"]/button")).click();
		//memasukkan harga max dan min
		wd.findElement(By.xpath("//*[@id=\"price-filter\"]/div[2]/div/div/input[1]")).sendKeys("60000");
		wd.findElement(By.xpath("//*[@id=\"price-filter\"]/div[2]/div/div/input[2]")).sendKeys("100000");
		
		wd.findElement(By.xpath("//*[@id=\"price-filter\"]/div[2]/div/div/div[2]")).click();
		
		System.out.println("Successfully opened the website Zalora DemoQA");
		
		Thread.sleep(5000);
		
		//		wd.quit();
		{

		}

	}
	}