package App.Transito.Transito.request;

import java.io.Serializable;

public class ConductorDTO implements Serializable{


    private String nombre;
    private String documento;

    public ConductorDTO() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "ConductorDTO{" +
                "documento='" + documento + '\'' +
                '}';
    }
}
