package tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import pages.LoginPage;
import utils.UtilsWeb;
import org.junit.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {

    private LoginPage loginPage = new LoginPage();

    @Test
    public void validarPesquisaComSucesso() {

        UtilsWeb.inicializar();

        loginPage.digitarUsuario("Admin@gmail.com");
        loginPage.digitarSenha("admin123");
        loginPage.clickButtonEntrar();


        Assert.assertEquals(loginPage.getTextError(), "Usuário ou senha inválido.\n" +
            "Tente novamente ou verifique suas informações!");

        loginPage.clickButtoClose();
        UtilsWeb.finalizar();
    }



}