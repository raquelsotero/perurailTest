package base;

import jdk.javadoc.doclet.Reporter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import javax.imageio.IIOException;
import java.io.File;
import java.nio.file.Files;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BaseTest {
    protected WebDriver driver;



    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        //Navega a la url
        driver.get("https://www.perurail.com/es/");
        //Maximiza
        driver.manage().window().maximize();



    }

    @AfterMethod
    public void tearDoen(){
        if (driver!=null){
           //driver.quit();
        }
    }




   // public static  void main (String[] arg){
     //   BaseTest baseTest = new BaseTest();
     //   baseTest.setUp();
   // }




}
