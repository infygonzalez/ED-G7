package MAIN;

import java.sql.Connection;
import java.util.ArrayList;

import CONTROLADOR.ControladorA;
import Modelo.Agencia;
import Modelo.Dbutils;
import Modelo.Pais;
import Modelo.Viaje;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Agencia> agenciaid = ControladorA.obtenerAgenciaId("1");
		for (Agencia agencia : agenciaid) {
			System.out.println(agencia.toString());
		}
		ArrayList<Agencia> agenciasn = ControladorA.obtenerAgenciaNombre("AgenciaG7");
		for (Agencia agencia : agenciasn) {
			System.out.println(agencia.toString());
		}
		
		ArrayList<Agencia> agenciaslo = ControladorA.obtenerAgenciaLogo("img");
		for (Agencia agencia : agenciaslo) {
			System.out.println(agencia.toString());
		}
	}
}