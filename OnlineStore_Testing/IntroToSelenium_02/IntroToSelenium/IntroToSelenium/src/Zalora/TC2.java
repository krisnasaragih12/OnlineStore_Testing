package Zalora;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://zalora.co.id/");
		//Masuk ke menu pertanyaan
		wd.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div/div[16]/a")).click();
		
		//Pindah halaman dan ini adalah halaman pertanyaan
		wd.get("https://iddesk.freshdesk.com/support/home");
		
		//Masuk ke menu pertanyaan utama
		wd.findElement(By.xpath("//*[@id=\"solutions-index-home\"]/ul/li[1]/a"));
		
	
		wd.findElement(By.xpath("//*[@id=\"solutions-category-77000131878\"]/div[2]/section/ul/li[1]/div/a")).click();
		
		System.out.println("Berhasil berpindah halaman dan menggunakan menu pertanyaan ");
		
		Thread.sleep(5000);
		
//		wd.quit();
		{

		}

	}
	}