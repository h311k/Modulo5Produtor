package br.senac.rj.produtor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.rj.produtor.domain.Carro;

public interface CarroRepository extends JpaRepository<Carro,Integer> {

}
