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
 * Esta es clase main para mostrar 
 * en pantalla o el menu
 * 
 * */



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Localidad loc = new Localidad();
		Scanner in =new Scanner(System.in);
		
			
		//Menu principal 
		pr("*******  Bienvenido al Sistema de Compras  *******");
		pr("");
		
		pr("Ingrese su nombre: \n >");
		String nom = in.nextLine().toUpperCase();
		pr("Ingrese su correo: \n >");
		String correo = in.nextLine().toUpperCase();
		pr("Ingrese cantidad de Tickets a Comprar: \n >");
		int cantidad = Integer.parseInt(in.nextLine());
		pr("Ingrese su presupuesto:");
		double presupuesto = Double.parseDouble(in.nextLine());
		
		

		//Crea el objeto Usuario con los datos ingresados
		Usuario usr = new Usuario(nom,correo,cantidad,presupuesto);

	
		
		
		//Para cada ticket que desea comprar se muestra en pantalla
		for (int j=1;j<=cantidad;j++) {
			pr2("######## Iniciando busqueda de Tickets ############");
			pr("Actualmente existen disponibles: \n "+loc.getDisponibilidadLoc1()+" Tickets para Localidad 1 \n "+loc.getDisponibilidadLoc2()+" Tickets para Localidad 2 \n "+loc.getDisponibilidadLoc3()+" Tickets para Localidad 3 \n");
			
			
			//Se genera y muestra el ticket 
			Tickets   tkt = new Tickets();
			int numGen = ErasTour.generarTicketAleatorio();
			double precio = 0;
			pr("Ticket Generado --> "+numGen);
			
			
			//Validacion si se puede comprar o no 
			if (ErasTour.puedeComprarBoletos(numGen)) {
				String localidad  = ErasTour.generaLocalidad();
				pr("Localidad Generada --> "+localidad);
				
				if (ErasTour.validarTicket(localidad,loc,usr,numGen)) {
					
					loc.setReservaLocalidad(localidad); //disminuye la cantidad total actual
					
					
					//crea el objeto Ticket
					tkt.setNomLocal(localidad);
					tkt.setNumero(numGen);
					
					if (localidad.equals(loc.getLoc1())) {
						precio = loc.getPrecioLoc1();
					}else if (localidad.equals(loc.getLoc2())) {
						precio = loc.getPrecioLoc2();

					}else if (localidad.equals(loc.getLoc3())) {
						precio = loc.getPrecioLoc3();
					}else {pr("Localidad no encontrada!");}
					
					tkt.setPrecio(precio);
					
					 
					 List<Tickets> tc = usr.getTicketxUsuario();
					 
					
					 
					 tc.add(tkt);
					 usr.setTicketxUsuario(tc);
				
					 
				//Se muestra el resumen en pantalla por cada ticket 	
				pr2("Resumen");
				pr("Se ha vendido ticket a: "+usr.getNombre());
				pr("El usuario tiene actualmente comprado "+tc.size()+" Boletos");
				pr("El detalle de compra es:");
				
				//Resumen de todos los tickets comprados 
				for (int k=0;k<tc.size();k++) {
					
					Tickets tkt2 = new Tickets();
					tkt2 = tc.get(k);
					pr("Boleto #"+(k+1)+ " Numero: "+tkt2.getNumero()+" Localidad: "+tkt2.getNomLocal()+ " Precio: "+tkt2.getPrecio());
	
				}
				
				
				
				pr("");
					 
					 
					 
				    
					
				}else {
					pr("No es apto para la compra!");
				}
				
				
				
			}else {
				pr("No es apto para la compra!");
			}
			
		}
		
	
		

	}
	
	
	private static void pr(String x) {
		System.out.println(x);
	}
	private static void pr2(String x) {
		System.out.println("");
		System.out.println(x);
		System.out.println("");
	}

}
