package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriver.Driver;

public class RegisterPage {

    @FindBy(xpath = "//button[.='Registrar']")
    private WebElement register;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "name")
    private WebElement name;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "passwordConfirmation")
    private WebElement passwordConfirmation;

    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void setName(String name){
        this.name.sendKeys(name);
    }

    public void clickRegister(){
        register.click();
    }

    public void setPassowrd(String passowrd){
          this.password.sendKeys(passowrd);
    }

    public void confirmPassword(String password){
        this.passwordConfirmation.sendKeys(password);
    }

    public void setEmail(String mail){
        email.sendKeys(mail);
    }


}
