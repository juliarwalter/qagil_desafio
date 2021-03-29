# language: pt

Funcionalidade: Acessar a lista de carreiras da accenture

  Cenario: Acessar o item de vagas de tecnologia
    Dado que eu estou no site da Accenture
    E fecho o popup
    E clico no menu carreiras
    E clico no item do menu vagas em tecnologia
    Entao devo ver o destaque em "Carreiras em tecnologia"

  Cenario: Procurando uma vaga
    Dado que eu estou no site da Accenture
    E clico no menu de busca
    E digito no campo de busca "desenvolvedor"
    E clico no botao procurar
    Entao devo encontrar vagas para programadores