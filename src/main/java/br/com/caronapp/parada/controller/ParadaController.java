package br.com.caronapp.parada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caronapp.parada.entity.Parada;
import br.com.caronapp.parada.service.ParadaService;

@RestController
@RequestMapping("caronapp/")
public class ParadaController {
	
	@Autowired
	private ParadaService paradaService;
	
	@PostMapping("public/parada")
	public void saveParada(@RequestBody Parada parada) {
		paradaService.saveParada(parada);
	}
	
	
}
