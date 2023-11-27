package org.example;
public class questao3 {
    public static void main(String[] args) {
        int t = 3, i;
        for (i = 1; i < 40; i++) {
            int x = t * i;
            if (x <= 100) {
                System.out.println(x);
            } else {
                break;
            }
        }
    }
}
