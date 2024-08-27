package utils;

import webdriver.Driver;

public class UtilsWeb {

    private static final String URL = "https://bugbank.netlify.app/";

    public static void inicializar(){
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
    }

    public static void finalizar(){
        if(Driver.getDriver() != null){
            Driver.getDriver().quit();
            Driver.setDriver(null);
        }
    }
}