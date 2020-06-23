package br.com.caronapp.parada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caronapp.parada.entity.Parada;
import br.com.caronapp.parada.repository.ParadaRepository;

@Service
public class ParadaService {
	
	
	@Autowired
	private ParadaRepository paradaRepository;
	
	public void saveParada(Parada parada) {
		paradaRepository.save(parada);
	}
}
