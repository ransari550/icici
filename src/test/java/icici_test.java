
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class icici_test {
    public String baseUrl = "http://www.rewardsmart.in/about/";
    String driverPath = "D:\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ;

    @Test
    public void verifyHomepageTitle() throws InterruptedException {

        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        int i,j=6;
        for(i=0;i<=50;i++) {
            Thread.sleep(2000);
            driver.get("https://namegenerators.org/ind-name-generator-rd/");
            Thread.sleep(2000);
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//input[@type=\"submit\"]")));
            driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
            Thread.sleep(2000);
            String names=driver.findElement(By.xpath("//span[@class=\"name\"]")).getText();
            driver.get(baseUrl);
            WebElement name = driver.findElement(By.xpath("//input[@name=\"your-name\"]"));
            WebElement email = driver.findElement(By.xpath("//input[@name=\"your-email\"]"));
            WebElement mob = driver.findElement(By.xpath("//input[@name=\"phoneno\"]"));
            WebElement limit = driver.findElement(By.xpath("//*[@id=\"wpcf7-f1331-p14-o1\"]/form/p[4]/label/span/input"));
            WebElement submit = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
            //String nm= RandomString.make(5);
            //nm=nm.toLowerCase();
            //String nm2=RandomString.make(6);
           // nm2=nm2.toLowerCase();
            int m1 = (int) (Math.random() * 10);
            int m2 = (int) (Math.random() * 10);
            int m3 = (int) (Math.random() * 10);
            int m4 = (int) (Math.random() * 10);
            int m5 = (int) (Math.random() * 10);
            int m6 = (int) (Math.random() * 10);
            int m7 = (int) (Math.random() * 10);
            name.sendKeys(names);
            String em=names.replace(" ","");
            em=em.replace("'","");
            em=em.toLowerCase();
            email.sendKeys(em+m2+m4+m2+m6+"@gmail.com");
            Thread.sleep(2000);
            mob.click();
            if(j>9)
                j=6;

            mob.sendKeys(j+""+m2+m6+ m1 + m2 + m3 + m4 + m5 + m6 + m7);
            j++;
            limit.sendKeys(m1+m4+"0000");
            Thread.sleep(1000);
            submit.click();
            Thread.sleep(2000);
            WebElement number = driver.findElement(By.xpath("//input[@name=\"number-181\"]"));
            Select month = new Select(driver.findElement(By.name("month")));

            //System.out.println(mn);
            //String mns=Integer.toString(mn);
            number.sendKeys("4"+m5+"48"+m3+"7239" + m1 + m2 + m3 + m4 + m5 + m6 + m7);
            //Thread.sleep(3000);
            if(m3==0)
                m3=1;
            month.selectByVisibleText("0"+m3);
            Select year = new Select(driver.findElement(By.name("Year")));
            int y;
            if(m1==0||m1==1)
            m1=m1+2;

            year.selectByVisibleText("2"+m1);
            WebElement cvv = driver.findElement(By.xpath("//input[@name=\"Cvv\"]"));
            cvv.sendKeys(""+m1+m2+m3);
            WebElement name2 = driver.findElement(By.xpath("//input[@name=\"your-name\"]"));
            name2.sendKeys(names);

            WebElement submit2 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
            submit2.click();
            Thread.sleep(2000);
            WebElement otp = driver.findElement(By.xpath("//input[@name=\"Otp\"]"));
            otp.click();
            otp.sendKeys(+m1+"8" + m2 + m3 + m5);
            WebElement submit3 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
            submit3.click();
        }

        //driver.close();
    }
}
