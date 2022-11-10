package pe.edu.upc.EncuentraloFacil.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.EncuentraloFacil.entities.Reporte;
import pe.edu.upc.EncuentraloFacil.repositories.ReporteRepository;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.ReporteService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class ReporteServiceImpl implements ReporteService {

    @Autowired
    private ReporteRepository rR;

    @Override
    @Transactional
    public boolean insertar(Reporte reporte) {
        Reporte objReporte = rR.save(reporte);
        if ( objReporte == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int id) {
        rR.deleteById(id);
    }

    @Override
    public Optional<Reporte> listarId(int id) {
        return rR.findById(id);
    }

    @Override
    public List<Reporte> listar() {
        return rR.findAll();
    }

    @Override
    public List<Reporte> buscarReporte(String desReporte) {
        return rR.buscarReporte(desReporte);
    }

    @Override
    public List<Reporte> buscarConsumidor(String nomConsumidor) {
        return rR.buscarConsumidor(nomConsumidor);
    }

    @Override
    public List<Reporte> buscarVendedor(String nomVendedor) {
        return rR.buscarVendedor(nomVendedor);
    }
}
