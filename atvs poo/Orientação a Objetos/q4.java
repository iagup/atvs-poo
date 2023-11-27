public class TestaConta {
    public static void main(String[] args) {

        Conta c1 = new Conta("iago", 123, "001", 100.0, "02/01/2021");
        Conta c2 = new Conta("iago", 123, "001", 100.0, "02/01/2021");

        if (c1 == c2) {
            System.out.println("As contas são iguais.");
        } else {
            System.out.println("As contas são diferentes.");
        }
    }
}