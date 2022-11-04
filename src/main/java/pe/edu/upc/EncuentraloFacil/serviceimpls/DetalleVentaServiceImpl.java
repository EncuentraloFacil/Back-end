package pe.edu.upc.EncuentraloFacil.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.EncuentraloFacil.entities.DetalleVenta;
import pe.edu.upc.EncuentraloFacil.repositories.DetalleVentaRepository;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.DetalleVentaService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class DetalleVentaServiceImpl implements DetalleVentaService {

    @Autowired
    private DetalleVentaRepository dvR;

    @Override
    @Transactional
    public boolean insertar(DetalleVenta venta) {
        DetalleVenta objDV = dvR.save(venta);
        if ( objDV== null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int id) {
        dvR.deleteById(id);
    }

    @Override
    public Optional<DetalleVenta> listarId(int id) {
        return dvR.findById(id);
    }

    @Override
    public List<DetalleVenta> listar() {
        return dvR.findAll();
    }

    @Override
    public List<DetalleVenta> buscarDetalleVenta(int id) {
        return dvR.buscarDetalleV(id);
    }

    @Override
    public List<DetalleVenta> buscarOfertas(String desOferta) {
        return dvR.buscarOfertas(desOferta);
    }




}
