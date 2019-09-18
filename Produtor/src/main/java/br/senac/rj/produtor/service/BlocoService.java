package br.senac.rj.produtor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.rj.produtor.domain.Bloco;
import br.senac.rj.produtor.repository.BlocoRepository;

@Service
public class BlocoService {

	@Autowired
	BlocoRepository repository;
	
	public List<Bloco> listAll() {
		return repository.findAll();
	}
	
	public void atualiza(Bloco bloco) {
		repository.save(bloco);
	}
}
