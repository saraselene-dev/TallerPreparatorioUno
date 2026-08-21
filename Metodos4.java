import java.util.Scanner;

public class Metodos4 {
    public ObjAsiento4[][] LlenarTeatro(ObjAsiento4[][]m, Scanner sc){
        for (int i= 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                ObjAsiento4 o = new ObjAsiento4();
                System.out.println("Ingrese el número del asiento");
                o.setNumero(sc.nextInt());
                System.out.println("Ingrese el número de la fila");
                o.setFila(sc.nextInt());
                System.out.println("Ingrese el precio del asiento");
                o.setPrecio(sc.nextDouble());
                System.out.println();
                m[i][j]=o;
                
            }
            
        }
        return m;
    }
    
    public void MostrarTeatro(ObjAsiento4[][]m){
    for (int i= 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println("Número: " + m[i][j].getNumero());
                System.out.println("Fila: " + m[i][j].getFila());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("-----------------");
            }
        }
    }

    public ObjAsiento4[][] ordenarPorFila(ObjAsiento4[][]m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                for (int k = j + 1; k < m[0].length; k++) {
                    if (m[i][j].getPrecio() > m[i][k].getPrecio()) {
                        ObjAsiento4 temp = m[i][j];
                        m[i][j] = m[i][k];
                        m[i][k] = temp;
                    }
                }
            }
        }
        return m;
    }
}