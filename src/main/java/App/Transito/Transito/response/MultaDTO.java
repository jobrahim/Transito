package App.Transito.Transito.response;


import java.io.Serializable;

public class MultaDTO implements Serializable{



    private String mensaje;


    public MultaDTO(){

    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "MultaDTO{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}

