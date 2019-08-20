package br.senac.rj.produtor.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.senac.rj.produtor.service.FabricanteService;

@RestController
@RequestMapping("/fabricante")
public class FabricanteController extends BaseController<FabricanteService>{

	@GetMapping("/lista")
	@Produces(MediaType.APPLICATION_JSON)
	public String listAll() throws JsonProcessingException {
		return mapper.writeValueAsString(service.listAll());
	}
	
}
