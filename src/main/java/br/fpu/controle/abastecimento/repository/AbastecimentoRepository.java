package br.fpu.controle.abastecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fpu.controle.abastecimento.domain.Abastecimento;

public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Long>{

}
