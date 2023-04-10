package uoursesultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Chrome";
    static WebDriver driver;
    static String baseurl = "https://courses.ultimateqa.com/users/sign_in";

    //Main method defining
    public static void main(String[] args) {
        //If and else if statements

        if(browser.equalsIgnoreCase("Chrome") ){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong Browser name.");
        }
        // to display URL address
        driver.get(baseurl);
        //Maximizing window statement
        driver.manage().window().maximize();
        //Display current URL
        System.out.println("Current URl : " + driver.getCurrentUrl());
        //To get page source
        System.out.println("Page Source : " + driver.getPageSource());
        //Get the title of the page with the method of Get()
        String title = driver.getTitle();
        System.out.println("Title : " + title);
        //Wait statement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Find the Username from Username Field
        WebElement username = driver.findElement(By.id("user[email]"));
        username.sendKeys("XYZ123@gmeil.com");
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("Prime123");
        //Driver closing statment
        driver.close();

    }




}
