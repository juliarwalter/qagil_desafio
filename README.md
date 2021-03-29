![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)


# Desafio da Gama Academy e Accenture 4.0 - Q: grupo QAagil

Integrantes: Anne Lins, Elizandra Rocha, Gisela Keidel, Júlia R. Walter, Lauany Reis e Sarah Ramos;

Objetivo: Implementar os conteúdos abordados sobre testes com API, Devops, metodologias ágeis, 
gestão de tempo;

Tecnologias utilizadas: Cucumber + Selenium, Java, Jira.

# O desafio: uma aplicação de testes com Selenium e Cucumber
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
    	| Accenture Strategy | <br>
      | Application Services | <br>
      | Artificial Intelligence | <br>
      | Automation | <br>
      | Business Process Services | <br>
      | Change Management | <br>
      | Cloud | <br>
      | Customer Experience | <br>
      | Data & Analytics | <br>
      | Ecosystem Partners | <br>
      | Finance Consulting | <br>
      | Industry X | <br>
      | Infrastructure | <br>
      | Marketing | <br>
      | Mergers & Acquisitions (M&A) | <br>
      | Operating Models | <br>
      | Security | <br>
      | Supply Chain Management | <br>
      | Sustainability | <br>
      | Technology Consulting | <br>
      | Technology Innovation | <br>
      | Zero Based Budgeting (ZBB) | <br>
 <br>
**Cenário**: Clicar no serviço cloud <br>
  dado que eu estou no site da accenture <br>
  e clico no menu serviços <br>
  e clico no item do menu cloud <br>
  Então devo encontrar o título "Serviços de Cloud"<br>
   <br> <br>
  
- [ ] Caso de teste 3
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


- [ ] Caso de teste 4
 >*Sobre a accenture.<br>*
 <br>
 **Cenário**: Ver as características da accenture <br>
  dado que eu estou no site da accenture <br>
  e clico no menu sobre a accenture <br>
  e clico no item do menu sobre a accenture <br>
  Então devo ver o destaque em "Nosso propósito" <br>
  <br>
