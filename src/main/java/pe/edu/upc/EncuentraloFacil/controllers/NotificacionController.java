package pe.edu.upc.EncuentraloFacil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.EncuentraloFacil.entities.Notificacion;
import pe.edu.upc.EncuentraloFacil.serviceinterfaces.NotificacionService;

@RestController
@RequestMapping("/notificacion")
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
	public List<Notificacion> buscar( @RequestBody Notificacion notificacion){
		return nS.buscar(notificacion.getFechaCaducidad());
	}

}
