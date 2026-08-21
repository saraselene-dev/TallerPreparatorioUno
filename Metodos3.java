import java.util.Scanner;

public class Metodos3 {

    public ObjLibro3[][] LlenarLibreria(ObjLibro3[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                ObjLibro3 o = new ObjLibro3();
                System.out.println("Digite el título del libro");
                o.setTitulo(sc.next());
                System.out.println("Digite el autor del libro");
                o.setAutor(sc.next());
                System.out.println("Digite el precio del libro");
                o.setPrecio(sc.nextDouble());
                m[i][j] = o;
                System.out.println();
            }
        }
        return m;
    }

    public void MostrarEstanteria(ObjLibro3[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("Título: " + m[i][j].getTitulo());
                System.out.println("Autor: " + m[i][j].getAutor());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("-----------------");
            }
        }
    }

    public void MostrarLibroCostoso(ObjLibro3[][] m) {
        ObjLibro3 masCaro = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j].getPrecio() > masCaro.getPrecio()) {
                    masCaro = m[i][j];
                }
            }
        }
        System.out.println("El libro más costoso es: ");
        System.out.println("Título: " + masCaro.getTitulo());
        System.out.println("Autor: " + masCaro.getAutor());
        System.out.println("Precio: " + masCaro.getPrecio());
        System.out.println("-----------------");
    }
}
