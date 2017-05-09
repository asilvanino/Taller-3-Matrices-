/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author SIL
 */
public class PNPI {

    public void PNPI() {

        int matriz[][] = new int[3][3];

        matriz[0][0] = 5;
        matriz[0][1] = 10;
        matriz[0][2] = -12;
        matriz[1][0] = 9;
        matriz[1][1] = -10;
        matriz[1][2] = 6;
        matriz[2][0] = 8;
        matriz[2][1] = 11;
        matriz[2][2] = -13;

        System.out.println("La matriz es la siguiente");

        for (int w = 0; w < matriz.length; w++) {

            for (int z = 0; z < matriz.length; z++) {

                System.out.print(matriz[w][z] + "  ");

            }

            System.out.println("");
        }

        System.out.println("");

        System.out.println("los siguientes numero son positivos");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > 0) {

                    System.out.print(matriz[i][j] + ",");
                }

            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Los siguientes numero son negativos");

        for (int x = 0; x < matriz.length; x++) {

            for (int y = 0; y < matriz.length; y++) {

                if (matriz[x][y] < 0) {

                    System.out.print(matriz[x][y] + ",");

                }

            }

        }

        System.out.println("");
        System.out.println("");
        System.out.println("Los siguientes son numeros pares");

        for (int k = 0; k < matriz.length; k++) {

            for (int l = 0; l < matriz.length; l++) {

                if (matriz[k][l] % 2 == 0) {

                    System.out.print(matriz[k][l] + ",");

                }
            }

        }

        System.out.println("");
        System.out.println("");
        System.out.println("Los siguientes sosn numeros impares");

        for (int a = 0; a < matriz.length; a++) {

            for (int b = 0; b < matriz.length; b++) {

                if (matriz[a][b] % 2 == 1) {
                    System.out.print(matriz[a][b] + ",");

                }
            }

        }

        System.out.println("");

    }

}
