package br.senac.rj.produtor.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.rj.produtor.domain.Carro;

public interface CarroRepository extends JpaRepository<Carro,Integer> {

	List<Carro> findAllByDataFabricacaoBetween(Date dataInicial, Date dataFinal);
	
}
