package com.example;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BASE64_Screenshot {


    public static void main(String[] args) {
        
    
    WebDriver driver=new ChromeDriver();

    driver.get("https://google.com");

   

    TakesScreenshot screenshot=(TakesScreenshot)driver;

    String s1=screenshot.getScreenshotAs(OutputType.BASE64);
    System.out.print(s1);
 

    }
}
