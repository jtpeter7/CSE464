import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class calcTest {

    WebDriver driver = new ChromeDriver();


    @Test
    public void Test1() throws InterruptedException {
        driver.navigate().to("http://webstrar99.fulton.asu.edu/page2/");
        driver.findElement(By.id("number1")).sendKeys("10");
        driver.findElement(By.id("number2")).sendKeys("5");
        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("calc")).click();
        Assert.assertEquals("15", driver.findElement(By.id("res")).getText());
        driver.quit();
    }
    @Test
    public void Test2() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://webstrar99.fulton.asu.edu/page2/");
        driver.findElement(By.id("number1")).sendKeys("10");
        driver.findElement(By.id("number2")).sendKeys("5");
        driver.findElement(By.id("sub")).click();
        driver.findElement(By.id("calc")).click();
        Assert.assertEquals("5", driver.findElement(By.id("res")).getText());
        driver.quit();
    }

    @Test
    public void Test3() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://webstrar99.fulton.asu.edu/page2/");
        driver.findElement(By.id("number1")).sendKeys("10");
        driver.findElement(By.id("number2")).sendKeys("5");
        driver.findElement(By.id("mul")).click();
        driver.findElement(By.id("calc")).click();
        Assert.assertEquals("50", driver.findElement(By.id("res")).getText());
        driver.quit();
    }

    @Test
    public void Test4() throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://webstrar99.fulton.asu.edu/page2/");
        driver.findElement(By.id("number1")).sendKeys("10");
        driver.findElement(By.id("number2")).sendKeys("5");
        driver.findElement(By.id("div")).click();
        driver.findElement(By.id("calc")).click();
        Assert.assertEquals("2", driver.findElement(By.id("res")).getText());
        driver.quit();
    }

}
