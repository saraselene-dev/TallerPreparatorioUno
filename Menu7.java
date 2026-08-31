import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println();
        System.out.println("Estudiantes Estrucutra de Datos");
        System.out.println();
        System.out.println("Ingrese la cantidad de estudiantes");
        int n=sc.nextInt();
        sc.nextLine();
        Metodos7 m= new Metodos7();
        ObjEstudiante7 [][] estudiantes = new ObjEstudiante7[n][n];

        boolean continuar = true;

        while(continuar){
            System.out.println();
            System.out.println("¿Qué desea realizar? Elija una opción");
            System.out.println();
            System.out.println("1) Ingresar información de estudiantes");
            System.out.println("2) Mostrar todos los estudiantes");
            System.out.println("3) Mostrar estudiantes agrupados por nota");
            System.out.println("4) Salir del sistema");

            int opt=sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    estudiantes=m.LlenarEstudiantes(estudiantes, sc);
                    break;
                case 2:
                    m.MostrarEstudiantes(estudiantes);
                    break;
                case 3:
                    ObjEstudiante7[] grupoA = m.filtrarPorNota(estudiantes, "A");
                    ObjEstudiante7[] grupoB = m.filtrarPorNota(estudiantes, "B");
                    ObjEstudiante7[] grupoC = m.filtrarPorNota(estudiantes, "C");

                    m.mostrarGrupo(grupoA, "A");
                    m.mostrarGrupo(grupoB, "B");
                    m.mostrarGrupo(grupoC, "C");
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
