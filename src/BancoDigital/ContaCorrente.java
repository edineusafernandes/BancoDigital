package BancoDigital;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInfoConta() {
        System.out.println("#### Extrato Conta Corrente ####");
        super.imprimirInfoConta();
    }

    public void transferir(double valor, Conta contaDestino) {
        super.transferir(valor, contaDestino);
    }
}
