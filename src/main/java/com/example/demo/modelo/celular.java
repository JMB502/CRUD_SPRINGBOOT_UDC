package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="celular")

public class celular {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String modelo;
private String marca;
private String imei;

public celular() {

	
	
	}

public celular(int id, String modelo, String marca, String imei) {
	super();
	this.id = id;
	this.modelo = modelo;
	this.marca = marca;
	this.imei = imei;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getImei() {
	return imei;
}

public void setImei(String imei) {
	this.imei = imei;
}	

}
