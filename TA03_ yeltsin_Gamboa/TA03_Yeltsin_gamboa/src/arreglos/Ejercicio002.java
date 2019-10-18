/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Yeltsin-Pc
 */
public class Ejercicio002 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero del indice " + i);
            numeros[i] = sc.nextInt();
        }
        System.out.println("Arreglo inicial");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice " + i + ":" + numeros[i]);
        }
        for (int i = 0; i < numeros.length; i++) {

            boolean comPrimo = primo(i);
            if (comPrimo) {
                int aux = numeros[i];
                for (int j = 0; j < i; j++) {
                    numeros[j] = numeros[j + 1];
                }
                numeros[0] = aux;
            }
        }
        System.out.println("Arreglo final");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice " + i + ":" + numeros[i]);
        }

    }

    private static boolean primo(int num) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != num)) {
            if (num % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }
}
