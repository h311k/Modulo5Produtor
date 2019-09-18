package br.senac.rj.produtor.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.senac.rj.produtor.service.CarroService;

@RestController
@RequestMapping("/carro")
public class CarroController extends BaseController<CarroService> {

	@GetMapping("/lista")
	@Produces(MediaType.APPLICATION_JSON)
	public String listAll() throws JsonProcessingException {
		return mapper.writeValueAsString(service.listAll());
	}
	
	@GetMapping("/listaxml")
	@Produces(MediaType.APPLICATION_XML)
	public String listAllAsXML() throws JsonProcessingException {
		return xmlMapper.writeValueAsString(service.listAll());
	}
	
	@GetMapping("/listapordatafabricacao")
	@Produces(MediaType.APPLICATION_JSON)
	public String listAllByDataFabricacao(@RequestParam String dataInicial, @RequestParam String dataFinal) throws JsonProcessingException {
		return mapper.writeValueAsString(service.listPorDataFabricacao(dataInicial, dataFinal));
	}
	
}
