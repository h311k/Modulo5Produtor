package br.senac.rj.produtor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.rj.produtor.domain.Chave;

public interface ChaveRepository extends JpaRepository<Chave,Integer>{

}
