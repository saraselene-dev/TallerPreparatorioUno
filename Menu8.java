import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Bienvenidos al Almacén de Estructuras de Datos");
        System.out.println();
        System.out.println("¿Cuántos productos va a ingresar?");
        int n = sc.nextInt();
        sc.nextLine();

        Metodos8 m = new Metodos8();
        ObjProducto8[] productos = new ObjProducto8[n];
        ObjProducto8[][] estanterias = null;

        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.println("¿Qué desea realizar? Elija una opción");
            System.out.println();
            System.out.println("1) Ingresar información de productos");
            System.out.println("2) Agrupar productos en estanterías");
            System.out.println("3) Mostrar estanterías");
            System.out.println("4) Salir del sistema");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    productos = m.LlenarProductos(productos, sc);
                    break;
                case 2:
                    estanterias = m.AgruparMatriz(productos);
                    System.out.println("Productos agrupados correctamente.");
                    break;
                case 3:
                    if (estanterias != null) {
                        m.MostrarEstanterias(estanterias);
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero debe agrupar los productos/ opción 2.");
                    }
                    break;
                case 4:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "¡Gracias, hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "¡Opción inválida, intente nuevamente");
                    break;
            }
        }
    }
}
