import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        System.out.println("Ingrese la dimensión del almacen");
        int n = sc.nextInt();
        ObjProducto[][] almacen = new ObjProducto[n][n];
        Metodos M = new Metodos();

        while (continuar) {
            System.out.println();
            System.out.println("Bienvenidos a Almacen Estructura");
            System.out.println("Elija la opcion a realizar");
            System.out.println();
            System.out.println("1) Registrar productos");
            System.out.println("2) Sumar inventario");
            System.out.println("3) Salir");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    almacen = M.LlenarInventario(almacen, sc);
                    break;

                case 2:
                    System.out.println("Cantidad total: " + M.SumarInventario(almacen));
                    break;
                case 3:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente nuevamente");
                    break;
            }

        }

    }

}
