package BancoDigital;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInfoConta() {
        System.out.println("#### Extrato Conta Poupança ####");
        super.imprimirInfoConta();
    }

    public void transferir(double valor, Conta contaDestino) {
        super.transferir(valor, contaDestino);
    }

}
