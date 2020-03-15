package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ColecoesPage extends BasePage{
    public ColecoesPage(WebDriver navegador) {
        super(navegador);
    }

    public CheckoutPage clickTesteGratis(){

        navegador.findElement(By.id("cta_subscription_trial")).click();
        return new CheckoutPage(navegador);   // Chama a proxima página conceito de pageObjects

    }
}
