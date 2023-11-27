package org.example;
public class questao4 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++){
            System.out.println("O Fatorial de "+i+" é igual a: "+cFatorial(i));
        }
    }
    public static int cFatorial ( int num){
        int res = 1;
        for (int j = 1; j <= num; j++) {
            res = res * j;
        }
        return res;
    }
}

