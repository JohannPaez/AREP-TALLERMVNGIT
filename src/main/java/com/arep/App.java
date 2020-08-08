package com.arep;

import java.util.Scanner;

import com.arep.array.ListaEncadenada;
import com.arep.array.Node;
import com.arep.exceptions.AppException;
import com.arep.operation.Calculator;

/**
 * Aplicación que lee n valores y calcula la media y la desviación estándar redondeado a 2 decimales.
 * @author SebastianPaez
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	System.out.println("Este programa calcula la media y la desviación estándar de una lista de números.");
    	Scanner sc = new Scanner(System.in);
    	ListaEncadenada lista = new ListaEncadenada();
    	/*int casos = sc.nextInt();
    	for (int i = 0; i < casos; i++) {
    		double value = sc.nextDouble();
    		lista.addRight(new Node(value));
    	}*/
    	int cont = 0;
    	String line = sc.nextLine();
    	while (!line.equals("")) {
    		double value = Double.parseDouble(line);
    		lista.addRight(new Node(value));
    		line = sc.nextLine();
    	}
    	Calculator c = new Calculator(lista);
    	System.out.println("La media es: " + c.getMedia());
    	System.out.println("La desviacion estandar es: " + c.getDesviacionEstandar());

    }
}