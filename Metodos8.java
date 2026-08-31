import java.util.Scanner;

public class Metodos8 {

    public ObjProducto8[] LlenarProductos(ObjProducto8[] m, Scanner sc) {

        for (int i = 0; i < m.length; i++) {
            System.out.println("Ingrese el nombre del producto");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el peso del producto");
            double peso = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la categoría del producto");
            String categoria = sc.nextLine();
            m[i] = new ObjProducto8(nombre, peso, categoria);
            System.out.println();

        }
        return m;

    }

    public boolean yaExiste(String[] categorias, int cantidad, String categoriaBuscada) {
        for (int i = 0; i < cantidad; i++) {
            if (categorias[i].equalsIgnoreCase(categoriaBuscada)) {
                return true;
            }

        }
        return false;
    }

    public ObjProducto8[][] AgruparMatriz(ObjProducto8[] productos) {

        // Hallar categorias.
        String[] categoriasEncontradas = new String[productos.length];
        int totalCategorias = 0;
        for (int i = 0; i < productos.length; i++) {
            String categoriaActual = productos[i].getCategoria();
            if (!yaExiste(categoriasEncontradas, totalCategorias, categoriaActual)) {
                categoriasEncontradas[totalCategorias] = categoriaActual;
                totalCategorias++;
            }

        }
        // contar productos de cada categoría.
        int[] conteos = new int[totalCategorias];
        for (int i = 0; i < productos.length; i++) {
            String categoriaActual = productos[i].getCategoria();
            for (int k = 0; k < totalCategorias; k++) {
                if (categoriasEncontradas[k].equalsIgnoreCase(categoriaActual)) {
                    conteos[k]++;
                    break;
                }
            }
        }
        // Encontrar el máximo entre los conteos.
        int maximo = conteos[0];
        for (int i = 1; i < conteos.length; i++) {
            if (conteos[i] > maximo) {
                maximo = conteos[i];
            }
        }
        // crear la matriz final (filas = categorías, columnas = máximo)
        ObjProducto8[][] estanterias = new ObjProducto8[totalCategorias][maximo];

        // llenar la matriz
        for (int k = 0; k < totalCategorias; k++) {
            String categoriaActual = categoriasEncontradas[k];
            int posicion = 0;

            for (int i = 0; i < productos.length; i++) {
                if (productos[i].getCategoria().equals(categoriaActual)) {
                    estanterias[k][posicion] = productos[i];
                    posicion++;
                }
            }
        }

        return estanterias;
    }

    public void MostrarEstanterias(ObjProducto8[][] estanterias) {
        for (int i = 0; i < estanterias.length; i++) {
            System.out.println("---Sección " + i + "---");
            for (int j = 0; j < estanterias[i].length; j++) {
                if (estanterias[i][j] != null) {
                    System.out.println("Nombre: " + estanterias[i][j].getNombre());
                    System.out.println("Peso: " + estanterias[i][j].getPeso());
                    System.out.println("Categoría: " + estanterias[i][j].getCategoria());
                    System.out.println("-----------------------");
                }
            }
            System.out.println();
        }
    }
}
