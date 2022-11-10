package pe.edu.upc.EncuentraloFacil.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.EncuentraloFacil.entities.Factura;
import pe.edu.upc.EncuentraloFacil.entities.Oferta;
import pe.edu.upc.EncuentraloFacil.repositories.FacturaRepository;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.FacturaService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository fR;

    @Override
    @Transactional
    public boolean insertar(Factura factura) {
        Factura objFactura = fR.save(factura);
        if ( objFactura == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int id) {
        fR.deleteById(id);
    }

    @Override
    public Optional<Factura> listarId(int id) {
        return  fR.findById(id);
    }

    @Override
    public List<Factura> listar() {
        return fR.findAll();
    }

    @Override
    public List<Factura> buscarFactura(int id) {
        return fR.buscarFactura(id);
    }

    @Override
    public List<Factura> buscarConsumidor(String nomConsumidor) {
        return fR.buscarConsumidor(nomConsumidor);
    }
}
