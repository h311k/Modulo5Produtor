package br.senac.rj.produtor.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.senac.rj.produtor.domain.Bloco;
import br.senac.rj.produtor.service.BlocoService;

@RestController
@RequestMapping("/drag-bloco")
public class BlocoController extends BaseController<BlocoService> {

	@GetMapping("/getcor")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCor() throws JsonProcessingException {
		return mapper.writeValueAsString(service.listAll().get(0));
	}
	
	@PostMapping("/setcor")
	@Consumes(MediaType.APPLICATION_JSON)
	public void setCor(@RequestBody Bloco bloco) {
		service.atualiza(bloco);
	}
}
