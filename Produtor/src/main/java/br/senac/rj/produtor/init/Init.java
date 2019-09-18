package br.senac.rj.produtor.init;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.senac.rj.produtor.domain.Acessorio;
import br.senac.rj.produtor.domain.Bloco;
import br.senac.rj.produtor.domain.Carro;
import br.senac.rj.produtor.domain.Chave;
import br.senac.rj.produtor.domain.Documento;
import br.senac.rj.produtor.domain.Fabricante;
import br.senac.rj.produtor.domain.Motorista;
import br.senac.rj.produtor.repository.AcessorioRepository;
import br.senac.rj.produtor.repository.BlocoRepository;
import br.senac.rj.produtor.repository.CarroRepository;
import br.senac.rj.produtor.repository.ChaveRepository;
import br.senac.rj.produtor.repository.DocumentoRepository;
import br.senac.rj.produtor.repository.FabricanteRepository;
import br.senac.rj.produtor.repository.MotoristaRepository;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	FabricanteRepository fabricanteRepository;
	
	@Autowired
	MotoristaRepository motoristaRepository;
	
	@Autowired
	CarroRepository carroRepository;
	
	@Autowired
	DocumentoRepository documentoRepository;
	
	@Autowired
	ChaveRepository chaveRepository;
	
	@Autowired
	AcessorioRepository acessorioRepository;
	
	@Autowired
	BlocoRepository blocoRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<Fabricante> fabricantes = new ArrayList<>();
		List<Motorista> motoristas = new ArrayList<>();
		List<Carro> carros = new ArrayList<>();
		List<Documento> documentos = new ArrayList<>();
		List<Chave> chaves = new ArrayList<>();
		List<Acessorio> acessorios = new ArrayList<>();
		
		
		Fabricante fabricante = new Fabricante();
		fabricante.setNome("FIAT");
		fabricantes.add(fabricante);
		fabricante = new Fabricante();
		fabricante.setNome("FORD");
		fabricantes.add(fabricante);
		fabricante = new Fabricante();
		fabricante.setNome("CHEVROLET");
		fabricantes.add(fabricante);
		fabricante = new Fabricante();
		fabricante.setNome("VOLKSWAGEN");
		fabricantes.add(fabricante);
		fabricante = new Fabricante();
		fabricante.setNome("RENAULT");
		fabricantes.add(fabricante);
		fabricante.setNome("NISSAN");		
		fabricantes.add(fabricante);
		fabricanteRepository.saveAll(fabricantes);
		
		Motorista motorista = new Motorista();
		motorista.setNome("Marcelo");
		motoristas.add(motorista);
		motorista = new Motorista();
		motorista.setNome("Filipe");		
		motoristas.add(motorista);
		motorista = new Motorista();
		motorista.setNome("Johnny");		
		motoristas.add(motorista);
		motorista = new Motorista();
		motorista.setNome("Roberto");		
		motoristas.add(motorista);
		motorista = new Motorista();
		motorista.setNome("Lauro");		
		motoristas.add(motorista);
		motorista = new Motorista();
		motorista.setNome("Cleiton");
		motoristas.add(motorista);
		motoristaRepository.saveAll(motoristas);
		
		Documento documento;
		for (int i=0; i <= 5; i++) {
			documento = new Documento();
			Random random = new Random();
			documento.setNumero(String.valueOf(random.nextInt(10000)));
			documentos.add(documento);
		}
		documentoRepository.saveAll(documentos);
		
		Chave chave;
		for (int i=0; i <= 5; i++) {
			chave = new Chave();
			Random random = new Random();
			chave.setCodigoChave(String.valueOf(random.nextInt(10000)));
			chaves.add(chave);
		}
		chaveRepository.saveAll(chaves);
		
		Acessorio acessorio = new Acessorio();
		acessorio.setNome("Vidro Elétrico");
		acessorios.add(acessorio);
		acessorio = new Acessorio();
		acessorio.setNome("Travas Elétricas");
		acessorios.add(acessorio);
		acessorio = new Acessorio();
		acessorio.setNome("Ar condicionado");
		acessorios.add(acessorio);
		acessorio = new Acessorio();
		acessorio.setNome("Direção hidráulica");
		acessorios.add(acessorio);
		acessorio = new Acessorio();
		acessorio.setNome("Radio touch");
		acessorios.add(acessorio);
		acessorio = new Acessorio();
		acessorio.setNome("GPS integrado");
		acessorios.add(acessorio);
		acessorio = new Acessorio();
		acessorio.setNome("Rodas de liga leve");
		acessorios.add(acessorio);
		acessorioRepository.saveAll(acessorios);
		
		Carro carro = new Carro();
		carro.setFabricante(fabricantes.get(0));
		carro.setMotorista(motoristas.get(0));
		carro.setDocumento(documentos.get(0));
		carro.setChave(chaves.get(0));
		carro.setNome("Linea");
		carro.setAcessorios(new ArrayList<Acessorio>());
		carro.getAcessorios().add(acessorios.get(0));
		carro.getAcessorios().add(acessorios.get(3));
		carro.getAcessorios().add(acessorios.get(4));
		carros.add(carro);
		carro = new Carro();
		carro.setFabricante(fabricantes.get(1));
		carro.setMotorista(motoristas.get(1));
		carro.setDocumento(documentos.get(1));
		carro.setChave(chaves.get(1));
		carro.setNome("Focus");
		carro.setAcessorios(new ArrayList<Acessorio>());
		carro.getAcessorios().add(acessorios.get(0));
		carro.getAcessorios().add(acessorios.get(1));
		carro.getAcessorios().add(acessorios.get(3));
		carro.getAcessorios().add(acessorios.get(4));
		carros.add(carro);
		carro = new Carro();
		carro.setFabricante(fabricantes.get(2));
		carro.setMotorista(motoristas.get(2));
		carro.setDocumento(documentos.get(2));
		carro.setChave(chaves.get(2));
		carro.setNome("Cobalt");
		carro.setAcessorios(new ArrayList<Acessorio>());
		carro.getAcessorios().add(acessorios.get(2));
		carro.getAcessorios().add(acessorios.get(3));
		carro.getAcessorios().add(acessorios.get(4));
		carro.getAcessorios().add(acessorios.get(5));
		carros.add(carro);
		carro = new Carro();
		carro.setFabricante(fabricantes.get(3));
		carro.setMotorista(motoristas.get(3));
		carro.setDocumento(documentos.get(3));
		carro.setChave(chaves.get(3));
		carro.setNome("Polo");
		carro.setAcessorios(new ArrayList<Acessorio>());
		carro.getAcessorios().add(acessorios.get(0));
		carro.getAcessorios().add(acessorios.get(1));
		carro.getAcessorios().add(acessorios.get(3));
		carro.getAcessorios().add(acessorios.get(4));
		carros.add(carro);
		carro = new Carro();
		carro.setFabricante(fabricantes.get(4));
		carro.setMotorista(motoristas.get(4));
		carro.setDocumento(documentos.get(4));
		carro.setChave(chaves.get(4));
		carro.setNome("Sandero");
		carro.setAcessorios(new ArrayList<Acessorio>());
		carro.getAcessorios().add(acessorios.get(0));
		carro.getAcessorios().add(acessorios.get(1));
		carros.add(carro);
		carro = new Carro();
		carro.setFabricante(fabricantes.get(5));
		carro.setMotorista(motoristas.get(5));
		carro.setDocumento(documentos.get(5));
		carro.setChave(chaves.get(5));
		carro.setNome("Versa");
		carro.setAcessorios(new ArrayList<Acessorio>());
		carro.getAcessorios().add(acessorios.get(2));
		carros.add(carro);
		carroRepository.saveAll(carros);
		
		Bloco bloco = new Bloco();
		bloco.setCor("verde");
		blocoRepository.save(bloco);
		
	}

	
}
