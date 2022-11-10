package pe.edu.upc.EncuentraloFacil.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EncuentraloFacil.entities.Reporte;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.ReporteService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reporte")
@CrossOrigin("http://localhost:4200/")
public class ReporteController {

    @Autowired
    private ReporteService rS;


    @PostMapping
    public void registrar(@RequestBody Reporte reporte) {
        rS.insertar(reporte);
    }

    @PutMapping
    public void modificar(@RequestBody Reporte reporte) {
        rS.insertar(reporte);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rS.eliminar(id);
    }

    @GetMapping
    public List<Reporte> listar() {
        return rS.listar();

    }

    @PostMapping("/buscar")
    public List<Reporte> buscar(@RequestBody Reporte reporte) throws ParseException {

        List<Reporte> listaReporte;
        listaReporte = rS.buscarReporte(reporte.getDesReporte());

        if (listaReporte.isEmpty()) {

            listaReporte= rS.buscarConsumidor(reporte.getConsumidor().getNomConsumidor());
            listaReporte=rS.buscarVendedor(reporte.getVendedor().getNomVendedor());

        }
        return listaReporte;

    }
    @GetMapping("/{id}")
    public Optional<Reporte> listarId(@PathVariable("id") Integer id) {
        return rS.listarId(id);
    }

}
