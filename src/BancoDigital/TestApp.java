package BancoDigital;

public class TestApp {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.depositar(1200);

        Conta poupanca = new ContaPoupanca();
        cc.transferir(1600, poupanca);

        cc.imprimirInfoConta();
        poupanca.imprimirInfoConta();

    }
}