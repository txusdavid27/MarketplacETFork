package puj.proyecto.ms.servicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import puj.proyecto.ms.servicio.model.TipoTransporte;
import puj.proyecto.ms.servicio.services.TipoTransporteService;

@RestController
@RequestMapping("/tipo-transporte")
public class TipoTransporteController {
    @Autowired
    Environment environment;

    @Autowired
    private TipoTransporteService tipoTransporteService;


    @GetMapping()
    public List<TipoTransporte> obtenerTiposTransporte() {
        return (List<TipoTransporte>) tipoTransporteService.obtenerTiposTransporte();
    }

    @GetMapping("/{id}")
    public TipoTransporte obtenerTipoTransporteId(@PathVariable Long id) {
        return tipoTransporteService.obtenerTipoTransporteId(id);
    }

    // http://localhost:8080/usuario/query/cliente?nombre=Mau
    // @GetMapping("/nombre/{nombre}")
    // public PaseoEcologico obtenerRedSocialNombre(@PathVariable String nombre) {
    //     return paseoEcologicoService.obtenerPaseoEcologicoNombre(nombre);
    // }

    @PostMapping()
    public TipoTransporte agregarTipoTransporte(@RequestBody TipoTransporte tipoTransporte) {
        return tipoTransporteService.agregarTipoTransporte(tipoTransporte);
    }

    @PutMapping("/{id}")
    public TipoTransporte actualizarTipoTransporte(@PathVariable Long id, @RequestBody TipoTransporte newTipoComida) {
        return tipoTransporteService.actualizarTipoTransporte(id, newTipoComida);
    }

    @DeleteMapping("/{id}")
    public String eliminarTipoTransporte(@PathVariable Long id) {
        return tipoTransporteService.eliminarTipoTransporte(id);
    }
}
