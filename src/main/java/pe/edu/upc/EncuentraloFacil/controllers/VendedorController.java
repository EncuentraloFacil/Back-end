package pe.edu.upc.EncuentraloFacil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.EncuentraloFacil.entities.Vendedor;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.VendedorService;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
	
	@Autowired
	private VendedorService vS;
	
	@PostMapping
	public void insertar(@RequestBody Vendedor vendedor) {
		vS.insert(vendedor);
	}
	
	@GetMapping
	public List<Vendedor> listar(){
		return vS.list();
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		vS.delete(id);
	}

	@PutMapping
	public void modificar(@RequestBody Vendedor vendedor){
		vS.insert(vendedor);
	}

	@PostMapping("/buscar")
	public List<Vendedor> buscar( @RequestBody Vendedor v){
		return vS.search(v.getNomVendedor());
	}
}
