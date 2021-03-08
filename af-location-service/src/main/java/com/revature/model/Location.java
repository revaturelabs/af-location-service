package com.revature.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="location_id")
	private int locationId;

	@NotNull
	private String state;

	@NotNull
	private String city;

	@Column(name = "zipcode")
	@NotNull
	private String zipCode;

	@OneToMany(mappedBy = "location")
	private List<Building> buildings;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildings == null) ? 0 : buildings.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + locationId;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + (( zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (buildings == null) {
			if (other.buildings != null)
				return false;
		} else if (!buildings.equals(other.buildings))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (locationId != other.locationId)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", state=" + state + ", city=" + city + ", zipCode=" + zipCode
				+ ", buildings=" + buildings + "]";
	}

}
