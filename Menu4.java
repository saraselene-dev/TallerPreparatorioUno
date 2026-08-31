import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos4 metodos = new Metodos4();
        System.out.println("Bienvenidos a teatro Estructuras de Datos:");
        System.out.println();
        System.out.print("Ingrese el número de filas: ");
        int fila = sc.nextInt();
        System.out.print("Ingrese el número de colmunas: ");
        int columna = sc.nextInt();
        System.out.println();
        ObjAsiento4[][] m = new ObjAsiento4[fila][columna];

        boolean continuar = true;

        while (continuar) {

            System.out.println("¿Qué desea realizar? Eliga una opción");
            System.out.println();
            System.out.println("1) Ingresar información");
            System.out.println("2) Mostrar información ingresada");
            System.out.println("3) Ordenar información de forma ascendente por precio");
            System.out.println("4) Mostrar información ordenada");
            System.out.println("5) Salir del sistema");
            System.out.println();


            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    m = metodos.LlenarTeatro(m, sc);

                    break;
                case 2:
                    metodos.MostrarTeatro(m);

                    break;
                case 3:
                    m = metodos.ordenarPorFila(m);

                    break;
                case 4:
                    metodos.MostrarTeatro(m);

                    break;
                case 5:
                    continuar = false;
                    System.out.println("¡Gracias, hasta luego!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "¡Opción inválida, por favor intente de nuevo!");
                    break;
            }

        }

    }

}
