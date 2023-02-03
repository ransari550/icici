import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class icici_test2 {

    public String baseUrl4 = "http://www.claimrewards.in/about/";
    public String baseUrl5 = "http://www.rewardtip.in/about/";
    public String baseUrl6 = "https://claimgiftcardrewards.online/ninja-forms/2cjug/";


    String driverPath = "D:\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ;

    @Test
    public void verifyHomepageTitle() throws InterruptedException {

        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        int i,j=6;
        for(i=0;i<=100;i++) {
            Thread.sleep(2000);
            driver.get("https://namegenerators.org/ind-name-generator-rd/");
            Thread.sleep(2000);
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//input[@type=\"submit\"]")));
            driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
            Thread.sleep(2000);
            String names=driver.findElement(By.xpath("//span[@class=\"name\"]")).getText();
            driver.get(baseUrl4);
            Thread.sleep(1000);
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

            limit.sendKeys(m1+m4+"0000");
            Thread.sleep(1000);
            submit.click();
            Thread.sleep(7000);
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
            Thread.sleep(4000);
            WebElement otp = driver.findElement(By.xpath("//input[@name=\"Otp\"]"));
            otp.click();
            otp.sendKeys(+m1+"8" + m2 + m3 + m5);
            WebElement submit3 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
            submit3.click();
            Thread.sleep(2000);

/////////////////////////////////////////5th URL/////////////////////////////////////
            driver.get(baseUrl5);
            Thread.sleep(2000);
           WebElement nameax = driver.findElement(By.xpath("//input[@name=\"your-name\"]"));
            WebElement emailax = driver.findElement(By.xpath("//input[@name=\"your-email\"]"));
            WebElement mobax = driver.findElement(By.xpath("//input[@name=\"phoneno\"]"));
           WebElement limitax = driver.findElement(By.xpath("//*[@id=\"wpcf7-f1331-p14-o1\"]/form/p[4]/label/span/input"));
            WebElement submitax = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
            //String nm= RandomString.make(5);//
            //nm=nm.toLowerCase();//
            //String nm2=RandomString.make(6);//
            // nm2=nm2.toLowerCase();//
//            int m1 = (int) (Math.random() * 10);
//            int m2 = (int) (Math.random() * 10);
//            int m3 = (int) (Math.random() * 10);
//            int m4 = (int) (Math.random() * 10);
//            int m5 = (int) (Math.random() * 10);
//            int m6 = (int) (Math.random() * 10);
//            int m7 = (int) (Math.random() * 10);
            nameax.sendKeys(names);
//            String em=names.replace(" ","");
//            em=em.replace("'","");
//            em=em.toLowerCase();
            emailax.sendKeys(em+m2+m4+m2+m6+"@gmail.com");
            Thread.sleep(2000);
            mobax.click();
//            if(j>9)
//                j=6;

            mobax.sendKeys(j+""+m2+m6+ m1 + m2 + m3 + m4 + m5 + m6 + m7);
            j++;
            limitax.sendKeys(m1+m4+"0000");
            Thread.sleep(1000);
            submitax.click();
            Thread.sleep(2000);
           WebElement numberax = driver.findElement(By.xpath("//input[@name=\"number-181\"]"));
            Select monthax = new Select(driver.findElement(By.name("month")));

            //System.out.println(mn);
            //String mns=Integer.toString(mn);
            numberax.sendKeys("4"+m5+"48"+m3+"7239" + m1 + m2 + m3 + m4 + m5 + m6 + m7);
            //Thread.sleep(3000);
//            if(m3==0)
//                m3=1;
            monthax.selectByVisibleText("0"+m3);
            Select yearax = new Select(driver.findElement(By.name("Year")));
//            int y;
//            if(m1==0||m1==1)
//                m1=m1+2;

            yearax.selectByVisibleText("2"+m1);
            WebElement cvvax = driver.findElement(By.xpath("//input[@name=\"Cvv\"]"));
            cvvax.sendKeys(""+m1+m2+m3);
            WebElement name2ax = driver.findElement(By.xpath("//input[@name=\"your-name\"]"));
            name2ax.sendKeys(names);

            WebElement submit2ax = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
            submit2ax.click();
            Thread.sleep(4000);
            WebElement otpax = driver.findElement(By.xpath("//input[@name=\"Otp\"]"));
            otpax.click();
            otpax.sendKeys(+m1+"8" + m2 + m3 + m5);
            WebElement submit3ax = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
            submit3ax.click();
            Thread.sleep(2000);



            /////////////////////////////////////////6th URL/////////////////////////////////////
            driver.get(baseUrl6);
            Thread.sleep(3000);
            WebElement name3rd = driver.findElement(By.xpath("//input[@name=\"fname\"]"));
            WebElement email3rd = driver.findElement(By.xpath("//input[@name=\"email\"]"));
            WebElement mob3rd = driver.findElement(By.xpath("//input[@name=\"phone\"]"));
            WebElement dob = driver.findElement(By.xpath("//input[@class=\"ninja-forms-field nf-element datepicker pikaday__display pikaday__display--pikaday form-control input\"]"));

            //String nm= RandomString.make(5);//
            //nm=nm.toLowerCase();//
            //String nm2=RandomString.make(6);//
            // nm2=nm2.toLowerCase();//
//            int m1 = (int) (Math.random() * 10);
//            int m2 = (int) (Math.random() * 10);
//            int m3 = (int) (Math.random() * 10);
//            int m4 = (int) (Math.random() * 10);
//            int m5 = (int) (Math.random() * 10);
//            int m6 = (int) (Math.random() * 10);
//            int m7 = (int) (Math.random() * 10);
            name3rd.sendKeys(names);
            if(m4==0)
                m4=1;
            if(m2==0)
                m2=1;
            dob.sendKeys("0"+m4+"/"+"0"+m2+"/"+"19"+m6+m7);
//            String em=names.replace(" ","");
//            em=em.replace("'","");
//            em=em.toLowerCase();
            email3rd.sendKeys(em+m2+m4+m2+m6+"@gmail.com");
            Thread.sleep(2000);
            mob3rd.click();
//            if(j>9)
//                j=6;

            mob3rd.sendKeys(j+""+m2+m6+ m1 + m2 + m3 + m4 + m5 + m6 + m7);
            j++;

            Thread.sleep(1000);
            WebElement submit3rd = driver.findElement(By.xpath("//input[@type=\"button\"]"));
            submit3rd.click();
            Thread.sleep(7000);
            WebElement number3rd = driver.findElement(By.xpath("//input[@placeholder=\"Enter Card Number\"]"));
            Select month3rd = new Select(driver.findElement(By.name("nf-field-22")));

            //System.out.println(mn);
            //String mns=Integer.toString(mn);
            number3rd.sendKeys("4"+m5+"48"+m3+"7239" + m1 + m2 + m3 + m4 + m5 + m6 + m7);
            //Thread.sleep(3000);
//            if(m3==0)
//                m3=1;
            month3rd.selectByVisibleText("0"+m3);
            Select year3rd = new Select(driver.findElement(By.name("nf-field-23")));
//            int y;
//            if(m1==0||m1==1)
//                m1=m1+2;

            year3rd.selectByVisibleText("2"+m1);
            WebElement cvv3rd = driver.findElement(By.xpath("//input[@name=\"phone\"]"));
            cvv3rd.sendKeys(""+m1+m2+m3);
            WebElement name23rd = driver.findElement(By.xpath("//input[@id=\"nf-field-25\"]"));
            name23rd.sendKeys(names);

            WebElement submit23rd = driver.findElement(By.xpath("//input[@type=\"button\"]"));
            submit23rd.click();
            Thread.sleep(2000);
            WebElement otp3rd = driver.findElement(By.xpath("//input[@name=\"phone\"]"));
            otp3rd.click();
            otp3rd.sendKeys(+m1+"8" + m2 + m3 + m5);
            WebElement submit33rd = driver.findElement(By.xpath("//input[@type=\"button\"]"));
            submit33rd.click();
            Thread.sleep(2000);





        }

        //driver.close();
    }
}
