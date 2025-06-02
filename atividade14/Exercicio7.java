package atividade14;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int pares = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] % 2 == 0) pares++;
            }
        }
        System.out.println("Soma de números pares: " + pares);
        
        sc.close();

    }
}
