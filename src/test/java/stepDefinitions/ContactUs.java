package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ContactUsPage;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class ContactUs {
    protected WebDriver driver;
    ContactUsPage contactUs;
    @Given("open URL link")
    public void open_url_link() {
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }
    @When("fill fields {string} {string} {string} {string}")
    public void fill_fields(String FirstName, String LastName, String Email, String Text) {
            contactUs = new ContactUsPage(driver);
            contactUs.firstNameInput.sendKeys(FirstName);
            contactUs.lastNameInput.sendKeys(LastName);
            contactUs.emailInput.sendKeys(Email);
            contactUs.messageInput.sendKeys(Text);
            contactUs.submitButton.click();
    }


    @Then("Message: Thank you for your Message!")
    public void message_thank_you_for_your_message() {
        String text = contactUs.thanksMsg.getText();
        assertFalse("Message absent", text.isEmpty());
        assertEquals(text, "Thank You for your Message!");
        System.out.println(text);
        driver.close();
    }


}
