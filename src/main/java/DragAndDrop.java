
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Dynamic.html");

        // Get all draggable images
        List<WebElement> images = driver.findElements(By.xpath("//img"));

        // Get drop area
        WebElement dropArea = driver.findElement(By.id("droparea"));

        // Actions class
        Actions act = new Actions(driver);

        // Drag each image
        for (WebElement image : images) {

            act.dragAndDrop(image, dropArea).perform();
        }

        driver.quit();
    }
}

