import java.util.Scanner;

public class Metodos5 {

    public ObjAlmacen5[][] LlenarAlmacen(ObjAlmacen5[][] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.next();
                System.out.println("Ingrese el precio del producto: ");
                double precio = sc.nextDouble();
                System.out.println("Ingrese la cantidad del producto: ");
                int cantidad = sc.nextInt();
                ObjAlmacen5 o = new ObjAlmacen5(nombre, precio, cantidad);
                a[i][j] = o;
            }

        }
        return a;
    }

    public ObjAlmacen5[][] UnificarAlmacenes(ObjAlmacen5[][] a, ObjAlmacen5[][] b, ObjAlmacen5[][] c) {
        // Copiar matriz a completa a c.
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j];
            }
        }

        // Contador de columna libre por cada fila.
        int[] columnaLibre = new int[c.length];
        for (int i = 0; i < columnaLibre.length; i++) {
            columnaLibre[i] = a[0].length;
        }

        // Recorrer b, buscar si cada product ya existe en c.
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                boolean encontrado = false;

                for (int x = 0; x < c.length && !encontrado; x++) {
                    for (int y = 0; y < c[x].length & !encontrado; y++) {
                        if (c[x][y] != null && c[x][y].getNombre().equalsIgnoreCase(b[i][j].getNombre())) {
                            c[x][y].setCantidad(c[x][y].getCantidad() + b[i][j].getCantidad());
                            encontrado = true;
                        }

                    }

                }
                if (!encontrado) {
                    c[i][columnaLibre[i]] = b[i][j];
                    columnaLibre[i]++;
                }
            }

        }
        return c;

    }

    public void MostrarAlmacen(ObjAlmacen5[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != null) {
                    System.out.println("Nombre Producto: " + matrix[i][j].getNombre());
                    System.out.println("Precio Producto: " + matrix[i][j].getPrecio());
                    System.out.println("Stock Producto: " + matrix[i][j].getCantidad());
                    System.out.println("-------------------------------");
                }
            }
            System.out.println();

        }

    }

    public void BuscarDato(ObjAlmacen5[][] matrix, Scanner sc) {
        System.out.println("Por favor ingrese el nombre a buscar");
        String dato = sc.nextLine();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != null && matrix[i][j].getNombre().equalsIgnoreCase(dato)) {
                    System.out.println("Nombre Producto: " + matrix[i][j].getNombre());
                    System.out.println("Precio Producto: " + matrix[i][j].getPrecio());
                    System.out.println("Stock Producto: " + matrix[i][j].getCantidad());
                    System.out.println("-------------------------------");
                }
            }
            System.out.println();
        }

    }

}
