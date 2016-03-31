package br.fpu.controle.abastecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fpu.controle.abastecimento.domain.Combustivel;

public interface CombustivelRepository extends JpaRepository<Combustivel, Long>{

}
