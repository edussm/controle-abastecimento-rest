package br.fpu.controle.abastecimento;

import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.fpu.controle.abastecimento.domain.Abastecimento;
import br.fpu.controle.abastecimento.domain.Combustivel;
import br.fpu.controle.abastecimento.domain.Consumidor;
import br.fpu.controle.abastecimento.domain.Posto;
import br.fpu.controle.abastecimento.domain.Veiculo;
import br.fpu.controle.abastecimento.repository.AbastecimentoRepository;
import br.fpu.controle.abastecimento.repository.CombustivelRepository;
import br.fpu.controle.abastecimento.repository.ConsumidorRepository;
import br.fpu.controle.abastecimento.repository.PostoRepository;
import br.fpu.controle.abastecimento.repository.VeiculoRepository;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        CombustivelRepository combustivelRepository = ctx.getBean(CombustivelRepository.class);
        PostoRepository postoRepository = ctx.getBean(PostoRepository.class);
        ConsumidorRepository consumidorRepository = ctx.getBean(ConsumidorRepository.class);
        VeiculoRepository veiculoRepository = ctx.getBean(VeiculoRepository.class);
        AbastecimentoRepository abastecimentoRepository = ctx.getBean(AbastecimentoRepository.class);
        
        Combustivel gasolina = new Combustivel();
        gasolina.setNome("Gasolina");
        
        Combustivel etanol = new Combustivel();
        etanol.setNome("Etanol");
        
        Combustivel diesel = new Combustivel();
        diesel.setNome("Diesel");

        combustivelRepository.save(gasolina);
        combustivelRepository.save(etanol);
        combustivelRepository.save(diesel);
        
        List<Combustivel> combustiveis = combustivelRepository.findAll();
        
        System.out.println(combustiveis);
        
        Posto posto = new Posto();
        posto.setCombustiveis(combustiveis);
        posto.setNome("Posto Teste 1");

        Posto postoSalvo = postoRepository.save(posto);
        
        System.out.println(postoSalvo);
        
        Consumidor consumidor = new Consumidor();
        consumidor.setNome("Eduardo");
        consumidor.setSobrenome("Santos");
        consumidor.setEmail("eduardo.souza@facpoli.edu.br");
        
        if(!consumidorRepository.exists(consumidor.getEmail())) {
        	consumidorRepository.save(consumidor);
        }

        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca("AAA-1234");
        veiculo.setProprietario(consumidor);
        
        Veiculo veiculoSalvo = veiculoRepository.save(veiculo);
        
        System.out.println(veiculoSalvo);
        
        Abastecimento abastecimento = new Abastecimento();
        abastecimento.setData(new Date());
        abastecimento.setKilometragem(10000L);
        abastecimento.setPosto(postoSalvo);
        abastecimento.setVeiculo(veiculoSalvo);
        abastecimento.setTanqueCheio(true);
        abastecimento.setCombustivel(combustiveis.get(1));
        abastecimento.setLitrosCombustivel(50.0);
        abastecimento.setPrecoLitro(3.85);
        
        abastecimentoRepository.save(abastecimento);
        
        System.out.println(abastecimentoRepository.findAll());
        
    }
}
