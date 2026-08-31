import java.util.Scanner;

public class Metodos10 {
    public ObjProducto10[][] LlenarProductos(ObjProducto10[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Ingrese el nombre del producto");
                String nombre = sc.nextLine();
                System.out.println("¿El producto está en oferta? Si/No");
                String respuesta = sc.next();
                sc.nextLine();
                boolean enOferta = respuesta.equalsIgnoreCase("Si");
                ObjProducto10 o = new ObjProducto10(nombre, enOferta);
                m[i][j] = o;
                System.out.println();

            }

        }
        return m;
    }

    public void MostrarProducto(ObjProducto10[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Nombre del producto: " + m[i][j].getNombre());
                System.out.println("Esta en oferta: " + m[i][j].isEnOferta());
                System.out.println("---------------------");

            }

        }
    }

    public int ContarEnOferta(ObjProducto10[][] m) {
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].isEnOferta()) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
