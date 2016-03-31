package br.fpu.controle.abastecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fpu.controle.abastecimento.domain.Posto;

public interface PostoRepository extends JpaRepository<Posto, Long>{

}
