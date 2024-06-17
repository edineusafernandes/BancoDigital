package BancoDigital;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void trabsferir(double valor, Conta contaDestino);

}
