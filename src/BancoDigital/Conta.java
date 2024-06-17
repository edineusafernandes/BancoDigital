package BancoDigital;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAc = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public conta () {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAc++;
    }

    @Override
    public void depositar(double valor) {
    }

    @Override
    public void sacar(double valor) {
    }

    @Override
    public void trabsferir(double valor, Conta contaDestino) {
    }

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
