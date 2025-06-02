package atividade14;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("Maior valor: " + maior);
        
        sc.close();
}
    
    
}
