import java.util.Scanner;

public class Metodos {
    public ObjProducto[][] LlenarInventario(ObjProducto[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                ObjProducto o = new ObjProducto();
                System.out.println();
                System.out.println("Ingrese el nombre del producto");
                o.setNombre(sc.next());
                System.out.println("ingrese el precio del producto");
                o.setPrecio(sc.nextDouble());
                System.out.println("ingrese la cantidad del producto");
                o.setCantidad(sc.nextInt());
                m[i][j] = o;
                System.out.println("----------------");

            }

        }
        return m;
    }

    public int SumarInventario(ObjProducto[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                suma = suma + m[i][j].getCantidad();
            }
        }
        return suma;
    }

}