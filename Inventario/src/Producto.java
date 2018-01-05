public class Producto {
    private String Id;
    private double Costo;
    private double Precio;
    private String Descripcion;
    private int Cantidad;

    public Producto() {
    }
    
    public Producto(String Id, double Costo, double Precio, String Descripcion, int Cantidad) {
        this.Id = Id;
        this.Costo = Costo;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
    }

    
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }


    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public void AumentarCantidad(int cantidad){
        this.Cantidad+=cantidad;
    }
    
    public void DecrementarCantidad(int cantidad){
        this.Cantidad-=cantidad;
    }
}
