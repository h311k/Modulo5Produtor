package br.senac.rj.produtor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.rj.produtor.domain.Motorista;

public interface MotoristaRepository extends JpaRepository<Motorista,Integer> {

}
