package pageObjects;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver navegador; // Tornando o a atributo acessível a todas as classe e subclasses do mesmo package


    public BasePage (WebDriver navegador) {

        this.navegador = navegador;
    }
}
