# language: pt

Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD

Cenario: Aceitar o cookie LGPD
    Dado que eu estou no site da Accenture
    E aceito os termos LGPD
    Então deve fechar a caixa de informação

Cenario: Configurações do cookie
    Dado que eu estou no site da Accenture
    E aceito os termos LGPD
    E clico em configuracoes de cookie
    Então devo ver o item de "sua privacidade"
    E devo ver "Cookies estritamente necessarias"
    E devo ver "Cookies Analiticos de Primeira Parte"
    E devo ver "Cookies de Desempenho e Cookies Funcionais"
    E devo ver "Cookies de Publicidade e Redes Sociais"