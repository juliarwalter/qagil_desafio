package io.cucumber.qagil;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.qagil.services.Configuracao;

public class CasoDeTeste3Steps {

    @Dado("fecho o popup")
    public void fecho_o_popup()throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='onetrust-close-btn-container']/button").click();

    }

    @Dado("clico no menu carreiras")
    public void clico_no_menu_carreiras() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='navigation-menu']/div[4]/div[1]/span").click();
    }

    @Dado("clico no item do menu vagas em tecnologia")
    public void clico_no_item_do_menu_vagas_em_tecnologia() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='primaryLink4_Carreiras']/div/div/ul/li[3]/ul/li[6]/a").click();
   
    }

    @Entao("devo ver o destaque em {string}")
    public void devo_ver_o_destaque_em(String string) {
        Configuracao.seletorQueryCss(".area-of-interest-title ");
        String frase = Configuracao.seletorQueryCss(".area-of-interest-title ").getText();
        assertEquals(frase, "Carreiras em tecnologia");
        Configuracao.fechar();
    }

    @Dado("clico no menu de busca")
    public void clico_no_menu_de_busca() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='header-topnav']/div/div[2]/div[1]/a").click();
   
    }

    @Dado("digito no campo de busca {string}")
    public void digito_no_campo_de_busca(String string) {
        Configuracao.seletorQueryCss("#search-form-label").sendKeys(string);
    }

    @Dado("clico no botao procurar")
    public void clico_no_botao_procurar() {
        Configuracao.seletorQueryCss(".search-text").click();

    }

    @Entao("devo encontrar vagas para programadores")
    public void devo_encontrar_vagas_para_programadores() {
        assertEquals(true, Configuracao.seletorQueryCssTodos(".results-for-keyword").size() > 0);
        Configuracao.fechar();
    }

}