package io.cucumber.qagil;

import io.cucumber.java.pt.*;
import io.cucumber.qagil.services.Configuracao;

public class CasoDeTeste1Steps {

    @Dado("clico em configuracoes de cookie")
    public void clicoCookie() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryCss("#onetrust-pc-btn-handler").click();
    }

    @Dado("aceito os termos LGPD")
    public void aceitoLGPD() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryCss(".save-preference-btn-handler").click();
    }

    @Entao("devo fechar a caixa de informacao")
    public void fecharInformacao() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='header-topnav']/div/div[2]/div[1]/a").click();
        Configuracao.fechar();
    }
    
    @Entao("devo ver {string}")
    public void devoVer(String string) {
        Configuracao.seletorQueryCss("#ot-header-id-1");

    }

    @Entao("devo ver o item de {string}")
    public void verItem(String string) {
        Configuracao.seletorQueryCss(".category-item"); 
    }
     
 
}
  