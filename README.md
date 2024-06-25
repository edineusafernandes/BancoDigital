## Sistema Bancário 

Este é um projeto simples de simulação de um sistema bancário, desenvolvido em Java, que utiliza conceitos de herança e interfaces para representar contas correntes e contas poupança. Esta atividade é parte das atividades desenvolvidas no Curso de Java Básico ofererecido pela DIO.

# Funcionalidades Implementadas
Conta: Classe abstrata que define o comportamento básico de uma conta bancária.

# Métodos implementados: 
depositar(double valor), sacar(double valor), transferir(double valor, Conta contaDestino), imprimirInfoConta().
ContaCorrente: Subclasse de Conta que implementa uma conta corrente.

Sobrescreve o método imprimirInfoConta() para exibir o extrato da conta corrente.
ContaPoupanca: Subclasse de Conta que implementa uma conta poupança.

Sobrescreve o método imprimirInfoConta() para exibir o extrato da conta poupança.

# IConta: 
Interface que define os métodos que uma conta deve implementar.

Métodos definidos: depositar(double valor), sacar(double valor), transferir(double valor, Conta contaDestino), imprimirInfoConta().
TestApp: Classe de teste que demonstra o uso das classes ContaCorrente e ContaPoupanca.

Cria uma conta corrente e uma conta poupança.
Realiza operações de depósito, saque e transferência entre contas.
Exibe informações detalhadas das contas após as operações.
