package com.backbase.assignment.ingatms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author kamil.saib - Used NESTED class for conciseness and demo purposes, but
 *         for sake of code readability and very difficult bug I once
 *         encountered with NESTED classes, I would always recommend distinct
 *         classes.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Atm {

	public Atm() {
		// TODO Auto-generated constructor stub
	}

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public class Address {
		private String street;
		private String housenumber;
		private String postalcode;
		private String city;
		private Integer distance;
		private String type;

		public Address() {
			// TODO Auto-generated constructor stub
		}

		private GeoLocation geoLocation;

		public GeoLocation getGeoLocation() {
			return geoLocation;
		}

		public void setGeoLocation(GeoLocation geoLocation) {
			this.geoLocation = geoLocation;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getHousenumber() {
			return housenumber;
		}

		public void setHousenumber(String housenumber) {
			this.housenumber = housenumber;
		}

		public String getPostalcode() {
			return postalcode;
		}

		public void setPostalcode(String postalcode) {
			this.postalcode = postalcode;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public Integer getDistance() {
			return distance;
		}

		public void setDistance(Integer distance) {
			this.distance = distance;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		private class GeoLocation {
			private double lat;
			private double lng;

			public double getLat() {
				return lat;
			}

			public void setLat(double lat) {
				this.lat = lat;
			}

			public double getLng() {
				return lng;
			}

			public void setLng(double lng) {
				this.lng = lng;
			}

			public GeoLocation() {
				// TODO Auto-generated constructor stub
			}
		}
	}
}
