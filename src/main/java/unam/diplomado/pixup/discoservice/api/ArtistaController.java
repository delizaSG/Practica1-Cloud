package unam.diplomado.pixup.discoservice.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import unam.diplomado.pixup.discoservice.domain.Artista;
import unam.diplomado.pixup.discoservice.repository.ArtistaRepository;
import unam.diplomado.pixup.discoservice.service.ArtistaService;
// Extra del documento
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path="artistas", produces="application/json")
@CrossOrigin(origins="*")
public class ArtistaController {
	
	@Autowired 
	private ArtistaRepository artistaRepository;
	@Autowired
	private ArtistaService artistaService;
	
	
	@GetMapping
	public Iterable<Artista> obtenerArtistas(){
		return artistaRepository.findAll();
	}
	
	@PostMapping(consumes="application/json")
	public Artista crearArtista(@RequestBody Artista artista)
	{	
		return artistaRepository.save(artista);
	}
	
	
	@GetMapping("{id}")
	public Artista artistaPorId(@PathVariable("id") String id) {
		Optional<Artista> artista = artistaRepository.findById(id);
		if(artista.isPresent()) {
			return artista.get();
		}
		return null;
	}
	
	@PutMapping(path="{id}", consumes="application/json")
    public ResponseEntity<Artista> actualizarArtista(@PathVariable("id") String id, @RequestBody Artista artista){
		Artista artistaActualizado = artistaService.actualizarArtista(id, artista);
		if(artistaActualizado != null) {
			return new ResponseEntity<>(artistaActualizado, HttpStatus.OK);
		}
		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
	
	
	@DeleteMapping("{id}")
	public void eliminarArtista(@PathVariable("id") String id) {
		artistaRepository.deleteById(id);
	}
	
	

}
