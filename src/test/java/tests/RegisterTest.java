package tests;

import org.junit.Test;
import pages.LoginPage;
import pages.RegisterPage;
import utils.UtilsWeb;

public class RegisterTest {

    private RegisterPage registerPage = new RegisterPage();

    @Test
    public void registerComSucesso(){

        UtilsWeb.inicializar();

        registerPage.setEmail("viniciusferreira472@gmail.com");
        registerPage.setName("vini");
        registerPage.setPassowrd("123");
        registerPage.confirmPassword("123");

        registerPage.clickRegister();

        UtilsWeb.finalizar();
    }
}
