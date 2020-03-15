package testes;

import Suporte.Web;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;


@RunWith(DataDrivenTestRunner.class) // Apontando a class de teste de easyTest
@DataLoader(filePaths = "DadosDePagamento.csv") //Aponta Arquivo utilizado para entrada de dados variáveis

public class RealizarPagamentoTest {
    private WebDriver navegador;


    @Before // Anotação para execução dos métodos antes da execução de cada teste
    public void setUp(){ // Definnir o que e nessário para iniciar os teste

        navegador = Web.createChrome();
    }

    @Test // Anotação defini que os métodos abaixo sao métodos de teste
    public void adicionarPagamento
            (@Param (name="login")String email,@Param (name="password")String senha,@Param(name="documento")String cpf){
     String testeConfirmado = new HomePage(navegador)
                .clickEntrar()
                .DigitarLogin(email)
                .DigitarSenha(senha)
                .clickAcessar()
                .clickVerConteudos()
                .clickTesteGratis()
                .selecionarPagamento()
                .digitarCpf(cpf)
                .clickIniciarTeste()
                .confimacaoDoBoleto();

        Assert.assertEquals("Teste gratuito confirmado!", testeConfirmado); // Valida o inicio do teste gratuito após adicionar pagamento


    }
   @Test
   public void verificarCpfInvalido (@Param (name="login")String email,@Param (name="password")String senha,@Param(name="documento")String cpf) {
    String cpfInvalido = new HomePage(navegador)
               .clickEntrar()
               .DigitarLogin(email)
               .DigitarSenha(senha)
               .clickAcessar()
               .clickVerConteudos()
               .clickTesteGratis()
               .selecionarPagamento()
               .DigitarCpfInvalido(cpf)
               .validarCpfInvalido();

    Assert.assertEquals("Por favor digite um cpf válido", cpfInvalido); // Tratar a inserção de dados invalidos para CPF


   }

    @After // Anotação para execução dos métodos no fim  da execução de cada teste
    public void tearDown(){ // Executar o que for necessárui para finalizar o métdos de testes
      navegador.quit();



        }
}
