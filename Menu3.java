import java.util.Scanner;

public class Menu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        System.out.println("Ingrese la dimensión de la librería");
        int n = sc.nextInt();
        ObjLibro3[][] libreria = new ObjLibro3[n][n];
        Metodos3 M = new Metodos3();

        while (continuar) {
            System.out.println("Bievenidos a Librería Lunita :)");
            System.out.println("¿Qué desea realizar hoy?");
            System.out.println("1) Registrar libro");
            System.out.println("2) Mostrar estantería");
            System.out.println("3) Mostrar libro más costoso");
            System.out.println("4) Salir");

            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    libreria = M.LlenarLibreria(libreria, sc);
                    break;
                case 2:
                    M.MostrarEstanteria(libreria);
                    break;
                case 3:
                    M.MostrarLibroCostoso(libreria);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        }
    }
}
