package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUp extends ParentPage{
    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    public WebElement singInButton;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailLine;
    @FindBy(xpath = "(//input[@id='pass'])[1]")
    public WebElement passwordLine;
    @FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
    public WebElement singInOpenButton;



//me124578*-- password
    // kdkjdjdfhfhfh@gmail.com
    }