package com.aluracursos.convertidorDeMoneda.cambio;

import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenidos al Conversor de Monedas");
        /*System.out.println("Seleccione el tipo de cambio que desea realizar: ");*/
        System.out.println("""
                Opciones de Cambios:
                1-De Dolares a Peso Arg.
                2-De Euros a Peso Arg.
                3-De Reales a Peso Arg.
                4-De Libras a Peso Arg.
                5-De Euros a Dolares.           
                6-De Dolares a Reales.
                7-De Euros a Reales.
                0-Salir""");
        System.out.println("***************");
        System.out.println("Ingrese la opcion a realizar:");
        int opcion = scanner.nextInt();

            System.out.println("Ingrese la cantidad a convertir");
            double cantidad = scanner.nextDouble();
            double resultado = 0;
            switch (opcion){
                case 1:
                    resultado = convertirDolaresAPesoArgentino(cantidad);
                    System.out.println("la cantidad de " + cantidad + " de dolares son $ " + resultado + " Peso Argentino. ");
                    break;
                case 2:
                    resultado = convertirEurosAPesoArgentino(cantidad);
                    System.out.println("la cantidad de " + cantidad + " de Euros son $ " + resultado + " Peso Argentino. ");

                    break;
                case 3:
                    resultado = convertirRealesAPesoArgentino(cantidad);
                    System.out.println("la cantidad de " + cantidad + " de Reales son $ " + resultado + " Peso Argentino. ");
                    break;
                case 4:
                    resultado = convertirLibrasAPesoArgentino(cantidad);
                    System.out.println("la cantidad de " + cantidad + " de Libras son $ " + resultado + " Peso Argentino. ");
                    break;
                case 5:
                    resultado = convertirEurosADolares(cantidad);
                    System.out.println("la cantidad de " + cantidad + " de Euros son $ " + resultado + " Dolares. ");
                    break;
                case 6:
                    resultado = convertirDolaresAReales(cantidad);
                    System.out.println("la cantidad de " + cantidad + " de dolares son $ " + resultado + " Reales. ");
                    break;
                case 7:
                    resultado = convertirEurosAReales(cantidad);
                    System.out.println("la cantidad de " + cantidad + " de Euros son $ " + resultado + " Reales. ");

                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            scanner.close();

    }
    public static double convertirDolaresAPesoArgentino(double dolares){
        double tasaDeCambio =1200.00; // 1 Dolar = 1.200 Peso Argentino;
        return dolares * tasaDeCambio;
        }
        public static double convertirEurosAPesoArgentino(double euros){
        double tasaDeCambio = 1800.00; // 1 Euro = 1.800 Peso Argentino;
            return euros * tasaDeCambio;
        }
        public static double convertirRealesAPesoArgentino(double reales){
        double tasaDeCambio = 1000.00; // 1 real = 1.000 Peso Argentino;
            return reales * tasaDeCambio;
        }
        public static double convertirLibrasAPesoArgentino(double libras){
        double tasaDeCambio = 1100.00; // 1 libra = 1.100 Peso Argentino;
            return libras * tasaDeCambio;
        }
        public static double convertirEurosADolares(double euros){
        double tasaDeCambio = 1.50; // 1 euro = 1.5 Dolares;
            return euros * tasaDeCambio;
        }
        public static double convertirDolaresAReales(double dolares){
        double tasaDeCambio = 1.20; // 1 dolar = 1.2 reales;
            return dolares * tasaDeCambio;
        }
        public static double convertirEurosAReales(double euros){
        double tasaDeCambio =1.50; // 1 euro = 1.5 Reales;
            return euros * tasaDeCambio;
        }
}
