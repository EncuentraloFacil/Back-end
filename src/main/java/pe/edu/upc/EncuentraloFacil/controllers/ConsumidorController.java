package pe.edu.upc.EncuentraloFacil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.EncuentraloFacil.entities.Consumidor;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.ConsumidorService;

@RestController
@RequestMapping("/consumidor")
public class ConsumidorController {
	@Autowired
	private ConsumidorService cS;
	
	
	@PostMapping
	public void insertar(@RequestBody Consumidor consumidor) {
		cS.insert(consumidor);
	}
	
	@GetMapping
	public List<Consumidor> listarConsumidor(){
		return cS.list();
	}


	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		cS.delete(id);
	}

	@PutMapping
	public void modificar(@RequestBody Consumidor consumidor){
		cS.insert(consumidor);
	}

	@PostMapping("/buscar")
	public List<Consumidor> buscar( @RequestBody Consumidor consumidor){
		return cS.search(consumidor.getNomConsumidor());
	}
}
