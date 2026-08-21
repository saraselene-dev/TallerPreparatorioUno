import java.util.Scanner;

public class Metodo {
    public ObjProducto[][] LlenarProductos(ObjProducto[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                ObjProducto o = new ObjProducto();
                System.out.println("Ingrese el nombre del producto");
                o.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la cantidad del producto");
                o.setCantidad(sc.nextInt());
                System.out.println("-----------------");
                System.out.println();
                m[i][j] = o;

            }
            
        }
        return m;
    }

    public void BuscarProducto(ObjProducto[][] m, String nombreBuscado) {
        boolean encontrado = false;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j].getNombre().equals(nombreBuscado)) {
                    System.out.println("Producto encontrado en la posición: " + "[" + i + "]" + "[" + j + "]");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado");
        }
    }
}
