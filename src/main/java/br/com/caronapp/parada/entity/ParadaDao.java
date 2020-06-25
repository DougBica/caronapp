package br.com.caronapp.parada.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ParadaDao implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4142979943234566160L;
	private String token;
	private LocalDateTime hora;
	private Location location;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public LocalDateTime getHora() {
		return hora;
	}
	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
