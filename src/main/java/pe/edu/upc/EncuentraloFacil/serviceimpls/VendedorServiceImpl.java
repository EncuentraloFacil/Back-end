package pe.edu.upc.EncuentraloFacil.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EncuentraloFacil.entities.Vendedor;
import pe.edu.upc.EncuentraloFacil.repositories.VendedorRepository;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.VendedorService;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorServiceImpl implements VendedorService {
    @Autowired
    private VendedorRepository vR;


    @Override
    public void insert(Vendedor vendedor) {
        vR.save(vendedor);
    }

    @Override
    public List<Vendedor> list() {
        return vR.findAll();
    }

    @Override
    public void delete(int id) {
        vR.deleteById(id);
    }

    @Override
    public List<Vendedor> search(String nomVendedor) {
        return vR.buscarVendedor(nomVendedor);
    }

    @Override
    public Optional<Vendedor> listarId(int idVendedor) {
        return vR.findById(idVendedor);
    }
}
