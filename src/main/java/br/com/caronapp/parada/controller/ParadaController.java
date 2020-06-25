package br.com.caronapp.parada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caronapp.parada.entity.Location;
import br.com.caronapp.parada.entity.Parada;
import br.com.caronapp.parada.entity.ParadaDao;
import br.com.caronapp.parada.service.ParadaService;

@RestController
@RequestMapping("caronapp/")
public class ParadaController {
	
	@Autowired
	private ParadaService paradaService;
	
	@PostMapping("public/parada")
	public Parada saveParada(@RequestBody ParadaDao parada) {
		return paradaService.saveParada(parada);
	}
	
	@PostMapping("public/paradas")
	public List<Parada> listarParadasPosicao(@RequestBody Location location) {
		List<Parada> par = paradaService.listarPorPosicao(location);
		return par;
	}
	
	
	
}
