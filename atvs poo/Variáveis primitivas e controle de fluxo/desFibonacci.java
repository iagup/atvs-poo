public class desFibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Série de Fibonacci até: "+ n);
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int proximoTermo = a + b;
            a = b;
            b = proximoTermo;
        }
    }
}