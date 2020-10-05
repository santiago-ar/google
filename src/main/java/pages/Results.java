package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Results extends BasePage{
    public Results(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
