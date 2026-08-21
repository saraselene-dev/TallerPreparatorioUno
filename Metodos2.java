import java.util.Scanner;

public class Metodos2 {
    public ObjProducto2[][] LlenarInventario(ObjProducto2[][] m, Scanner sc) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                ObjProducto2 o = new ObjProducto2();
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

    public int SumarInventario(ObjProducto2[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                suma = suma + m[i][j].getCantidad();
            }
        }
        return suma;
    }

}