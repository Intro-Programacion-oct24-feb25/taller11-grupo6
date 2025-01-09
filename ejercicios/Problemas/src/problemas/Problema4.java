/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = entrada.nextLine();
        System.out.print("Ingrese la cédula del cliente: ");
        String cedulaCliente = entrada.nextLine();

        System.out.println("Elija una opción:");
        System.out.println("1. Calcular planilla de luz");
        System.out.println("2. Calcular valor del predio");
        int opcion = entrada.nextInt();

        if (opcion == 1) {
            calcularValorLuz(nombreCliente, cedulaCliente);
        } else if (opcion == 2) {
            calcularPredio(nombreCliente, cedulaCliente);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static void calcularValorLuz(String nombreCliente, String cedulaCliente) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor del kilowatio: ");
        double valorKilowatio = entrada.nextDouble();
        System.out.print("Ingrese el número de kilowatios consumidos en el mes: ");
        double numeroKilowatios = entrada.nextDouble();
        double valorTotal = valorKilowatio * numeroKilowatios;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de"
                + " $%.2f\n", nombreCliente, cedulaCliente, valorTotal);
    }

    public static void calcularPredio(String nombreCliente, String cedulaCliente) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del inmueble: ");
        double valorInmueble = sc.nextDouble();
        double valorPredio = valorInmueble * 0.02;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f\n",
                nombreCliente, cedulaCliente, valorInmueble, valorPredio);
    }
}
