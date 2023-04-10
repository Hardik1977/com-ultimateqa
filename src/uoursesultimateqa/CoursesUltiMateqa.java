package uoursesultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoursesUltiMateqa {
    public static void main(String[] args) {

        //Launch the browser(How to launch the webbrowser
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        //Open the URL in web browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        // Getting Title for URL
        String title = driver.getTitle();
        System.out.println("Title : " + title);
        //Getting current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("");
        //Maximising window with the help of driver obj
        driver.manage().window().maximize();
        //Displaying page source
        System.out.println("Page Source : " + driver.getPageSource());
        //Enter the email to email field and password to password field
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("SYZ123@yahoo.com");
        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("Prime123");
        //driver closing statement
        driver.close();


    }
}