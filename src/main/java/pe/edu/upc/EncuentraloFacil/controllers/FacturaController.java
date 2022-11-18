package pe.edu.upc.EncuentraloFacil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EncuentraloFacil.entities.Factura;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.FacturaService;


import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/factura")
@CrossOrigin("http://localhost:4200/")
public class FacturaController {

    @Autowired
    private FacturaService fS;

    @PostMapping
    public void registrar(@RequestBody Factura factura) {
        fS.insertar(factura);
    }

    @PutMapping
    public void modificar(@RequestBody Factura factura) {
        fS.insertar(factura);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
       fS.eliminar(id);
    }

    @GetMapping
    public List<Factura> listar() {
        return fS.listar();

    }

    @PostMapping("/buscar")

    public List<Factura> buscar(@RequestBody String factura) {
           return fS.buscarConsumidor(factura);
  
    }
    @GetMapping("/{id}")
    public Optional<Factura> listarId(@PathVariable("id") Integer id) {
        return fS.listarId(id);
    }
}
