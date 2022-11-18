package pe.edu.upc.EncuentraloFacil.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.EncuentraloFacil.entities.Donacion;
import pe.edu.upc.EncuentraloFacil.entities.RespuestaOne;
import pe.edu.upc.EncuentraloFacil.repositories.DonacionRepository;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.DonacionService;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class DonacionServiceImpl implements DonacionService {

    @Autowired
    private DonacionRepository dR;

    @Override
    @Transactional
    public boolean insertar(Donacion donacion) {
        Donacion objDona= dR.save(donacion);
        if ( objDona == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int id) {
        dR.deleteById(id);
    }

    @Override
    public Optional<Donacion> listaId(int id) {
        return dR.findById(id);
    }

    @Override
    public List<Donacion> listar() {
        return dR.findAll();
    }

    @Override
    public List<Donacion> buscarProducto(String desProducto) {
        return dR.buscarProducto(desProducto);
    }

    @Override
    public List<Donacion> buscarDonacion(String nomDonar) {
        return dR.buscarDonacion(nomDonar);
    }

    @Override
    public List<Donacion> buscarDireccion(String direccion) {
        return dR.buscarDireccion(direccion);
    }

    @Override
    public List<RespuestaOne> buscarMarcaProducto() {
        List<RespuestaOne> lista=new ArrayList<>();
        dR.buscarMarcaProducto().forEach(
                y->{
                    RespuestaOne r= new RespuestaOne();
                    r.setMarca(y[0]);
                    r.setCantidad(y[1]);
                    lista.add(r);
                }
        );
        return lista;
    }
}
