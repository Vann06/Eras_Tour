package com.taylor.swift;
/*
 * POO 2 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 11/08/2023
 * Fecha final: 11/08/2023
 * 
 * Vianka Castro 
 * 23201
 * 
 * Esta es clase Tickets es para almacenar
 * informacion para cada ticket
 * 
 * */


public class Tickets {
	
	//Propiedades del ticket
	int numero =0;
	String nomLocal = "";
	double precio =0.00;
	
	
	
	//Getters y Setters
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getNomLocal() {
		return nomLocal;
	}



	public void setNomLocal(String nomLocal) {
		this.nomLocal = nomLocal;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	
	
	
	public Tickets() {
		// TODO Auto-generated constructor stub
	}

}
