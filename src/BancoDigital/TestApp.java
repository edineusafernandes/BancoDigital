package BancoDigital;

public class TestApp {
    public static void main(String[] args) {

        Cliente edineusa = new Cliente();
        edineusa.setNome("Edineusa");

        Conta cc = new ContaCorrente(edineusa);
        cc.depositar(1200);

        Conta poupanca = new ContaPoupanca(edineusa);
        cc.transferir(500, poupanca);

        cc.imprimirInfoConta();
        poupanca.imprimirInfoConta();

    }
}