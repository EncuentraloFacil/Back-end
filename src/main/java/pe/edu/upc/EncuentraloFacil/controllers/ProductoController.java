package pe.edu.upc.EncuentraloFacil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EncuentraloFacil.entities.Producto;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.ProductoService;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
@CrossOrigin("http://localhost:4200/")
public class ProductoController {

    @Autowired
    private ProductoService pS;

    @PostMapping
    public void registrar(@RequestBody Producto producto) {
        pS.insertar(producto);
    }

    @PutMapping
    public void modificar(@RequestBody Producto producto) {
        pS.insertar(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pS.eliminar(id);
    }

    @GetMapping
    public List<Producto> listar() {
        return pS.listar();

    }

    @PostMapping("/buscar")
    public List<Producto> buscar(@RequestBody String producto , Date fecha) throws ParseException {

        List<Producto> listaProductos;
       listaProductos = pS.buscarProducto(producto);

        if (listaProductos.isEmpty()) {

            listaProductos= pS.buscarVendedor(producto);
            listaProductos= pS.buscarMarca(producto);
            listaProductos= pS.buscarCategoria(producto);
            listaProductos= pS.buscarNotificacion(fecha);
        }
        return listaProductos;

    }
    @GetMapping("/{id}")
    public Optional<Producto> listarId(@PathVariable("id") Integer id) {
        return pS.listarId(id);
    }
}

