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
public class Ejercicio003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] numeros = new String[100];
        String rpta;
        int min, max;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = String.valueOf((int) (Math.random() * 500));
        }
        System.out.println("Quieres destacar el max y el min? s/n");
        rpta = sc.nextLine();

        min = max = Integer.valueOf(numeros[0]);

        if (rpta.equals("s")) {
            for (int i = 0; i < numeros.length; i++) {
                if (min > Integer.valueOf(numeros[i])) {
                    min = Integer.valueOf(numeros[i]);
                }
                if (max > Integer.valueOf(numeros[i])) {
                    max = Integer.valueOf(numeros[i]);
                }
            }
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i].equals(String.valueOf(max))) {
                    numeros[i] = "*" + max + "*";
                }else if (numeros[i].equals(String.valueOf(min))) {
                    numeros[i] = "*" + min + "*";
                }
            }
        }
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
        }

    }
}
