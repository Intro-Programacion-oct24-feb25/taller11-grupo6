/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);


        double nota1;
        double nota2;
        double nota3;
        double nota4;

        System.out.println("Ingrese el valor de la nota 1:");
        nota1 = entrada.nextDouble();

        System.out.println("Ingrese el valor de la nota 2:");
        nota2 = entrada.nextDouble();

        System.out.println("Ingrese el valor de la nota 3:");
        nota3 = entrada.nextDouble();

        System.out.println("Ingrese el valor de la nota 4:");
        nota4 = entrada.nextDouble();

        
        String promedioCualitativo = funcionPromedio(nota1, nota2, nota3, nota4);
        
        String mensajeEnMayusculas = funcionMayusculas(promedioCualitativo);

        
        System.out.printf("El promedio de las notas %.2f; %.2f; %.2f; %.2f es: "
                + "%s\n", 
                nota1, nota2, nota3, nota4, mensajeEnMayusculas);
    }

    public static String funcionPromedio(double nota1, double nota2, 
            double nota3, double nota4) {
        String cadena = "";
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        if (promedio >= 0 && promedio <= 5) {
            cadena = "regular";
        } else if (promedio > 5 && promedio <= 8) {
            cadena = "bueno";
        } else if (promedio > 8 && promedio <= 9) {
            cadena = "muy bueno";
        } else if (promedio > 9 && promedio <= 10) {
            cadena = "sobresaliente";
        }
        return cadena;
    }

    public static String funcionMayusculas(String mensaje) {
        return mensaje.toUpperCase();
    }
}
