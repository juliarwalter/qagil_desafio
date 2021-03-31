package io.cucumber.qagil;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.qagil.services.Configuracao;


public class CasoDeTeste4Steps {

    @Dado("clico no menu sobre a Accenture")
    public void clicoMenuAccenture() throws InterruptedException {
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='navigation-menu']/div[5]/div[1]/span").click(); 
    }

    @Dado("clico no item do menu sobre a Accenture")
    public void clicoMenuSobreAccenture() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='primaryLink5_SobreaAccenture']/div/div/ul/li[1]/ul/li[1]/a").click();
        
    }

    @Entao("devo ver a frase {string}")
    public void devoVerAFrase(String string) {
        Configuracao.seletorQueryCss(".sectionTitle");
        String frase = Configuracao.seletorQueryCss(".sectionTitle").getText();
        assertEquals(frase, "Nosso propósito:");
        Configuracao.fechar();
    }

}
