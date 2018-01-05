
import java.io.Serializable;

public class Pintura extends Producto implements Serializable{
    public final long SerializableUID = 111L;
    private String Codigo;
    private String DescripcionP;

    public Pintura() {
    }
    
    public Pintura(String Codigo, String DescripcionP, String Id, double Costo, double Precio, String Descripcion, int Cantidad) {
        super(Id, Costo, Precio, Descripcion, Cantidad);
        this.Codigo = Codigo;
        this.DescripcionP = DescripcionP;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String DescripcionP) {
        this.DescripcionP = DescripcionP;
    }
}
