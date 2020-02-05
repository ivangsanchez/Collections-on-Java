package com.colecciones.app;
import java.util.*;

public class Arboles {

	public static void main(String[] args) {
		TreeSet<String> ordenaPersonas=new TreeSet<String>();
		
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		for(String s:ordenaPersonas) {
			System.out.println(s);
		}

	}

}
