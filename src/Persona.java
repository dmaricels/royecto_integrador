
import java.util.Date;

/*
 * Persona.java
 *
 */

/**
 *
 * @author Sebastian S. Sanga <SebastianSanga@educacionIT.com.ar>
 */
public abstract class Persona {

   private String Nombre;
   private Date FechaDeNacimiento;

    public Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
   
   
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, String numeroDocumento) {
        setNombre(nombre);
        setApellido(apellido);
        setNumeroDocumento(numeroDocumento);
    }

    // Atributos
    private String nombre;
    private String apellido;
    private String numeroDocumento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

}
