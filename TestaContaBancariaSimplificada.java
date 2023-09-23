class TestaContaBancariaSimplificada{
    public static void main(String[]args){
        ContaBancariaSimplificada c1;
        c1 = new ContaBancariaSimplificada();
        c1.abreContaSimples("Maria");
        ContaBancariaSimplificada c2 = new ContaBancariaSimplificada();
        c2.abreContaSimples("João");
        c1.deposita(200);
        c2.saldo = 1000; //atenção!!!
        if(c1.retira(300)){
            System.out.println("Saque realizado com sucesso!");
        }
         else {
             System.out.println("Saldo insuficiente!");
         }
         c1.mostrardados();
         c2.mostradados();
    }
}
