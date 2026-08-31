import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Bienvenidos Supermermercado Estructuras de Datos");
        System.out.println();
        System.out.print("Ingrese el tamaño de la estantería: ");
        int n = sc.nextInt();
        Metodos6 m = new Metodos6();
        ObjProducto6[][] o = new ObjProducto6[n][n];
        ObjProducto6[] diponibles = null;
        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.println("¿Qué desea realizar? Elija una Opción");
            System.out.println();
            System.out.println("1) Ingresar información del producto");
            System.out.println("2) Mostrar Estantería");
            System.out.println("3) Filtar disponibles");
            System.out.println("4) Mostrar productos disponibles");
            System.out.println("5) Salir del sistema");

            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    o = m.LlenarEstanteria(o, sc);
                    break;
                case 2:
                    m.MostrarEstanteria(o);
                    break;
                case 3:
                    diponibles = m.filtrarDisponibles(o);
                    System.out.println("¡Filtrado exitoso!");
                    break;
                case 4:
                    m.MostrarDisponibles(diponibles);
                    break;
                case 5:
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
