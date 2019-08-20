package br.senac.rj.produtor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.rj.produtor.domain.Fabricante;

public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {

}
