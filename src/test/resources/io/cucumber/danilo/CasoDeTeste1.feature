# language: pt

Funcionalidade: Acessar o site da accenture e aceitar os cookies do LGPD

Cenario: Aceitar o cookie LGPD
    Dado que eu estou no site da Accenture
    E clico em configuracoes de cookie
    E aceito os termos LGPD
    Entao devo fechar a caixa de informacao

Cenario: Configuracoes do cookie
    Dado que eu estou no site da Accenture
    E clico em configuracoes de cookie
    Entao devo ver o item de "sua privacidade"
    E devo ver "Cookies estritamente necessarias"
    E devo ver "Cookies Analiticos de Primeira Parte"
    E devo ver "Cookies de Desempenho e Cookies Funcionais"
    E devo ver "Cookies de Publicidade e Redes Sociais"
    E aceito os termos LGPD

