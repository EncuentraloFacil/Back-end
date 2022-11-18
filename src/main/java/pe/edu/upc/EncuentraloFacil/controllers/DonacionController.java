package pe.edu.upc.EncuentraloFacil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EncuentraloFacil.entities.Donacion;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.DonacionService;


import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/donacion")
@CrossOrigin("http://localhost:4200/")
public class DonacionController {

    @Autowired
    private DonacionService dS;

    @PostMapping
    public void registrar(@RequestBody Donacion donacion) {
        dS.insertar(donacion);
    }

    @PutMapping
    public void modificar(@RequestBody Donacion donacion) {
        dS.insertar(donacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        dS.eliminar(id);
    }

    @GetMapping
    public List<Donacion> listar() {
        return dS.listar();

    }

    @PostMapping("/buscar")
    public List<Donacion> buscar(@RequestBody String dona) throws ParseException {

        List<Donacion> listaDonacion;
        listaDonacion = dS.buscarDonacion(dona);

        if (listaDonacion.isEmpty()) {

            listaDonacion = dS.buscarProducto(dona);
            listaDonacion = dS.buscarDireccion(dona);


        }
        return listaDonacion;
    }


        @GetMapping("/{id}")
        public Optional<Donacion>listaId(@PathVariable("id") Integer id){
            return dS.listaId(id);
        }

}

