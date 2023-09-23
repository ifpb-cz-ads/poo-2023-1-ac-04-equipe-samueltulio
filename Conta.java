//Carvalho & Teixeira atividade prática 1

class Conta {
    private String titular;
    private int numero;
    private float saldo;

    public Conta(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean sacar(float valor) {
        if(saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposito(float valor) {
        if(valor >= 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }
} 