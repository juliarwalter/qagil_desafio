package io.cucumber.qagil;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.qagil.services.Configuracao;

public class CasoDeTeste3Steps {

    @Dado("fecho o popup")
    public void fechoPopup()throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='onetrust-close-btn-container']/button").click();

    }

    @Dado("clico no menu carreiras")
    public void clicoCarreiras() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='navigation-menu']/div[4]/div[1]/span").click();
    }

    @Dado("clico no item do menu vagas em tecnologia")
    public void menuVagasTecnologia() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='primaryLink4_Carreiras']/div/div/ul/li[3]/ul/li[6]/a").click();
   
    }

    @Entao("devo ver o destaque em {string}")
    public void verDestaqueEm(String string) {
        Configuracao.seletorQueryCss(".area-of-interest-title ");
        String frase = Configuracao.seletorQueryCss(".area-of-interest-title ").getText();
        assertEquals(frase, "Carreiras em tecnologia");
        Configuracao.fechar();
    }

    @Dado("clico no menu de busca")
    public void clicoBusca() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='header-topnav']/div/div[2]/div[1]/a").click();
   
    }

    @Dado("digito no campo de busca {string}")
    public void digitoBusca(String string) {
        Configuracao.seletorQueryCss("#search-form-label").sendKeys(string);
    }

    @Dado("clico no botao procurar")
    public void clicoBotaoProcurar() {
        Configuracao.seletorQueryCss(".search-text").click();

    }

    @Entao("devo encontrar vagas para programadores")
    public void vagasProgramadores() {
        assertEquals(true, Configuracao.seletorQueryCssTodos(".results-for-keyword").size() > 0);
        Configuracao.fechar();
    }

}