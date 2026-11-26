package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main{
    public static void main(String args[]) throws InterruptedException{
        
        WebDriver driver=new ChromeDriver();
     driver.get("https://ganeshsadagopan.github.io/Selenium_practice/");
   Thread.sleep(500);
     WebElement Rlink= driver.findElement(By.linkText("Register here"));
      
      if(Rlink.getText().equals("Register here")){
           //System.out.print("Link is Available"+ Rlink);
       Rlink.click();

      }
  else{
       System.out.print("Link is not Available");


     }

     WebElement username=driver.findElement(By.xpath("//*[@id=\"reg-username\"]"));
     username.sendKeys("Madhanram");

     WebElement password=driver.findElement(By.id("reg-password"));
     password.sendKeys("1234");
     WebElement cpass=driver.findElement(By.id("reg-confirm"));
     cpass.sendKeys("1234");

        
     
     driver.manage().window().maximize(); 
//-----------------------------------------------------------------------------
//For Gender Radio Button
     List<WebElement> gender=driver.findElements(By.name("gender"));
         gender.get(0).click();


 //------------------------------------------------------------------------------



 //For Course selecting and click
         List<WebElement> Lang=driver.findElements(By.name("course"));
         Lang.get(0).click();
         Lang.get(1).click();
         Lang.get(2).click();

         System.out.print(Lang.get(0).isDisplayed());



 //-------------------------------------------------------------------------------
        //WebElement Gender=driver.findElement(By.xpath("//*[@id=\"register-container\"]/form/div[1]/label[1]/input"));
        //Gender.click();


// WebElement box1=driver.findElement(By.xpath("//*[@id=\"register-container\"]/form/div[2]/label[1]/input"));
// WebElement box2=driver.findElement(By.xpath("//*[@id=\"register-container\"]/form/div[2]/label[2]/input"));
// WebElement box3=driver.findElement(By.xpath("//*[@id=\"register-container\"]/form/div[2]/label[3]/input"));
//      box1.click();

//      Thread.sleep(100);

//      box2.click();

//      Thread.sleep(100);

//      box3.click();

//===========================================================================================================================================
//------------- Address line------------

WebElement addr=driver.findElement(By.id("reg-address"));
addr.sendKeys(" Saibaba colony , near Subhash Jwellery Shop , Coimbatore");

//----------------------Single selection---------------

WebElement  cat=driver.findElement(By.xpath("//*[@id=\"reg-category-single\"]"));

Select selval=new Select (cat);
selval.selectByIndex(0);


WebElement dp=driver.findElement(By.id("dropdownToggle"));
dp.click();
List<WebElement> multioptions=driver.findElements(By.xpath("//*[@id=\"dropdownToggle\"]"));
//multioptions.click();

multioptions.get(0).click();
multioptions.get(1).click();
multioptions.get(2).click();






    }
}
