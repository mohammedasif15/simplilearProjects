import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAccess {
	public static void main(String[] args) throws InterruptedException {
		

	    System.setProperty("webdriver.chrome.driver","I:\\selenium\\95\\chromedriver.exe");
	    
	    WebDriver wd= new ChromeDriver();


	    wd.manage().window().maximize();
	    wd.get("https://www.flipkart.com/?ef_id=d33f89452a891c116aa9eb5dd176e191:G:s&s_kwcid=AL!739!10!76347474199616!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
	    wd.findElement(By.className("_1_3w1N")).click();
	    Thread.sleep(200); 
	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("Tom123@gmail.com");
	    Thread.sleep(5000);
	    	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("1234567");
	    Thread.sleep(5000);
	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).submit();
	    Thread.sleep(3000);  
	    wd.close();
	    
	}
}
