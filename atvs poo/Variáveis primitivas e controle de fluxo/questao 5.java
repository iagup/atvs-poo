package org.example;
public class questao5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            System.out.println("Fatorial de " + i + " (int): " + calcularFatorialInt(i));
            System.out.println("Fatorial de " + i + " (long): " + calcularFatorialLong(i));
        }
    }
    public static int calcularFatorialInt(int num) {
        int res = 1;
        for (int j = 1; j <= num; j++) {
            res *= j;
        }
        return res;
    }
    public static long calcularFatorialLong(int num) {
        long res = 1;
        for (int j = 1; j <= num; j++) {
            res *= j;
        }
        return res;
    }
}