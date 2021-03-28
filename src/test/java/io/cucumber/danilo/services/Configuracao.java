package io.cucumber.danilo.services;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Configuracao {
    
    public static WebDriver browser;
    
    public static void abrir(String url){
        if(browser == null){
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            browser = new EdgeDriver();
            browser.manage().window().maximize();
        }
      
        browser.get(url);
    }

    public static void fechar(){
        browser.close();
        browser = null;
    }

    public static WebElement seletorQueryCss(String seletor) {
        return  Configuracao.browser.findElement(By.cssSelector(seletor));
    }
    
    public static List<WebElement> seletorQueryCssTodos(String seletor) {
        return  Configuracao.browser.findElements(By.cssSelector(seletor));
    }   
    
}    
 