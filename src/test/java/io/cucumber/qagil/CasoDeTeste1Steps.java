package io.cucumber.qagil;

import io.cucumber.java.pt.*;
import io.cucumber.qagil.services.Configuracao;

public class CasoDeTeste1Steps {

    @Dado("clico em configuracoes de cookie")
    public void clico_em_configuracoes_de_cookie() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryCss("#onetrust-pc-btn-handler").click();
    }

    @Dado("aceito os termos LGPD")
    public void aceito_os_termos_LGPD() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryCss(".save-preference-btn-handler").click();
    }

    @Entao("devo fechar a caixa de informacao")
    public void devo_fechar_a_caixa_de_informacao() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='header-topnav']/div/div[2]/div[1]/a").click();
        Configuracao.fechar();
    }
    
    @Entao("devo ver {string}")
    public void devo_ver(String string) {
        Configuracao.seletorQueryCss("#ot-header-id-1");

    }

    @Entao("devo ver o item de {string}")
    public void devo_ver_o_item_de(String string) {
        Configuracao.seletorQueryCss(".category-item"); 
    }
     
 
}
  