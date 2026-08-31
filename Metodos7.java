import java.util.Scanner;

public class Metodos7 {
    public ObjEstudiante7 [][] LlenarEstudiantes (ObjEstudiante7[][] m, Scanner sc){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Ingrese el nombre del estudiante");
                String nombre=sc.nextLine();
                System.out.println("Ingrese la nota del estudiante: A/B/C. ");
                String nota=sc.nextLine();
                ObjEstudiante7 o = new ObjEstudiante7(nombre, nota);
                m[i][j]=o;
                System.out.println();
            }
            
        }
        return m;
    }

    public void MostrarEstudiantes(ObjEstudiante7 [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Estudiante: "+m[i][j].getNombre());
                System.out.println("Nota: "+m[i][j].getNota());
                System.out.println("---------------");
                
            }
            
        }
    }
// cuántos estudiantes tienen una nota específica
    public int contarPorNota(ObjEstudiante7[][] m, String notaBuscada) {
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].getNota().equalsIgnoreCase(notaBuscada)) {
                    contador++;
                }
            }
        }
        return contador;
    }
 // Filtrar y devolver  solo los estudiantes con una nota específica

    public ObjEstudiante7[] filtrarPorNota(ObjEstudiante7[][] m, String notaBuscada) {
        int cantidad = contarPorNota(m, notaBuscada);
        ObjEstudiante7[] grupo = new ObjEstudiante7[cantidad];
        int posicion = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].getNota().equalsIgnoreCase(notaBuscada)) {
                    grupo[posicion] = m[i][j];
                    posicion++;
                }
            }
        }
        return grupo;
    }
    
     // Mostrar  un grupo ya filtrado
    public void mostrarGrupo(ObjEstudiante7[] grupo, String letra) {
        System.out.println("=== Grupo " + letra + " ===");
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("  " + grupo[i].getNombre());
        }
        System.out.println();
    }
}

