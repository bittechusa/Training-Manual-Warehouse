import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Demo4Test extends BaseTest 
{

	@Test
	public void testLink()throws Exception{
        getDriver().get("http://aol.com");
        Thread.sleep(2000);
    }

}