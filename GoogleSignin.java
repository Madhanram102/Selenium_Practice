package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignin {
    public static void main(String args[]) throws InterruptedException
    {

         WebDriver  driver=new ChromeDriver();

         driver.get("https://google.com");
         driver.manage().window().maximize();
    Thread.sleep(1000);
         WebElement  Slink=driver.findElement(By.linkText("Sign in"));
         Slink.click();



         WebElement Email=driver.findElement(By.id("identifierId"));
         Email.sendKeys("test@gmail.com");
        
 Thread.sleep(1000);


         // WebElement Next=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
         // Next.click(); 

        

    }
    
}
