package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.services.Configuracao;

public class CasoDeTeste4Steps {

    @Dado("clico no menu sobre a accenture")
    public void clico_no_menu_sobre_a_accenture() {
        Configuracao.seletorQueryCss("#primaryLink5_SobreaAccenture").click();
    }

    @Dado("clico no item do menu sobre a accenture")
    public void clico_no_item_do_menu_sobre_a_accenture() {
        Configuracao.seletorQueryCss("Quem somos");
        
    }

    @Entao("entao devo ver o destaque em {string}")
    public void entao_devo_ver_o_destaque_em(String string) {
        Configuracao.seletorQueryCss(".sectionTitle");
        Configuracao.fechar();
    }

}
