package pe.edu.upc.EncuentraloFacil.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.EncuentraloFacil.entities.Oferta;
import pe.edu.upc.EncuentraloFacil.repositories.OfertaRepository;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.OfertaService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class OfertaServiceImpl implements OfertaService {

    @Autowired
    private OfertaRepository oR;

    @Override
    @Transactional
    public boolean insertar(Oferta oferta) {
        Oferta objOferta = oR.save(oferta);
        if ( objOferta == null) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    @Transactional
    public void eliminar(int id) {
        oR.deleteById(id);
    }

    @Override
    public Optional<Oferta> listarId(int id) {
        return oR.findById(id);
    }

    @Override
    public List<Oferta> listar() {
        return oR.findAll();
    }

    @Override
    public List<Oferta> buscarOferta(String desOferta) {
        return oR.buscarOferta(desOferta);
    }

    @Override
    public List<Oferta> buscarProducto(String desProducto) {
        return oR.buscarProducto(desProducto);
    }



