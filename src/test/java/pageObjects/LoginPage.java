package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public DadosLoginPage clickEntrar() {
        navegador.findElement(By.className("header__infoRight-title")).click();

        return new DadosLoginPage (navegador);


    }

}

