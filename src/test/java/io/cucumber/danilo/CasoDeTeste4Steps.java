package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.services.Configuracao;


public class CasoDeTeste4Steps {

    @Dado("clico no menu sobre a Accenture")
    public void clico_no_menu_sobre_a_Accenture() throws InterruptedException {
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='navigation-menu']/div[5]/div[1]/span").click(); 
    }

    @Dado("clico no item do menu sobre a Accenture")
    public void clico_no_item_do_menu_sobre_a_Accenture() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='primaryLink5_SobreaAccenture']/div/div/ul/li[1]/ul/li[1]/a").click();
        
    }

    @Entao("devo ver a frase {string}")
    public void devo_ver_a_frase(String string) {
        Configuracao.seletorQueryCss(".sectionTitle");
        String frase = Configuracao.seletorQueryCss(".sectionTitle").getText();
        assertEquals(frase, "Nosso propósito:");
        Configuracao.fechar();
    }

}
