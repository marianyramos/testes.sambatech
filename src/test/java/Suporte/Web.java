package Suporte;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    public static WebDriver createChrome ()
    {
        System.setProperty ("webdriver.chrome.driver","/Users/marianyramos/Documents/drivers/chromedriver");
        WebDriver navegador = new ChromeDriver();
        //navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get ("https://tom.sambaplay.tv/");

        return navegador;

    }
}
