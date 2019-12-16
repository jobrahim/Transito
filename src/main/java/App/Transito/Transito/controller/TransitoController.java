package App.Transito.Transito.controller;


import App.Transito.Transito.request.ConductorDTO;
import App.Transito.Transito.response.MultaDTO;
import App.Transito.Transito.service.RevisarMultasService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V1/transito")
public class TransitoController {

    private final Logger log = LoggerFactory.getLogger(TransitoController.class);

    @Autowired
    private RevisarMultasService revisarMultasService;

    @RequestMapping(value = "/SolicitarConductor", produces = {"application/json"}, consumes = {"application/json"}, method = RequestMethod.GET)
    public MultaDTO estadoMultas(ConductorDTO conductorDTO) {
        log.info("ingresando a la clase [TransitoController]");
        MultaDTO info = revisarMultasService.returnMulta(conductorDTO);
        log.info("devuelve el objeto  --> " + info.toString());

        return info;
    }
}
