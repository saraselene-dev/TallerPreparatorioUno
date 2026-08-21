import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        ObjProducto[][] almacen = new ObjProducto[5][6];
        Metodo M = new Metodo();

        while (continuar) {
            System.out.println();
            System.out.println("===Bienvenidos a Almacen Estructura===");
            System.out.println("Elja una opción a realizar");
            System.out.println();
            System.out.println("1) Ingresar productos");
            System.out.println("2) Buscar producto por nombre");
            System.out.println("3) Salir");
            System.out.println();

            int opt = sc.nextInt();
            System.out.println();
            switch (opt) {
                case 1:
                    almacen = M.LlenarProductos(almacen, sc);

                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto que desea buscar");
                    String nombreBuscado = sc.next();
                    M.BuscarProducto(almacen, nombreBuscado);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, por favor intente nuevamente");
                    break;
            }
            System.out.println();
        }
    }

}
