package com.colecciones.app;

import java.util.HashSet;
import java.util.Set;

public class CuentasUsuario {

	public static void main(String[] args) {
		
		//se instancia un objeto cliente con unos datos predeterminados
		Cliente cl1=new Cliente("Pepe Problemas","00001",2000);
		Cliente cl2=new Cliente("Antonio Morales","00002",2335);
		Cliente cl3=new Cliente("Penelope Masias","00003",2323);
		Cliente cl4=new Cliente ("Margarito Perez","00004",2324);
		
		//se usa la coleccion Set ya que no permite valores repetidos y facil lectura
		Set<Cliente> clientesBanco=new HashSet<Cliente>();
		
		//se la añaden los clientes creados a nuestro HashSet
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		
		//se muestran los datos usando un ForEach
		for(Cliente cliente:clientesBanco) {
			System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+" "+ cliente.getSaldo());
		}

	}

}
