package Suporte;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome ()
    {
        System.setProperty ("webdriver.chrome.driver","/Users/marianyramos/Documents/drivers/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Definir o tempo de timeOut para que o elementos estejam pronttos para interação
        navegador.get ("https://neon.sambaplay.tv/");



        return navegador;

    }
}
