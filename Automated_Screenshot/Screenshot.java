package com;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class Screenshot {
    public static void main(String args[]) throws IOException{

        WebDriver driver=new  ChromeDriver();

        driver.get("https://google.com");

        TakesScreenshot screenshot= (TakesScreenshot)driver;

        File  newscreenshot =screenshot.getScreenshotAs(OutputType.FILE);

        File screen2=new File("C:\\Selenium_Project\\demo\\src\\main\\image.png");

        Files.copy(newscreenshot, screen2);



    }
    
}
