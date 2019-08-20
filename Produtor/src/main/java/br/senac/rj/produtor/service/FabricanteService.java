package br.senac.rj.produtor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.rj.produtor.domain.Fabricante;
import br.senac.rj.produtor.repository.FabricanteRepository;

@Service
public class FabricanteService {

	@Autowired 
	FabricanteRepository repository;
	
	public void insere(Fabricante fabricante) {
		fabricante.setId(null);
		repository.save(fabricante);
	}
	
	public List<Fabricante> listAll() {
		return repository.findAll();
	}
	
}
