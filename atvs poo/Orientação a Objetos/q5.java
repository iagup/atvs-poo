import org.example.Conta;

public class testaConta {
    public static void main(String[] args) {

        Conta c1 = new Conta("iago", 123, "001", 100.0, "02/01/2021");
        Conta c2 = new Conta("teste", 1, "01", 10.0, "10/10/1010");
        c2 = c1;
        if (c1 == c2) {
            System.out.println("As contas são iguais.");
        } else {
            System.out.println("As contas são diferentes.");
        }
    }
}