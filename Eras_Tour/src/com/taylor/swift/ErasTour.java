package com.taylor.swift;
/*
 * POO 2 Semestre
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Fecha inicio: 11/08/2023
 * Fecha final: 13/08/2023
 * 
 * Vianka Castro 
 * 23201
 * 
 * Esta es clase ErasTour es para 
 * validar y crear funciones del programa
 * 
 * */


import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ErasTour {

	
	//Se genera un numero aleatorio dentro del min y el max
	public static int generarTicketAleatorio() {
		Random random = new Random();
		int minimo = 1;
		int maximo = 15000;
		return (int)(random.nextInt(maximo)+ minimo);  
		
	}
	
	//Se genera otro numero aleatorio 
	public static int generarTicketAleatorio(int pminimo) {
		Random random = new Random();
		//int minimo = 1;
		int maximo = 15000;
		return (int)(random.nextInt(maximo)+ pminimo);  
		
	}
	
	//Se evalua si puede comprar el boleto o no si esta dentro del rango 
	public static boolean puedeComprarBoletos(int pnum) {
		
		int min = generarTicketAleatorio();
		int max = generarTicketAleatorio(min);
		
		if (pnum > min && pnum < max) { return true; }
		else { return false;}
		
		
	}
	
	//Elige aleatoriamente uno de los 3 locales
	public static String generaLocalidad() {
		List<String> lista = Arrays.asList("1","5","10");
        Random aleatorio = new Random();
        return lista.get(aleatorio.nextInt(lista.size()));
      
	}
	
	// Validaciones del ticket 
	public static boolean validarTicket(String plocalidad, Localidad objLoc, Usuario pusr, int pticket) {
		boolean respuesta = false;
		//validacion 1 espacio
		double precio_localidad =0;
		
	
		System.out.println("Validando Disponibilidad para localidad :"+plocalidad);
		//Se valida si el local es el local dado y si su disponibilidad es mayor a 1
		if (plocalidad.equals(objLoc.getLoc1()) && objLoc.getDisponibilidadLoc1() > 1) {
			respuesta = true;
			//El precio del local es el nuevo precio  para la compra
			precio_localidad = objLoc.getPrecioLoc1();
		}else if (plocalidad.equals(objLoc.getLoc2()) && objLoc.getDisponibilidadLoc2() > 1) {
			respuesta = true;
			precio_localidad = objLoc.getPrecioLoc2();
		}else if (plocalidad.equals(objLoc.getLoc3()) && objLoc.getDisponibilidadLoc3() > 1) {
			respuesta = true;
			precio_localidad = objLoc.getPrecioLoc3();
		}else {
			System.out.println("Ya no existe disponibilidad en la Localidad: "+plocalidad+ " Total localidad 1: "+objLoc.getDisponibilidadLoc1()
			                                                                             + " Total localidad 2: "+objLoc.getDisponibilidadLoc2()
			                                                                             + " Total localidad 3: "+objLoc.getDisponibilidadLoc3()
			                                                                             );
		}
		
	//validacion 2 disponibilidad boletos deseados
		///que el ticket no lo tenga otra persona
		
		if (respuesta) {
			 List<Tickets> ptxu = pusr.getTicketxUsuario();
			 
			for (int i=0;i<ptxu.size();i++) {
				if (pticket == ptxu.get(i).getNumero() && plocalidad.equals(ptxu.get(i).getNomLocal())) {
					respuesta = false;
					System.out.println("El numero Ticket ya fue vendido anteriormente en esta localidad");
					break;
				}
			}
			
			
			
		}
		
		
		//validacion 3 precio
		if (respuesta) {
			//no tiene suficiente dinero para comprar
			if (pusr.getPresupuestoMax() < precio_localidad) {
				respuesta = false;
				System.out.println("No tiene suficiente presupuesto!");
			}
			
		}
		
		
		return respuesta;
		
	}



}
