package br.com.caronapp.parada.entity;

import java.math.BigDecimal;
import java.util.List;

public class Location {

	private List<BigDecimal> coordinates;
	private String type = "Point";

	public List<BigDecimal> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<BigDecimal> coordinates) {
		this.coordinates = coordinates;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
