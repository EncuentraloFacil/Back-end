package pe.edu.upc.EncuentraloFacil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EncuentraloFacil.entities.Categoria;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.CategoriaService;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService cS;

    @GetMapping
    public List<Categoria> listarCategoria(){
        return cS.list();

    }

    @PostMapping
    public void agregar(@RequestBody Categoria categoria){
         cS.insert(categoria);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Categoria categoria){
        cS.insert(categoria);
    }

    @PostMapping("/buscar")
    public List<Categoria> buscar( @RequestBody Categoria categoria){
        return cS.search(categoria.getNomCategoria());
    }

}


