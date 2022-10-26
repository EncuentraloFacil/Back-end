package pe.edu.upc.EncuentraloFacil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EncuentraloFacil.entities.Producto;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.ProductoService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
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
    public List<Producto> buscar(@RequestBody Producto producto) throws ParseException {

        List<Producto> listaProductos;
       listaProductos = pS.buscarProducto(producto.getDesProducto());

        if (listaProductos.isEmpty()) {

            listaProductos= pS.buscarVendedor(producto.getIdVendedor().getNomVendedor());
            listaProductos= pS.buscarMarca(producto.getMarcaProducto());
            listaProductos= pS.buscarCategoria(producto.getIdCategoria().getNomCategoria());
            listaProductos= pS.buscarNotificacion(producto.getIdNotificacion().getFechaCaducidad());
        }
        return listaProductos;

    }
    @GetMapping("/{id}")
    public Optional<Producto> listarId(@PathVariable("id") Integer id) {
        return pS.listarId(id);
    }
}

