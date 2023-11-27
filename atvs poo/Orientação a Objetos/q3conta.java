
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


    public String recuperaDadosParaImpressao() {
        StringBuilder dados = new StringBuilder();
        dados.append("Titular: ").append(nomeDoTitular).append("\n");
        dados.append("Número: ").append(numero).append("\n");
        dados.append("Agência: ").append(agencia).append("\n");
        dados.append("Saldo: R$ ").append(saldo).append("\n");
        dados.append("Data de Abertura: ").append(dataDeAbertura).append("\n");

        return dados.toString();
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

