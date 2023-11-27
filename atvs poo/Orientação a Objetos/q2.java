
public class Conta {
    private String nomeDoTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataDeAbertura;

    public Conta(String nomeDoTitular, int numero, String agencia, double saldo, String dataDeAbertura) {
        this.nomeDoTitular = nomeDoTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public double calculaRendimento() {
        double rendimento = saldo * 0.1;
        saldo += rendimento;
        return rendimento;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
}

public class TestaConta {
    public static void main(String[] args) {

        Conta minhaConta = new Conta("iago", 123321, "001", 1000.0, "02/04/2024");

        System.out.println("Informações iniciais da conta:");
        System.out.println("Titular: " + minhaConta.getNomeDoTitular());
        System.out.println("Número: " + minhaConta.getNumero());
        System.out.println("Agência: " + minhaConta.getAgencia());
        System.out.println("Saldo: R$ " + minhaConta.getSaldo());
        System.out.println("Data de Abertura: " + minhaConta.getDataDeAbertura());

        minhaConta.depositar(500.0);
        minhaConta.sacar(200.0);
        double rendimento = minhaConta.calculaRendimento();

        System.out.println("\nInformações após as operações:");
        System.out.println("Saldo após operações: R$ " + minhaConta.getSaldo());
        System.out.println("Rendimento mensal: R$ " + rendimento);
    }
}
