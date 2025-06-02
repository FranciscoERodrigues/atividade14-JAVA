package atividade14;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        boolean simetrica = true;
        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        System.out.println(simetrica ? "A matriz é simétrica." : "A matriz não é simétrica.");
        
        sc.close();
    }
    
    
}
