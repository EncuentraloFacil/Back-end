package pe.edu.upc.EncuentraloFacil.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EncuentraloFacil.entities.DetalleVenta;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.DetalleVentaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/detalleVenta")
@CrossOrigin("http://localhost:4200/")
public class DetalleVentaController {
    @Autowired
    private DetalleVentaService dvS;

    @PostMapping
    public void registrar(@RequestBody DetalleVenta detalleVenta) {
        dvS.insertar(detalleVenta);
    }

    @PutMapping
    public void modificar(@RequestBody DetalleVenta detalleVenta) {
        dvS.insertar(detalleVenta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        dvS.eliminar(id);
    }

    @GetMapping
    public List<DetalleVenta> listar() {
        return dvS.listar();

    }

    @PostMapping("/buscar")
    public List<DetalleVenta> buscar(@RequestBody String venta, int id) throws ParseException {

        List<DetalleVenta> listaVenta;
        listaVenta = dvS.buscarDetalleVenta(id);

        if (listaVenta.isEmpty()) {

            listaVenta= dvS.buscarOfertas(venta);

        }
        return listaVenta;

    }
    @GetMapping("/{id}")
    public Optional<DetalleVenta> listarId(@PathVariable("id") Integer id) {
        return dvS.listarId(id);
    }

}
