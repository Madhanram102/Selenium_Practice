package com.example;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class prac {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // 1. Open Practice Site
            driver.get("https://testautomationpractice.blogspot.com/");

            // 2. Text Inputs (Name, Email, Phone, Address)
            driver.findElement(By.id("name")).sendKeys("Madhanram");
            driver.findElement(By.id("email")).sendKeys("madhanram@example.com");
            driver.findElement(By.id("phone")).sendKeys("9876543210");
            driver.findElement(By.id("textarea")).sendKeys("Saibaba Colony, Coimbatore");

            // 3. Radio Button (Gender: Male)
            driver.findElement(By.id("male")).click();

            // 4. Checkboxes (Select Sunday, Monday, Friday)
            driver.findElement(By.id("sunday")).click();
            driver.findElement(By.id("monday")).click();
            driver.findElement(By.id("friday")).click();

            // 5. Single-Select Dropdown (Country -> India)
            WebElement countryDropdown = driver.findElement(By.id("country"));
            Select countrySelect = new Select(countryDropdown);
            countrySelect.selectByVisibleText("India");

            // 6. Multi-Select Listbox (Colors -> genuine <select multiple> tag!)
            WebElement colorsDropdown = driver.findElement(By.id("colors"));
            Select colorsSelect = new Select(colorsDropdown);
            colorsSelect.selectByVisibleText("Red");
            colorsSelect.selectByVisibleText("Blue");
            colorsSelect.selectByIndex(2); // Green

            // 7. Multi-Select Sorted List (Animals)
            WebElement animalsDropdown = driver.findElement(By.id("animals"));
            Select animalsSelect = new Select(animalsDropdown);
            animalsSelect.selectByVisibleText("Cheetah");
            animalsSelect.selectByVisibleText("Lion");

            // 8. Date Picker 1 (Direct input format mm/dd/yyyy)
            driver.findElement(By.id("datepicker")).sendKeys("11/26/2026");

            // 9. Alerts & Popups (Simple Alert)
            driver.findElement(By.id("alertBtn")).click();
            Alert simpleAlert = driver.switchTo().alert();
            System.out.println("Alert text: " + simpleAlert.getText());
            simpleAlert.accept();

            // 10. Actions Class: Mouse Hover, Double Click, Drag & Drop
            Actions actions = new Actions(driver);

            // Mouse Hover
            WebElement pointMeBtn = driver.findElement(By.className("dropbtn"));
            actions.moveToElement(pointMeBtn).perform();

            // Double Click
            WebElement copyTextBtn = driver.findElement(By.xpath("//button[text()='Copy Text']"));
            actions.doubleClick(copyTextBtn).perform();

            // Drag and Drop
            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));
            actions.dragAndDrop(source, target).perform();

            // 11. Read Static Web Table Rows
            List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
            System.out.println("Total rows in Static Table: " + rows.size());

        } finally {
            // Uncomment below line when you want the browser to close automatically
            // driver.quit();
        }
    }
}
