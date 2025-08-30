Banco Interativo - Projeto Java

-Descrição

Este projeto é uma simulação de um sistema bancário simples utilizando Programação Orientada a Objetos (POO) em Java.
O sistema permite a criação de contas, depósitos, saques, transferências entre contas e consulta de saldo, de forma interativa via console.

-O projeto contempla dois tipos de contas:

Conta Corrente
Conta Poupança

-Funcionalidades

Depositar valores em uma conta
Sacar valores de uma conta
Transferir valores entre contas do banco
Consultar saldo das contas
Menu interativo para o usuário realizar operações

-Estrutura do Projeto

Conta.java: classe abstrata que define atributos e métodos comuns a todas as contas
ContaCorrente.java: classe que herda de Conta, representando uma conta corrente
ContaPoupanca.java: classe que herda de Conta, representando uma conta poupança
Banco.java: classe principal com menu interativo para o usuário realizar operações
