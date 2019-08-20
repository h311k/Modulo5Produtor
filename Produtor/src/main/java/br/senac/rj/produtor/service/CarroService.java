package br.senac.rj.produtor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.rj.produtor.domain.Carro;
import br.senac.rj.produtor.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	CarroRepository repository;
	
	public void insere(Carro carro) {
		carro.setId(null);
		repository.save(carro);
	}
	
	public List<Carro> listAll() {
		return repository.findAll();
	}
	
}
