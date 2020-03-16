@run
Feature: Um simples CRUD



  Scenario: Um usuário está na página Agapito Software Testing
    Given Dado usuário que está na home page
    And Clicar no menu "processos"
    And Clicar no botão novo processo
    And Preencher o campo "processo_vara" com o valor "5"
    And Preencher o campo "processo_numero_processo" com o valor "69696"
    And Preencher o campo "processo_natureza" com o valor "Dayane"
    And Preencher o campo "processo_data_entrada" com o valor "15/03/2020"
    And Preencher o campo "processo_assistente_social" com o valor "Moreira"
    And Preencher o campo "processo_data_agendamento" com o valor "Dayane Moreira"
    And Preencher o campo "processo_partes" com o valor "Dayane x Moreira"
    And Preencher o campo "processo_status" com o valor "Day"
    And Selecionar o valor "Sim" no campo urgencia
    And Clicar em "Sim" no campo
    And Preencher o campo "processo_observacao" com o valor "DKPM"
    When Clicar no botao "btn-save" para salvar
    Then Deverá ser apresentada a mensagem "Processo foi criado com sucesso."

  Scenario: Usuário deseja ver detalhes do processo
    Given Dado usuário que está na home page
    And Clicar no menu "processos"
    When clicar no botão mostrar lista com id "6"
    Then Usuario deve ver os detalhes do processo

  Scenario: Usuário deseja atualizar um item
    Given Dado usuário que está na home page
    And Clicar no menu "processos"
    And Clicar no botão Editar item com id "461"
    And Preencher o campo "processo_vara" com o valor "50"
    And Preencher o campo "processo_numero_processo" com o valor "5050"
    And Preencher o campo "processo_natureza" com o valor "Guardar"
    When Clicar no botao "btn-save" para salvar
    Then Deverá ser apresentada a mensagem "Processo atualizado com sucesso."

  Scenario: Usuário deseja excluir um item
    Given Dado usuário que está na home page
    And Clicar no menu "processos"
    When Clicar no botao Apagar do item com o ID "594"
    Then O item com o ID "594" não devera existir