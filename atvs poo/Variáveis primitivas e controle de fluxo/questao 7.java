import java.util.Scanner;
public class questao7 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        System.out.println("Sequência para x = " + x + ":");
        System.out.print(x + " -> ");
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            System.out.print(x + " -> ");
        }
    }
}
