package io.cucumber.qagil.services;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Configuracao {
    
    public static WebDriver browser;
    
    public static void abrir(String url){
        if(browser == null){

            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            browser = new EdgeDriver();

            //System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            //browser = new ChromeDriver();

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
    
    public static WebElement seletorQueryXpath(String seletor) {
        return  Configuracao.browser.findElement(By.xpath(seletor));
    }

    public static WebElement seletorClassName(String seletor) {
        return Configuracao.browser.findElement(By.className(seletor));
    }
    
}    
 