package br.com.caronapp.parada.repository;

import java.util.List;

import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.caronapp.parada.entity.Parada;

public interface ParadaRepository extends MongoRepository<Parada, String>{
	List<Parada> findByLocationNear(Point p, Distance d);
}
