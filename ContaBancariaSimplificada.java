class ContaBancariaSimplificada {
    private String titular;
    private int numeroConta;
    private boolean contaEspecial;
    private double saldo;

    // Construtor
    public ContaBancariaSimplificada() {
        this.titular = "";
        this.numeroConta = 0;
        this.contaEspecial = false;
        this.saldo = 0.0;
    }

    // Método para abrir uma conta simples
    public void abreContaSimples(String titular) {
        this.titular = titular;
        this.contaEspecial = false;
    }

    // Método para abrir uma conta especial
    public void abreContaEspecial(String titular) {
        this.titular = titular;
        this.contaEspecial = true;
    }

    // Método para depositar dinheiro na conta
    public void deposita(double valor) {
        saldo += valor;
    }

    // Método para realizar um saque
    public boolean retira(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    // Método para mostrar os dados da conta, incluindo o alerta para saldo negativo em contas especiais
    public void mostraDados() {
        System.out.println("Nome do titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Tipo de conta: " + (contaEspecial ? "Especial" : "Simples"));
        System.out.println("Saldo: " + saldo);

        // Verifica se a conta é especial e o saldo é negativo
        if (contaEspecial && saldo < 0) {
            System.out.println("ALERTA: Saldo negativo em conta especial!");
        }
    }
}
