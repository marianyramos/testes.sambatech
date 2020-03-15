package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage { // Esta herdandp a atributo navegador definido como protected  da classe BasePage


    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public HomePage clickEntrar() {
        navegador.findElement(By.id("header-sign-in-btn")).click();

        return this;

    }
    public HomePage DigitarLogin(String email) {
        navegador.findElement(By.id("loginEmail")).sendKeys(email);

        return this;
    }
    public HomePage DigitarSenha(String senha) {
        navegador.findElement(By.id("loginPassword")).sendKeys(senha);

        return this;
    }
    public HomePage clickAcessar() {
        navegador.findElement(By.id("btn-login")).click();

        return this;
    }
   public ColecoesPage clickVerConteudos() {
        navegador.findElement(By.linkText("Conteúdo")).click();

       return new ColecoesPage(navegador); // Chama a proxima página conceito de pageObjects
}


}

