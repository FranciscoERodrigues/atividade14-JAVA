package atividade14;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3]; // <<< AQUI ESTAVA FALTANDO

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int[] linha : matriz) {
            for (int num : linha) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
