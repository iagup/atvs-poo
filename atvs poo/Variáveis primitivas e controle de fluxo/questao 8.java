public class questao8 {
    public static void main(String[] args) {
        int t = 5;
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}