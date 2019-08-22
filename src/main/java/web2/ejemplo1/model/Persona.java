package web2.ejemplo1.model;

import java.io.Serializable;

/**
 *
 * @author udc
 */
public class Persona implements Serializable {
    private String apellido;
    private String nombre;
    private Integer edad;
    private Integer numeroDocumento;
    
    public Persona() {
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Obtiene la edad en años.
     * @return 
     */
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
    public boolean isMayor() {
        return getEdad() >= 18;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
    
    
}
