package unam.diplomado.pixup.discoservice.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import unam.diplomado.pixup.discoservice.domain.Artista;

@RequestMapping(path="api/artistas", produces="application/json")
@CrossOrigin(origins="*")
@Tag(name="artista", description = "API del Recurso Artista")
public interface ArtistaApi {
	@Operation(summary = "Crear Artista")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "201", 
		description = "Artista Creado Exitosamente", 
	    content = { 
	    	@Content(mediaType="application/json", 
	    	schema = @Schema(implementation=Artista.class)) }),
	   })
	
	@PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
	Artista crearArtista(@RequestBody Artista artista);
	
}
