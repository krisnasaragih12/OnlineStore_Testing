package Zalora;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://zalora.co.id/");
		
		//masuk ke pertanyaan utama
		wd.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div/div[16]/a")).click();
		wd.get("https://iddesk.freshdesk.com/support/home");
		
		//ketik kata kunci  di search bar 
		wd.findElement(By.xpath("//*[@id=\"support-search-input\"]")).sendKeys("bagaimana cara berlangganan ZNOW?");
		
		//klik search untuk mengeluarkan output
		wd.findElement(By.xpath("//*[@id=\"hc-search-form\"]/div[2]/button")).click();
		
		System.out.println("berhasil menggunakan fungsi search di menu pertanyaan umum dan mengeluarkan output");
		
		Thread.sleep(5000);
		
//		wd.quit();
		{

		}

	}
	}