
import java.io.Serializable;
public class Usuario implements Serializable{
    public final long SerializableUID  = 222L;
    private String Nombre;
    private String Usuario;
    private String Password;

    public Usuario() {
    }

    public Usuario(String Nombre, String Usuario, String Password) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
