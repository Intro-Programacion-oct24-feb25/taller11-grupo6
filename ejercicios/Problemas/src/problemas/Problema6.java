/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {
  
    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double media = calcularMedia(informacion);
        double desviacionEstandar = calcularDesviacion(informacion, media);

        System.out.printf("La media aritmética es: %.2f\n", media);
        System.out.printf("La desviación estándar es: %.2f\n", 
                desviacionEstandar);
    }

    public static double calcularMedia(int[] arreglo) {
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }

        return (double) suma / arreglo.length;
    }

    public static double calcularDesviacion(int[] arreglo, double media) {
        double sumaCuadrados = 0;

        for (int i = 0; i < arreglo.length; i++) {
            sumaCuadrados = sumaCuadrados + Math.pow(arreglo[i] - media, 2);
        }

        double varianza = sumaCuadrados / arreglo.length;
        return Math.sqrt(varianza);
    }
}



