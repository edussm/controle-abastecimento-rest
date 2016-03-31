package br.fpu.controle.abastecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fpu.controle.abastecimento.domain.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

}
