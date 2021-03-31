[![GitHub issues](https://img.shields.io/github/issues/juliarwalter/qagil_desafio)](https://github.com/juliarwalter/qagil_desafio/issues)
[![GitHub license](https://img.shields.io/github/license/juliarwalter/qagil_desafio)](https://github.com/juliarwalter/qagil_desafio/blob/main/LICENSE)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/2ef72d6f457b4617ada9ce745667d7f4)](https://www.codacy.com/gh/juliarwalter/qagil_desafio/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=juliarwalter/qagil_desafio&amp;utm_campaign=Badge_Grade)
![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)

# Desafio da Gama Academy e Accenture 4.0 - QA: grupo QAagil :dart:

<b>Integrantes:</b></br>
	<ul>
		<li>Annelise Lins</li>
		<li>Elizandra Rocha</li> 
		<li>Gisela Keidel</li> 
		<li>Júlia R. Walter</li>
		<li>Lauany Reis</li> 
		<li>Sarah Ramos</li>
	</ul> 
<br>

<b>Objetivo:</b> Implementar os conteúdos abordados sobre testes com API, Devops, metodologias ágeis, 
gestão de tempo;
<br>
<br>

## <b>[Veja aqui as etapas de elaboração](https://www.powtoon.com/online-presentation/bGwqGNZsY2T/?utm_medium=SocialShare&utm_campaign=studio-share%2Bshare%2Bby%2Bowner&utm_source=studio-share-button&utm_content=bGwqGNZsY2T&utm_po=33523108&mode=movie)</b>
 <br>
 <br>

# O desafio: uma aplicação de testes com Selenium e Cucumber :memo:
Validação no site da Accenture utilizando Cucumber, Selenium WebDriver em Java.

- [x] <b>Caso de teste 1</b>
	>*Acessar o site da accenture e aceitar os cookies do LGPD.<br>*
	<br>
	<b>Cenário:</b> Aceitar o cookie LGPD <br>
	dado que eu estou no site da accenture <br>
	e aceito os termos LGPD <br>
	Então deve fechar a caixa de informação <br>
	<br>
	<b>Cenário:</b> Configurações do cookie <br>
	dado que eu estou no site da accenture <br>
	e aceito os termos LGPD <br>
	e clico em configurações de cookie <br>
	Então devo ver o item de "sua privacidade" <br>
	E devo ver "Cookies estritamente necessárias" <br>
	e devo ver "Cookies Analíticos de Primeira Parte" <br>
	e devo ver "Cookies de Desempenho e Cookies Funcionais" <br>
	e devo ver "Cookies de Publicidade e Redes Sociais" <br>
	<br> <br>

- [x] <b>Caso de teste 2</b>
	>*Acessar o site da accenture a mostrar a lista de serviços.<br>*
	<br>
	<b>Cenário:</b> listar serviços da Accenture <br>
	dado que eu estou no site da accenture <br>
	e clico no menu serviços <br>
	Então devo ver os serviços abaixo <br>
	-	| Accenture Strategy | <br>
	-	| Application Services | <br>
	-	| Artificial Intelligence | <br>
	-	| Automation | <br>
	-	| Business Process Services | <br>
	-	| Change Management | <br>
	-	| Cloud | <br>
	-	| Customer Experience | <br>
	-	| Data & Analytics | <br>
	-	| Ecosystem Partners | <br>
	-	| Finance Consulting | <br>
	-	| Industry X | <br>
	-	| Infrastructure | <br>
	-	| Marketing | <br>
	-	| Mergers & Acquisitions (M&A) | <br>
	-	| Operating Models | <br>
	-	| Security | <br>
	-	| Supply Chain Management | <br>
	-	| Sustainability | <br>
	-	| Technology Consulting | <br>
	-	| Technology Innovation | <br>
	-	| Zero Based Budgeting (ZBB) | <br>	
 <br>
	<b>Cenário:</b> Clicar no serviço cloud <br>
	dado que eu estou no site da accenture <br>
	e clico no menu serviços <br>
	e clico no item do menu cloud <br>
	Então devo encontrar o título "Serviços de Cloud"<br>
	<br> <br>
  
- [x] <b> Caso de teste 3</b>
	>*Acessar a lista de carreiras da accenture.<br>*
	<br>
	<b>Cenário:</b> Acessar o item de vagas de tecnologia <br>
	dado que eu estou no site da accenture <br>
	e clico no menu carreiras <br>
	e clico no item do menu vagas em tecnologia <br>
	Então devo ver o destaque em "Carreiras em Tecnologia" <br>
	<br>
	<b>Cenário:</b> Procurando uma vaga <br>
	dado que eu estou no site da accenture <br>
	e digito no campo de busca "desenvolvedor" <br>
	e clico no botão procurar <br>
	Então devo encontrar vagas para programadores <br>
	 <br> <br>

- [x] <b>Caso de teste 4</b>
	>*Sobre a accenture.<br>*
	<br>
	<b>Cenário:</b> Ver as características da accenture <br>
	dado que eu estou no site da accenture <br>
	e clico no menu sobre a accenture <br>
	e clico no item do menu sobre a accenture <br>
	Então devo ver o destaque em "Nosso propósito" <br>
	<br>
  
## Tecnologias utilizadas :computer:

:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação <br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar :bookmark_tabs:
### Pré requisitos
- Instalar o [java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
- Instalar o [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- Verificar se o JAVA_HOME está configurado em seu computador.

- Clone do projeto
	 ```bash
	git clone https://github.com/juliarwalter/qagil_desafio.git
	 ```

- Entrando na pasta do projeto
	 ```bash
	cd qagil_desafio
	 ```

- Configurando selenium em seu computador
	Fazer o download do [Chrome Webdriver](https://chromedriver.chromium.org/downloads) e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
<br>

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
    |  |  |  |  |  |-- CasoDeTeste1Steps.java -- Passos escritos em java com selenium: Caso de teste 1 <br> 
    |  |  |  |  |  |-- CasoDeTeste2Steps.java -- Passos escritos em java com selenium: Caso de teste 2 <br> 
    |  |  |  |  |  |-- CasoDeTeste3Steps.java -- Passos escritos em java com selenium: Caso de teste 3 <br> 
    |  |  |  |  |  |-- CasoDeTeste4Steps.java -- Passos escritos em java com selenium: Caso de teste 4 <br> 
    |  |  |  |  |  |-- CompartilhadoSteps.java -- Passos escritos em java com selenium: Caso compartilhado <br> 
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test 
    |  |-- resources<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- qagil<br>
    |  |  |  |  |  |-- CasoDeTeste1.feature -- Gherkin com os cenários: Caso de teste 1 <br>
    |  |  |  |  |  |-- CasoDeTeste2.feature -- Gherkin com os cenários: Caso de teste 2 <br>
    |  |  |  |  |  |-- CasoDeTeste3.feature -- Gherkin com os cenários: Caso de teste 3 <br>  
    |  |  |  |  |  |-- CasoDeTeste4.feature -- Gherkin com os cenários: Caso de teste 4 <br>
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>

---------------------------------------------------------------------
<br>
<br>
Para maiores detalhes sobre o processo de desenvolvimento assista o nosso vídeo na íntegra: https://www.youtube.com/watch?v=bwzEK0Alh7E
