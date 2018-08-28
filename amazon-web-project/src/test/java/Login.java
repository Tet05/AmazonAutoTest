import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
ChromeDriver wd;
@BeforeMethod

public void start() {
    wd = new ChromeDriver();

}
    @Test

public void testOpenWeb(){
wd.get( "https://www.amazon.com");
}
@AfterMethod
    public void stop() throws InterruptedException {
    //Thread.sleep(3000);
    wd.quit();
}
}
