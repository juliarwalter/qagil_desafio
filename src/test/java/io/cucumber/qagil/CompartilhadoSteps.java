package io.cucumber.qagil;

import io.cucumber.java.pt.*;
import io.cucumber.qagil.services.Configuracao;


public class CompartilhadoSteps {

    @Dado("que eu estou no site da Accenture")
    public void acessoSiteAccenture() {
        Configuracao.abrir("https://www.accenture.com/br-pt");
    }

    
}