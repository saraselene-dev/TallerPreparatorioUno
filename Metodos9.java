import java.util.Scanner;

public class Metodos9 {

    public String[] LlenarNombres(String[] nombres, Scanner sc) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre del vendedor " + (i + 1));
            nombres[i] = sc.nextLine();
        }
        return nombres;
    }

    public double[][] LlenarVentas(double[][] ventas, String[] nombres, Scanner sc) {
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Ventas de " + nombres[i] + ":");
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("  Mes " + (j + 1) + ": ");
                ventas[i][j] = sc.nextDouble();
            }
        }
        return ventas;
    }

    public double[] calcularTotales(double[][] ventas) {
        double[] totales = new double[ventas.length];

        for (int i = 0; i < ventas.length; i++) {
            double suma = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                suma = suma + ventas[i][j];
            }
            totales[i] = suma;
        }
        return totales;
    }

    public void mostrarMejorVendedor(String[] nombres, double[] totales) {
        int posicionMayor = 0;
        double mayorVenta = totales[0];

        for (int i = 1; i < totales.length; i++) {
            if (totales[i] > mayorVenta) {
                mayorVenta = totales[i];
                posicionMayor = i;
            }
        }

        System.out.println("El vendedor con más ventas es: " + nombres[posicionMayor]);
        System.out.println("Total vendido: " + mayorVenta);
    }

    public void mostrarTotales(String[] nombres, double[] totales) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ": " + totales[i]);
        }
    }
}