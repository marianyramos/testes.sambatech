package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver navegador) {
        super(navegador);
    }

    public CheckoutPage selecionarPagamento() {

        navegador.findElement(By.id("menuBoleto")).click();
        return this;
    }

    public CheckoutPage digitarCpf(String cpf) {

        navegador.findElement(By.id("cpf")).sendKeys(cpf);
        return this;
    }

    public CheckoutPage clickIniciarTeste() {

        navegador.findElement(By.id("btn-finish-payment-boleto")).click();
        return this;
    }

    public String confimacaoDoBoleto() {

        WebElement textoElment = navegador.findElement(By.xpath("//div[@id='main-modal']/div/div[2]/div/h1[text()=\"Teste gratuito confirmado!\"]"));
        return textoElment.getText();
        // Verifica a mensagem ao confirmar a geração do boleto

    }

    public CheckoutPage DigitarCpfInvalido( String cpf) {

        navegador.findElement(By.id("cpf")).sendKeys(cpf);
        return this;
        //

    }

    public String validarCpfInvalido () {

        navegador.findElement(By.xpath("//form[@id='formRegister']/div/div")).click();
        WebElement textoElment = navegador.findElement(By.xpath("//form[@id='formRegister']/div/div/div[2]/div/span[text()=\"Por favor digite um cpf válido\"]"));
        return textoElment.getText();
        // Verifica e a aplicação retorna mensagem de erro para inserção de CPF inválido

    }
}

