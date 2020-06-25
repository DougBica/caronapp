package br.com.caronapp.parada.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class Parada {
	@Id
	private String id;
	
	//private String idUsuario;
	//private String idRota;
	private String email;
	@GeoSpatialIndexed
	private Location location;
	private LocalDateTime hora;
	
	public Parada() {
		
	}
	
	public Parada(ParadaDao paradaDao) {
		String email = JWT.require(Algorithm.HMAC512("deTodosUmSomente".getBytes()))
                .build()
                .verify(paradaDao.getToken())
                .getSubject();
		this.email = email;
		this.location = paradaDao.getLocation();
		this.hora = paradaDao.getHora();
	}
//	public String getIdUsuario() {
//		return idUsuario;
//	}
//	public void setIdUsuario(String idUsuario) {
//		this.idUsuario = idUsuario;
//	}
//	public String getIdRota() {
//		return idRota;
//	}
//	public void setIdRota(String idRota) {
//		this.idRota = idRota;
//	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDateTime getHora() {
		return hora;
	}
	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}
	
	

}
