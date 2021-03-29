package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.services.Configuracao;

public class CasoDeTeste2Steps {

    @Dado("clico no menu servicos")
    public void clico_no_menu_servicos() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='navigation-menu']/div[2]/div[1]/span").click();
    }


    @Entao("devo ver os servicos abaixo")
    public void devo_ver_os_servicos_abaixo(List<String> itensDeServico){

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
    public void clico_no_item_do_menu_cloud() throws InterruptedException{
        Thread.sleep(2000);
        Configuracao.seletorQueryXpath("//*[@id='primaryLink2_Servios']/div/div/ul/li[7]/a").click();
    }

    @Entao("devo encontrar o titulo {string}")
    public void devo_encontrar_o_titulo(String string) {
        Configuracao.seletorQueryXpath("//*[@id='full-width-text-container']/div/article/div/h1");
        String titulo = Configuracao.seletorQueryXpath("//*[@id='full-width-text-container']/div/article/div/h1").getText();
        assertEquals(titulo, "Serviços de Cloud");
        Configuracao.fechar();
    }

}