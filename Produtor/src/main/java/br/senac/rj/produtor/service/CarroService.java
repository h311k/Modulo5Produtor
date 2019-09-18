package br.senac.rj.produtor.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	
	public List<Carro> listPorDataFabricacao(String dataInicial, String dataFinal) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return repository.findAllByDataFabricacaoBetween(sdf.parse(dataInicial), sdf.parse(dataFinal));
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
