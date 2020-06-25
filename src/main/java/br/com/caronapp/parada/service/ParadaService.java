package br.com.caronapp.parada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import br.com.caronapp.parada.entity.Location;
import br.com.caronapp.parada.entity.Parada;
import br.com.caronapp.parada.entity.ParadaDao;
import br.com.caronapp.parada.repository.ParadaRepository;

@Service
public class ParadaService {
	
	
	@Autowired
	private ParadaRepository paradaRepository;
	
	public Parada saveParada(ParadaDao parada) {
		
		return paradaRepository.save(new Parada(parada));
	}
	
	public List<Parada> listarPorPosicao(Location loc){
		Point ponto = new Point(loc.getCoordinates().get(0),loc.getCoordinates().get(1));
		return paradaRepository.findByLocationNear(ponto, new Distance(2, Metrics.KILOMETERS));
	}
}
