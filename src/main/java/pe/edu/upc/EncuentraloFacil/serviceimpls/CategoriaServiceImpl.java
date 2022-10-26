package pe.edu.upc.EncuentraloFacil.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.EncuentraloFacil.entities.Categoria;
import pe.edu.upc.EncuentraloFacil.repositories.CategoriaRepository;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.CategoriaService;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository cR;

    @Override
    public void insert(Categoria categoria) {
    cR.save(categoria);
    }

    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCategoria) {
        cR.deleteById(idCategoria);
    }

    @Override
    public List<Categoria> search(String nomCategoria) {
        return cR.buscarCategoria(nomCategoria);
    }
}
