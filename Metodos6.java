import java.util.Scanner;

public class Metodos6 {
    public ObjProducto6[][] LlenarEstanteria(ObjProducto6[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Ingrese el nombre del producto");
                String nombre = sc.next();
                System.out.println("ingrese el precio del producto");
                double precio = sc.nextDouble();
                System.out.println("¿El producto esta disponible: Si/No?");
                String respuesta = sc.next();
                boolean disponible = respuesta.equalsIgnoreCase("Si");
                ObjProducto6 o = new ObjProducto6(nombre, precio, disponible);
                m[i][j] = o;
                System.out.println();
            }
        }
        return m;
    }

    public void MostrarEstanteria(ObjProducto6[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Disponible: " + m[i][j].isDisponible());
                System.out.println("---------------------");
            }
        }
    }

    public int ContarDisponibles(ObjProducto6[][] m) {
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].isDisponible()) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public ObjProducto6[] filtrarDisponibles(ObjProducto6[][] m) {
        // Primero cuento los disponibles.
        int cantidad = ContarDisponibles(m);
        // Crear el arreglo con el tamaño de los disponibles.
        ObjProducto6[] disponibles = new ObjProducto6[cantidad];
        // el espacio de la caja donde voy a guardar
        int posicion = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].isDisponible()) {
                    disponibles[posicion] = m[i][j]; // guardo en el espacio actual
                    posicion++; // avanzo solo cuando guardo algo
                }
            }
        }
        return disponibles;
    }

    public void MostrarDisponibles(ObjProducto6[] disponibles) {
        for (int i = 0; i < disponibles.length; i++) {
            System.out.println("Nombre: " + disponibles[i].getNombre());
            System.out.println("Precio: " + disponibles[i].getPrecio());
            System.out.println("----------------------");
        }
    }
}
