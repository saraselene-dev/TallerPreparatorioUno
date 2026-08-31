import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos9 m = new Metodos9();

        String[] nombres = new String[5];
        double[][] ventas = new double[5][12];
        double[] totales = null; // aún no se han calculado

        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.println("¿Qué desea realizar? Elija una opción");
            System.out.println("1) Ingresar nombres de vendedores");
            System.out.println("2) Ingresar ventas del año");
            System.out.println("3) Calcular y mostrar totales por vendedor");
            System.out.println("4) Mostrar vendedor con más ventas");
            System.out.println("5) Salir del sistema");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    nombres = m.LlenarNombres(nombres, sc);
                    break;
                case 2:
                    ventas = m.LlenarVentas(ventas, nombres, sc);
                    break;
                case 3:
                    totales = m.calcularTotales(ventas);
                    m.mostrarTotales(nombres, totales);
                    break;
                case 4:
                    if (totales != null) {
                        m.mostrarMejorVendedor(nombres, totales);
                    } else {
                        JOptionPane.showMessageDialog(null, "Primero calcule los totales (opción 3).");
                    }
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