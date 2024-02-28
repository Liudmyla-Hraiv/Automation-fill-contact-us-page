package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BaseComponent{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstNameInput;
    @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastNameInput;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;
    @FindBy(xpath = "//*[@id='contact_form']/textarea")
    public WebElement messageInput;
    @FindBy(xpath = "//*[@value='SUBMIT']")
    public WebElement submitButton;
    @FindBy(tagName = "h1")
    public WebElement thanksMsg;
    @FindBy(xpath = "//body")
    public WebElement errorMsg;
}
