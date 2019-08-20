package br.senac.rj.produtor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.rj.produtor.domain.Motorista;
import br.senac.rj.produtor.repository.MotoristaRepository;

@Service
public class MotoristaService {

	@Autowired 
	MotoristaRepository repository;
	
	public void insere(Motorista motorista) {
		motorista.setId(null);
		repository.save(motorista);
	}
	
	public List<Motorista> listAll() {
		return repository.findAll();
	}
	
}
