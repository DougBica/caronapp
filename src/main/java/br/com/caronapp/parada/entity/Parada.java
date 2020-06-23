package br.com.caronapp.parada.entity;

import org.springframework.data.annotation.Id;

public class Parada {
	@Id
	private String id;
	
	private String idUsuario;
	private String idRota;
	private Location location;
	
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getIdRota() {
		return idRota;
	}
	public void setIdRota(String idRota) {
		this.idRota = idRota;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
