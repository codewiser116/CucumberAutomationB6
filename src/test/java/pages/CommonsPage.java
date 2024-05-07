package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonsPage {

    public CommonsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "cal_input")
    public WebElement calories_input;

    @FindBy(id = "num_meals_selector")
    public WebElement number_of_meals_dropdown;

    @FindBy(xpath = "//button[@data-loading-text='Generate']")
    public WebElement generateButton;

    @FindBy(xpath = "//li[@data-value='vegan']/a")
    public WebElement vegan;


}
