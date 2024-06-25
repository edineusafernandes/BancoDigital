package BancoDigital;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirInfoConta() {
        System.out.println("#### Extrato Conta Poupança ####");
        super.imprimirInfoConta();
    }

    public void transferir(double valor, Conta contaDestino) {
        super.transferir(valor, contaDestino);
    }

}
