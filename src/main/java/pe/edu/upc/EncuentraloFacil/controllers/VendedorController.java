package pe.edu.upc.EncuentraloFacil.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.EncuentraloFacil.entities.Vendedor;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.VendedorService;

@RestController
@RequestMapping("/vendedor")
@CrossOrigin("http://localhost:4200/")
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

	@GetMapping("/{id}")
	public Optional<Vendedor> listarId(@PathVariable("id") Integer id) {
		return vS.listarId(id);
	}

}
