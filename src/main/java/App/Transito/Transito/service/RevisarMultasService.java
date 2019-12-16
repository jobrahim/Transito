package App.Transito.Transito.service;

import App.Transito.Transito.request.ConductorDTO;
import App.Transito.Transito.response.MultaDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RevisarMultasService {

    private final Logger log = LoggerFactory.getLogger(RevisarMultasService.class);


    @Autowired
    private TransitoService transitoService;

    public RevisarMultasService(){

    }

    public MultaDTO returnMulta(ConductorDTO conductorDTO){

    log.info("Ingresando a la clase [RevisarMultasService]");

    if(conductorDTO.getDocumento() == "32.987.532"){

        MultaDTO estado = this.transitoService.solicitarMensaje();
        return estado;

    }else if(conductorDTO.getDocumento() == "97.323.451"){

        MultaDTO estado1 = this.transitoService.solicitarMensaje1();
        return estado1;
    }else {
        MultaDTO estado2 = this.transitoService.solicitarMensaje2();
        return estado2;
    }

    }

}
