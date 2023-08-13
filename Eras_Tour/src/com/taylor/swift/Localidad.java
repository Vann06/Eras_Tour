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
 * Esta es clase Localidad es para guardar
 * informacion para cada local
 * 
 * */


public class Localidad {
	//Propiedades del local 
	String loc1 = "1";
	String loc2 = "5";
	String loc3 = "10";
	
	double precioLoc1 = 100.00;
	double precioLoc2 = 500.00;
	double precioLoc3 = 1000.00;
	
	int disponibilidadLoc1 = 20;
	int disponibilidadLoc2 = 20;
	int disponibilidadLoc3 = 20;
	
	
	//Getters y Setters
	public String getLoc1() {
		return loc1;
	}

	public void setLoc1(String loc1) {
		this.loc1 = loc1;
	}

	public String getLoc2() {
		return loc2;
	}

	public void setLoc2(String loc2) {
		this.loc2 = loc2;
	}

	public String getLoc3() {
		return loc3;
	}

	public void setLoc3(String loc3) {
		this.loc3 = loc3;
	}

	public double getPrecioLoc1() {
		return precioLoc1;
	}

	public void setPrecioLoc1(double precioLoc1) {
		this.precioLoc1 = precioLoc1;
	}

	public double getPrecioLoc2() {
		return precioLoc2;
	}

	public void setPrecioLoc2(double precioLoc2) {
		this.precioLoc2 = precioLoc2;
	}

	public double getPrecioLoc3() {
		return precioLoc3;
	}

	public void setPrecioLoc3(double precioLoc3) {
		this.precioLoc3 = precioLoc3;
	}

	public int getDisponibilidadLoc1() {
		return disponibilidadLoc1;
	}

	public void setDisponibilidadLoc1(int disponibilidadLoc1) {
		this.disponibilidadLoc1 = disponibilidadLoc1;
	}

	public int getDisponibilidadLoc2() {
		return disponibilidadLoc2;
	}

	public void setDisponibilidadLoc2(int disponibilidadLoc2) {
		this.disponibilidadLoc2 = disponibilidadLoc2;
	}

	public int getDisponibilidadLoc3() {
		return disponibilidadLoc3;
	}

	public void setDisponibilidadLoc3(int disponibilidadLoc3) {
		this.disponibilidadLoc3 = disponibilidadLoc3;
	}

	

	public Localidad() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Se van restando la cantidad por cada ticket comprado 
	public void setReservaLocalidad(String plocalidad) {
		if (plocalidad.equals(loc1)) {
			this.disponibilidadLoc1 --;
		}
		if (plocalidad.equals(loc2)) {
			this.disponibilidadLoc2 --;
		}
		if (plocalidad.equals(loc3)) {
			this.disponibilidadLoc3 --;
		}
		
		
	}

}
