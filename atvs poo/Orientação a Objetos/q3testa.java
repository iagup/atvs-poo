public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta("iago", 123321, "001", 1000.0, "02/04/2024");

        System.out.println(minhaConta.recuperaDadosParaImpressao());
        minhaConta.depositar(500.0);
        minhaConta.sacar(200.0);
        double rendimento = minhaConta.calculaRendimento();

        System.out.println("\nInformações após as operações:");
        System.out.println(minhaConta.recuperaDadosParaImpressao());
        System.out.println("Rendimento mensal: R$ " + rendimento);
    }
}
