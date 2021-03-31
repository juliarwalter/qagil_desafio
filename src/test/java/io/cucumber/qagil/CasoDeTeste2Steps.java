package io.cucumber.qagil;

import static org.junit.Assert.assertEquals;
import java.util.Iterator;
import java.util.*;

import io.cucumber.java.pt.*;
import io.cucumber.qagil.services.Configuracao;

public class CasoDeTeste2Steps {

    @Dado("clico no menu servicos")
    public void clicoServicos() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='navigation-menu']/div[2]/div[1]/span").click();
    }


    @Entao("devo ver os servicos abaixo")
    public void servicosAbaixo(List<String> itensDeServico){

        Iterator<String> it = itensDeServico.iterator();
        String word, item;
        int j = 1;

        while(it.hasNext()){

           word = it.next();
           item = Configuracao.seletorQueryXpath("//*[@id='primaryLink2_Servios']/div/div/ul/li["+j+"]/a").getText();
           if(word.equals(item)) System.out.println(word + " e no SITE >> " + item); j++;
        }

    }

    @Dado("clico no item do menu cloud")
    public void menuCloud() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='primaryLink2_Servios']/div/div/ul/li[7]/a").click();
    }

    @Entao("devo encontrar o titulo {string}")
    public void encontrarTitulo(String string) {
        
        String titulo = Configuracao.seletorQueryXpath("//*[@id='full-width-text-container']/div/article/div/h1").getText();
        assertEquals(titulo, string);
        Configuracao.fechar();
    }

}