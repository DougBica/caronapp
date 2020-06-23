package br.com.caronapp.parada.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.caronapp.parada.entity.Parada;

public interface ParadaRepository extends MongoRepository<Parada, String>{

}
