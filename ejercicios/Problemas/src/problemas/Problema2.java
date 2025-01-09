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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n; 
        String cadena;
        System.out.println("Ingrese 1 para calcular el area del cuadrado,"
                + "2 para calcular el area del triangulo, 3 para calcular el"
                + "area del rectangulo: ");
        n = entrada.nextInt();
        if (n==1){
            areaCuadrado();
        }else{
            if (n==2){
                areaTriangulo();
            }else{
                if (n==3){
                    areaRectangulo();
                }
            }
        }
        
    }
    public static String areaCuadrado(){
        Scanner entrada = new Scanner(System.in);
        int lado;
        int operacion;
        String mensaje = "";
        
        System.out.println("Ingrese el valor del lado");
        lado = entrada.nextInt();
        operacion = lado * lado;
        System.out.printf("El area del cuadradrado es %s\n", operacion);
        return mensaje;  
    }
     public static String areaTriangulo(){
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int operacion;
        String mensaje = "";
        
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextInt();
        operacion = (base * altura)/2;
        System.out.printf("El area del triangulo es %s\n", operacion);
        return mensaje; 
    }
     public static String areaRectangulo(){
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double operacion;
        String mensaje = "";
        
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextInt();
        operacion = base * altura;
        System.out.printf("El area del rectangulo es %s\n", operacion);
        return mensaje;  
    }
}
