# Sistema TI - Suporte ElasTech
***
## Telas e Funcionalidades

A tela inicial apresenta dois links: um para entrar como 
usuário e outro como técnico. Ambos os links levam a páginas 
de login, onde o usuário insere suas credenciais fictícias 
(login e senha) e, ao clicar em "Logar", são redirecionados 
para as respectivas rotas.

***

## Tela do Usuário

Na tela do usuário, ele pode visualizar os chamados que criou 
anteriormente e criar novos chamados. Os chamados criados por 
ele exibem informações como usuário, setor, descrição, 
prioridade e data de início. Ao criar um novo chamado, 
o usuário preenche os campos necessários e envia os dados 
para simulação.

***

## Tela Técnico

Na tela do técnico, é possível visualizar os chamados disponíveis 
para atendimento, bem como aqueles que já foram atribuídos a ele. 
Ao selecionar um chamado, o técnico pode visualizar detalhes e 
modificar o seu status para "Aguardando técnico", "Em atendimento", 
"Escalado para outro setor" ou "Finalizado".

***

# Arquitetura e Tecnologias Utilizadas

***

## Sistema - arquitetura MVC (Model-View-Controller)

* Model: Representa os dados do sistema e as regras de negócio. 
Utilizamos entidades JavaSpring para modelar os chamados técnicos, 
usuários e outras informações relevantes.

* Views: Responsável pela apresentação dos dados ao usuário. Utilizamos 
páginas HTML e templates Thymeleaf para criar as interfaces do sistema.

* Controller: Controla o fluxo de interação entre o usuário, as views e o model. 
Utilizamos controladores JavaSpring para definir as rotas e o comportamento do sistema.

***

## Principais tecnologias utilizadas

* JavaSpring: Framework Java para desenvolvimento web.

* Thymeleaf: Motor de template para renderização de páginas HTML em aplicações web Java.

* HTML/CSS: Linguagens de marcação e estilo para criação das interfaces do usuário.

* Banco de Dados (simulado): Embora não esteja conectado a um banco de dados real, 
o sistema simula o armazenamento e recuperação de dados para fins de demonstração e teste.

***

## Equipe:

- [Bianca Barreto](https://github.com/BiancalBarreto)
- [Elis Rodrigues](https://github.com/ElisIrons)
- [Érica Viera](https://github.com/ericajv)
- [Emanuelle Cruz](https://github.com/manuscruz)
- [Ingrid](https://github.com/iingrud)
- [Rayla Silva](https://github.com/raylasilva)
- [Rosana Oliveira](https://github.com/SanaOliver)
