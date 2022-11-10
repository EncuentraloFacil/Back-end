package pe.edu.upc.EncuentraloFacil.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EncuentraloFacil.entities.Consumidor;
import pe.edu.upc.EncuentraloFacil.repositories.ConsumidorRepository;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.ConsumidorService;

import java.util.List;
import java.util.Optional;

@Service
public class ConsumidorServiceImpl implements ConsumidorService {

    @Autowired
   private ConsumidorRepository cR;

    @Override
    public void insert(Consumidor consumidor) {
        cR.save(consumidor);
    }

    @Override
    public List<Consumidor> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public List<Consumidor> search(String nomConsumidor) {
        return cR.buscarConsumidor(nomConsumidor);
    }

    @Override
    public Optional<Consumidor> listarId(int idConsumidor) {
        return cR.findById(idConsumidor);
    }
}
