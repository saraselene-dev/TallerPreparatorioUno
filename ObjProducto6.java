public class ObjProducto6 {
    private String Nombre;
    private double Precio;
    private boolean Disponible;
    
    public ObjProducto6() {
    }

    public ObjProducto6(String nombre, double precio, boolean disponible) {
        Nombre = nombre;
        Precio = precio;
        Disponible = disponible;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }

    

    
}
