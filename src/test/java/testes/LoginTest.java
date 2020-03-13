package testes;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import Suporte.Web;
import org.junit.Test;
import pageObjects.LoginPage;

public class LoginTest {
    private WebDriver navegador;
    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void Login(){
        new LoginPage(navegador)
                .clickEntrar();

    }

    @After
    public void tearDown(){
      // navegador.quit();



        }
}
