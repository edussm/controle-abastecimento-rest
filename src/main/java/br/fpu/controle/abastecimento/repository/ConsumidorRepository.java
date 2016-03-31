package br.fpu.controle.abastecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fpu.controle.abastecimento.domain.Consumidor;

public interface ConsumidorRepository extends JpaRepository<Consumidor, String>{

}
