/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
     public static void main(String[] args) {
        String[] ciudades = obtenerCiudades();

        imprimirCiudades(ciudades);
    }

    public static String[] obtenerCiudades() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de ciudades: \n");
        int numCiudades = entrada.nextInt();
        entrada.nextLine();  

        String[] ciudades = new String[numCiudades];

        for (int i = 0; i < numCiudades; i++) {
            System.out.print("Ingrese el nombre de la ciudad: \n");
            ciudades[i] = entrada.nextLine();
        }

        return ciudades;
    }

    public static void imprimirCiudades(String[] ciudades) {
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i].length() == 4 || ciudades[i].length() == 5) {
                System.out.println(ciudades[i]);
            }
        }
    }
}
