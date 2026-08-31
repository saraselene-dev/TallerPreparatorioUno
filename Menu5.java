import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos5 U = new Metodos5();
        System.out.println("Bienvenido a almacenes Estrucura de Datos");
        System.out.println();
        System.out.print("Ingrese el tamaño del almacen: ");
        int n = sc.nextInt();
        ObjAlmacen5[][] almacen1 = new ObjAlmacen5[n][n];
        ObjAlmacen5[][] almacen2 = new ObjAlmacen5[n][n];
        ObjAlmacen5[][] almacenUnificado = new ObjAlmacen5[n][n * n];
        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.println("¿Qué desea realizar? Elija una opción");
            System.out.println("1) Llenar almacen 1: ");
            System.out.println("2) Mostar almacen 1: ");
            System.out.println("3) Llenar almacen 2: ");
            System.out.println("4) Mostar almacen 2: ");
            System.out.println("5) Unificar Almacenes: ");
            System.out.println("6) Buscar Producto: ");
            System.out.println("7) Mostrar almacenes Unificados: ");
            System.out.println("8) Salir ");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    almacen1 = U.LlenarAlmacen(almacen1, sc);
                    break;
                case 2:
                    U.MostrarAlmacen(almacen1);
                    break;
                case 3:
                    almacen2 = U.LlenarAlmacen(almacen2, sc);
                    break;
                case 4:
                    U.MostrarAlmacen(almacen2);
                    break;
                case 5:
                    almacenUnificado = U.UnificarAlmacenes(almacen1, almacen2, almacenUnificado);
                    break;
                case 6:
                    U.BuscarDato(almacenUnificado, sc);
                    break;
                case 7:
                    U.MostrarAlmacen(almacenUnificado);
                    break;
                case 8:
                    continuar = false;
                    System.out.println("¡Gracias, hasta luego!");
                    break;
                default:
                    JOptionPane.showConfirmDialog(null,
                            "¡Opción inválida, por favor intente nuevamente!");
                    break;
            }

        }

    }

}
