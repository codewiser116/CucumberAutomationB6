package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//textarea[@title='Search']")
    public WebElement searchBox;


    @FindBy(xpath = "(//input[@aria-label='Google Search'])[2]")
    public WebElement searchButton;


    @FindBy(xpath = "//a/h3")
    public List<WebElement> searchResults;



}
