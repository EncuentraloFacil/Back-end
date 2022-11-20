package pe.edu.upc.EncuentraloFacil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EncuentraloFacil.entities.Oferta;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.OfertaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/oferta")
@CrossOrigin("http://localhost:4200/")
public class OfertaController {
    @Autowired
    private OfertaService oS;

    @PostMapping
    public void registrar(@RequestBody Oferta oferta) {
        oS.insertar(oferta);
    }

    @PutMapping
    public void modificar(@RequestBody Oferta oferta) {
        oS.insertar(oferta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        oS.eliminar(id);
    }

    @GetMapping
    public List<Oferta> listar() {
        return oS.listar();

    }

    @PostMapping("/buscar")
    public List<Oferta> buscar(@RequestBody String ofert) throws ParseException {

        List<Oferta> listaOfertas;
        listaOfertas = oS.buscarOferta(ofert);

        if (listaOfertas.isEmpty()) {

            listaOfertas= oS.buscarProducto(ofert);

        }
        return listaOfertas;

    }
    @GetMapping("/{id}")
    public Optional<Oferta> listarId(@PathVariable("id") Integer id) {
        return oS.listarId(id);
    }

}
