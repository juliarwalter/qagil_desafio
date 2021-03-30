![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)


# Desafio da Gama Academy e Accenture 4.0 - QA: grupo QAagil :dart:

Integrantes: Anne Lins, Elizandra Rocha, Gisela Keidel, Júlia R. Walter, Lauany Reis e Sarah Ramos;

Objetivo: Implementar os conteúdos abordados sobre testes com API, Devops, metodologias ágeis, 
gestão de tempo;

Tecnologias utilizadas: Cucumber + Selenium, Java, Jira.

# O desafio: uma aplicação de testes com Selenium e Cucumber :memo:
Validação no site da Accenture utilizando Cucumber, Selenium WebDriver em Java.

- [x] Caso de teste 1
 >*Acessar o site da accenture e aceitar os cookies do LGPD.<br>*
 <br>
**Cenário**: Aceitar o cookie LGPD <br>
  dado que eu estou no site da accenture <br>
  e aceito os termos LGPD <br>
  Então deve fechar a caixa de informação <br>
 <br>
**Cenário**: Configurações do cookie <br>
  dado que eu estou no site da accenture <br>
  e aceito os termos LGPD <br>
  e clico em configurações de cookie <br>
  Então devo ver o item de "sua privacidade" <br>
  E devo ver "Cookies estritamente necessárias" <br>
  e devo ver "Cookies Analíticos de Primeira Parte" <br>
  e devo ver "Cookies de Desempenho e Cookies Funcionais" <br>
  e devo ver "Cookies de Publicidade e Redes Sociais" <br>
 <br> <br>


- [x] Caso de teste 2
 >*Acessar o site da accenture a mostrar a lista de serviços.<br>*
 <br>
**Cenário**: listar serviços da Accenture <br>
  dado que eu estou no site da accenture <br>
  e clico no menu serviços <br>
  Então devo ver os serviços abaixo <br>
  - [x] 	| Accenture Strategy | <br>
  - [x]  | Application Services | <br>
  - [x]  | Artificial Intelligence | <br>
  - [x]  | Automation | <br>
  - [x]  | Business Process Services | <br>
  - [x]  | Change Management | <br>
  - [x]  | Cloud | <br>
  - [x]  | Customer Experience | <br>
  - [x]  | Data & Analytics | <br>
  - [x]  | Ecosystem Partners | <br>
  - [x]  | Finance Consulting | <br>
  - [x]  | Industry X | <br>
  - [x]  | Infrastructure | <br>
  - [x]  | Marketing | <br>
  - [x]  | Mergers & Acquisitions (M&A) | <br>
  - [x]  | Operating Models | <br>
  - [x]  | Security | <br>
  - [x]  | Supply Chain Management | <br>
  - [x]  | Sustainability | <br>
  - [x]  | Technology Consulting | <br>
  - [x]  | Technology Innovation | <br>
  - [x] | Zero Based Budgeting (ZBB) | <br>
 <br>
**Cenário**: Clicar no serviço cloud <br>
  dado que eu estou no site da accenture <br>
  e clico no menu serviços <br>
  e clico no item do menu cloud <br>
  Então devo encontrar o título "Serviços de Cloud"<br>
   <br> <br>
  
- [x] Caso de teste 3
 >*Acessar a lista de carreiras da accenture.<br>*
 <br>
**Cenário**: Acessar o item de vagas de tecnologia <br>
  dado que eu estou no site da accenture <br>
  e clico no menu carreiras <br>
  e clico no item do menu vagas em tecnologia <br>
  Então devo ver o destaque em "Carreiras em Tecnologia" <br>
 <br>
**Cenário**: Procurando uma vaga <br>
  dado que eu estou no site da accenture <br>
  e digito no campo de busca "desenvolvedor" <br>
  e clico no botão procurar <br>
  Então devo encontrar vagas para programadores <br>


- [x] Caso de teste 4
 >*Sobre a accenture.<br>*
 <br>
 **Cenário**: Ver as características da accenture <br>
  dado que eu estou no site da accenture <br>
  e clico no menu sobre a accenture <br>
  e clico no item do menu sobre a accenture <br>
  Então devo ver o destaque em "Nosso propósito" <br>
  <br>
  
--------------------------------------------------------------------

## Tecnologias utilizadas :computer:
=======
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar :bookmark_tabs:
### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador



- Clone do projeto
 ```bash
git clone https://github.com/juliarwalter/qagil_desafio.git
 ```

- Entrando na pasta do projeto
 ```bash
cd qagil_desafio
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na rapiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

--------------------------------------------------------------------
## Estrutura de arquivos :open_file_folder:
<pre>
  driver <br>
      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina<br>
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- qagil<br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test <br> 
    |  |  |  |  |  |-- ValidarCpfStep.java -- Passos escritos em java com selenium abrindo o browser e testando a aplicação<br>
    |  |-- resources<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- qagil<br>
    |  |  |  |  |  |-- validadorCpf.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>

