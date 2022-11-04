package pe.edu.upc.EncuentraloFacil.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.EncuentraloFacil.entities.Producto;
import pe.edu.upc.EncuentraloFacil.repositories.ProductoRepository;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.ProductoService;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository pR;

    @Override
    @Transactional
    public boolean insertar(Producto producto) {
        Producto objProducto = pR.save(producto);
        if ( objProducto == null) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    @Transactional
    public void eliminar(int id) {
        pR.deleteById(id);
    }

    @Override
    public Optional<Producto> listarId(int id) {
        return pR.findById(id);
    }

    @Override
    public List<Producto> listar() {
        return pR.findAll();
    }

    @Override
    public List<Producto> buscarProducto(String desProducto) {
        return pR.buscarProducto(desProducto);
    }

    @Override
    public List<Producto> buscarMarca(String marcaProducto) {
        return pR.buscarMarca(marcaProducto);
    }

    @Override
    public List<Producto> buscarVendedor(String nomVendedor) {
        return pR.buscarVendedor(nomVendedor);
    }

    @Override
    public List<Producto> buscarCategoria(String nomCategoria) {
        return pR.buscarCategoria(nomCategoria);
    }

    @Override
    public List<Producto> buscarNotificacion(Date fechaCaducidad) {
        return pR.buscarNotificacion(fechaCaducidad);
    }
}
