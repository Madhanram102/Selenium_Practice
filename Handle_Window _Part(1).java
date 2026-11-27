package com.example;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Window {
    public static void main(String[] args) {
        
       // System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Google\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();

      driver.get("https://ganeshsadagopan.github.io/HandleWindows/ ");

      WebElement opentab=driver.findElement(By.xpath("/html/body/div[1]/button[2]"));

opentab.click();

Set<String> ID=driver.getWindowHandles();

ArrayList<String> IDlist=new ArrayList<>(ID);

driver.switchTo().window(IDlist.get(1));




    }
    
}
