package pe.edu.upc.EncuentraloFacil.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EncuentraloFacil.entities.Notificacion;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.NotificacionService;

@RestController
@RequestMapping("/notificacion")
@CrossOrigin("http://localhost:4200/")
public class NotificacionController {
	
	@Autowired
	private NotificacionService nS;
	
	@PostMapping
	public void insertar(@RequestBody Notificacion notificacion ) {
		nS.insert(notificacion);
	}
	
	@GetMapping
	public List<Notificacion> listar(){
		return nS.list();
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		nS.delete(id);
	}

	@PutMapping
	public void modificar(@RequestBody Notificacion notificacion){
		nS.insert(notificacion);
	}
	@PostMapping("/buscar")

	public List<Notificacion> buscar( @RequestBody Date fecha){

		return nS.buscar(fecha);
	}

	@GetMapping("/{id}")
	public Optional<Notificacion> listarId(@PathVariable("id") Integer id) {
		return nS.listarId(id);
	}

	@GetMapping("/buscarFecha")
	public List<Notificacion> buscarFecha(){
		return nS.buscarFecha();
	}
}
