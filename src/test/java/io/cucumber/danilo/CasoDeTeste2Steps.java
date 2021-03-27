package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.services.Configuracao;

public class CasoDeTeste2Steps {

    @Dado("clico no menu servicos")
    public void clico_no_menu_servicos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("devo ver os servicos abaixo")
    public void devo_ver_os_servicos_abaixo(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Dado("clico no item do menu cloud")
    public void clico_no_item_do_menu_cloud() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("devo encontrar o titulo {string}")
    public void devo_encontrar_o_titulo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}