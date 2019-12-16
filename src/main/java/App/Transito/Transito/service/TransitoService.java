package App.Transito.Transito.service;

import App.Transito.Transito.controller.TransitoController;
import App.Transito.Transito.request.ConductorDTO;
import App.Transito.Transito.response.MultaDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TransitoService {

    private final Logger log = LoggerFactory.getLogger(TransitoController.class);

    public TransitoService() {

    }


    public ConductorDTO solicitarDatos() {
        log.info("Ingresando a la clase [TransitoService]");
        ConductorDTO conductor = new ConductorDTO();

        conductor.setNombre(cargarConductores().get(0));
        conductor.setDocumento(cargarDocumento().get(0));

        return conductor;
    }


    public ConductorDTO solicitarDatos1() {
        log.info("Ingresando a la clase [TransitoService]");
        ConductorDTO conductor1 = new ConductorDTO();

        conductor1.setNombre(cargarConductores().get(1));
        conductor1.setDocumento(cargarDocumento().get(1));

        return conductor1;
    }

    public ConductorDTO solicitarDatos2() {
        log.info("Ingresando a la clase [TransitoService]");
        ConductorDTO conductor2 = new ConductorDTO();

        conductor2.setNombre(cargarConductores().get(2));
        conductor2.setDocumento(cargarDocumento().get(2));

        return conductor2;
    }

    public MultaDTO solicitarMensaje() {
        log.info("Ingresando a la clase [TransitoService]");
        MultaDTO mensaje = new MultaDTO();

        mensaje.setMensaje(cargarMensaje().get(0));

        return mensaje;
    }

    public MultaDTO solicitarMensaje1() {
        log.info("Ingresando a la clase [TransitoService]");
        MultaDTO mensaje1 = new MultaDTO();

        mensaje1.setMensaje(cargarMensaje().get(1));

        return mensaje1;
    }

    public MultaDTO solicitarMensaje2() {
        log.info("Ingresando a la clase [TransitoService]");
        MultaDTO mensaje2 = new MultaDTO();

        mensaje2.setMensaje(cargarMensaje().get(2));

        return mensaje2;
    }

    private ArrayList<String> cargarDocumento() {

        ArrayList<String> ListaDeDNI = new ArrayList();
        ListaDeDNI.add("32.987.532");
        ListaDeDNI.add("97.323.451");
        ListaDeDNI.add("38.456.987");
        return ListaDeDNI;
    }

    private ArrayList<String> cargarConductores() {

        ArrayList<String> ListaDeChoferes = new ArrayList();
        ListaDeChoferes.add("Ramon");
        ListaDeChoferes.add("Carlos");
        ListaDeChoferes.add("Jose");
        return ListaDeChoferes;

    }

    private ArrayList<String> cargarMensaje() {

        ArrayList<String> ListaDeChoferes = new ArrayList();
        ListaDeChoferes.add("Detener al ciudadano y decomisar el vehiculo");
        ListaDeChoferes.add("Ciudadano debe 4.500 $  por exceso de Velocidad en Av Elcano");
        ListaDeChoferes.add("No posee Multas");
        return ListaDeChoferes;
    }

}
