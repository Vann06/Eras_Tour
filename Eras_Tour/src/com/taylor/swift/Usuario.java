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
 * Esta es clase Usuario es para representar 
 * la info del usuario
 * */



import java.util.List;
import java.util.ArrayList;

public class Usuario {
	
	//Propiedades del usuario 
	String nombre = "";
	String email = "";
	int cantBoletos =0;
	double presupuestoMax=0;
	
	//Crear una lista de tickets para cada usuario 
	
	//https://es.stackoverflow.com/questions/463479/lista-de-objetos-en-java
	List<Tickets> ticketxUsuario = new ArrayList<Tickets>();

	

	public List<Tickets> getTicketxUsuario() {
		return ticketxUsuario;
	}



	public void setTicketxUsuario(List<Tickets> ticketxUsuario) {
		this.ticketxUsuario = ticketxUsuario;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getCantBoletos() {
		return cantBoletos;
	}



	public void setCantBoletos(int cantBoletos) {
		this.cantBoletos = cantBoletos;
	}



	public double getPresupuestoMax() {
		return presupuestoMax;
	}



	public void setPresupuestoMax(double presupuestoMax) {
		this.presupuestoMax = presupuestoMax;
	}



	



	
	
	

	public Usuario(String pnombre, String pemail, int pcantBol, double ppresM) {
		// TODO Auto-generated constructor stub
		
		this.nombre = pnombre;
		this.email = pemail;
		this.cantBoletos = pcantBol;
		this.presupuestoMax = ppresM;
		//this.tickets_comprados = new Tickets();
	}

}
