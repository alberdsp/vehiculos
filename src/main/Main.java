package main;

import modelo.*;

/**
 * Programa vehículos ABF 2023
 */

public class Main {

	public static void main(String[] args) {

		Menu menu = new Menu();

		menu.cabecera();

		// instanciamos un coche con 100km de marcador y deposito lleno

		Coche coche = new Coche("mercedes", " 3556adv", 100);
		coche.llenarDeposito();

		// instanciamos una moto
		Moto moto = new Moto("honda", "7866bke", 860);
		moto.llenarDeposito();
		// instanciamos un camión

		Camion camion = new Camion("ESCANIA", "2310YUS", 100200);
		camion.llenarDeposito();

		// avanzamos 25km cada vehículo

		coche.avanzarVehiculo(25);
		moto.avanzarVehiculo(25);
		camion.avanzarVehiculo(25);

		// obtenemos la info de cada uno

		coche.infoVehiculo();
		moto.infoVehiculo();
		camion.infoVehiculo();

	}

}
