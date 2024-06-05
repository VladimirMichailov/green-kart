package lt.techin.vm;

import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

public class GreenKartPage {

    WebDriver driver;

    public GreenKartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By chooseItemsPerPage = By.id("page-menu");

    private By choose20PerPage = By.cssSelector("#page-menu > option:nth-child(3)");

    private By searchInput = By.id("search-field");

    private By tdName  = By.cssSelector("tr>td:nth-of-type(1)");

    private By selectByName = By.cssSelector("th:nth-of-type(1) > span:nth-of-type(1)");

    private By clickNextIfActive = By.cssSelector("li:nth-of-type(7) > a[role='button']");



    public void setChooseItemsPerPage() {
        driver.findElement(chooseItemsPerPage).click();
        driver.findElement(choose20PerPage).click();

    }

    public void clickToSelectByName(){
        driver.findElement(selectByName).click();
    }


    public void setSearchInput(String searchText){
        driver.findElement(searchInput).sendKeys(searchText);

    }

    public List<String> getNames(){
        List<WebElement> tdNames = driver.findElements(tdName);
     List<String> names = new ArrayList<>();
     for(WebElement tdName : tdNames){
         names.add(tdName.getText());
     }
     return  names;



  }

public void setClickNextIfActive(){
        WebElement button = driver.findElement(clickNextIfActive);
        while(button.isEnabled()){
            button.click();
        }
}







}