package org.example;
public class questao6 {
    public static void main(String[] args) {
        int lim = 200;
        int pri = 0, seg = 1, prox;

        System.out.println("Série de Fibonacci até passar de 100:");

        while (pri <= lim) {
            System.out.print(pri + ", ");

            prox = pri + seg;
            pri = seg;
            seg = prox;
        }
    }
}