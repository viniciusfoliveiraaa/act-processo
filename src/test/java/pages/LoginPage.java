package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.UtilsWait;
import webdriver.Driver;

public class LoginPage {

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath =  "//button[.='Acessar']")
    private WebElement botaoEntrar;

    @FindBy(id = "modalText")
    private WebElement modalText;

    @FindBy(id = "btnCloseModal")
    private WebElement close;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getTextError(){
        UtilsWait.waitPresenceOfElement(modalText, 60);
        return modalText.getText();
    }

    public void digitarUsuario(String user){
        email.sendKeys(user);
    }


    public void digitarSenha(String senha){
        password.sendKeys(senha);
    }


    public void clickButtonEntrar(){
        botaoEntrar.click();
    }

    public void clickButtoClose(){
         close.click();
    }
}