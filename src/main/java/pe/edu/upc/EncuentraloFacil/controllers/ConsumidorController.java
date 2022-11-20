package pe.edu.upc.EncuentraloFacil.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.EncuentraloFacil.entities.Consumidor;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.ConsumidorService;

@RestController
@RequestMapping("/consumidor")
@CrossOrigin("http://localhost:4200/")
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

	public List<Consumidor> buscar( @RequestBody String consumidor) {
		List<Consumidor> listaconsumidor= new ArrayList<>();
		if(consumidor.length()>0) {
			listaconsumidor=cS.search(consumidor);


		}else{
			listaconsumidor= cS.list();
		}
		return listaconsumidor;

	
	}

	@GetMapping("/{id}")
	public Optional<Consumidor> listarId(@PathVariable("id") Integer id) {
		return cS.listarId(id);
	}

}
