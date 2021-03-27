package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.services.Configuracao;

public class CasoDeTeste1Steps {

    @Dado("clico em configuracoes de cookie")
    public void clico_em_configuracoes_de_cookie() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryCss("#onetrust-pc-btn-handler").click();
    }

    @Dado("aceito os termos LGPD")
    public void aceito_os_termos_LGPD() {
        Configuracao.seletorQueryCss(".save-preference-btn-handler").click();
    }

    @Entao("devo fechar a caixa de informacao")
    public void devo_fechar_a_caixa_de_informacao() {
        Configuracao.seletorQueryCss(".banner-close-button").click();
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
  