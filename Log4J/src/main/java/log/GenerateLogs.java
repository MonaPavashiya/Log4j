package log;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLogs {
	
	
	public static void main(String[] args) 
	{
		Logger log = Logger.getLogger(GenerateLogs.class);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    log.info("launching brower");
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    log.info("orangeHrm has been launched");
	    
	    String title = driver.getTitle();
	    System.out.println("Title value is : " + title);
	    log.info("Title value is : " + title);
	    
	    if(title.equals("OrangeHRM"))
	    {
	    	System.out.println("Correct title is OrangeHRM");
	    	log.info("Correct title is OrangeHRM and test case is passed");
	    }
	    else 
	    {
	    	System.out.println("Correct title is  not OrangeHRM");
	    	log.info("Correct title is not OrangeHRM and test case is failed");
	    }
	    driver.quit();
	    log.info("Browser is closed");
	}

}
