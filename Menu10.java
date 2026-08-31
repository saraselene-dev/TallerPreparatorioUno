import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos10 m = new Metodos10();
        System.out.println();
        System.out.print("Ingrese la dimensión del almacen: ");
        int n = sc.nextInt();
        sc.nextLine();
        ObjProducto10[][] productos = new ObjProducto10[n][n];

        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.println("Elija una opción");
            System.out.println("1) Ingresar productos");
            System.out.println("2) Mostrar productos");
            System.out.println("3) contar productos en oferta");
            System.out.println("4) salir del sistema");
            System.out.println();

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    productos = m.LlenarProductos(productos, sc);
                    break;
                case 2:
                    m.MostrarProducto(productos);
                    break;
                case 3:
                    int total = m.ContarEnOferta(productos);
                    System.out.println("Total productos en oferta: " + total);
                    break;
                case 4:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "¡Gracias, hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "¡Opción inválida, intente nuevamente!");
                    break;
            }
        }
    }
}
