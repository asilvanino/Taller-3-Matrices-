/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author SIL
 */
public class Sucesiónnumeros {

    public void suseciónnumeros() {

        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();

        int matriz[][] = new int[n][n];

        System.out.println("Por favor dijite los numeros que quiere que lleve la matriz, recuerde que no debe pasarse de " + n + " * " + n);
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("La matriz queda de la suiguiente manera");
        for (int x = 0; x < matriz.length; x++) {

            for (int y = 0; y < matriz.length; y++) {

                System.out.print(matriz[x][y] + "  ");
            }

            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("La transpuesta de la matriz es:");
        
        
        for (int w = 0; w < matriz.length; w++){
            
            for (int z = 0; z < matriz.length; z++){
                
                System.out.print(matriz[z][w] + "  ");
                
            }
            
            System.out.println("");
            
        }
    }
}
