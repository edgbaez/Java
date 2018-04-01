package Ejercicios;

import javax.management.StringValueExp;
import javax.swing.JOptionPane;

import POO.Construccion_de_Clases_y_Objetos;

public class Desencriptador_de_palabras {
	public static void main(String args[]) {
		
		String codigo= JOptionPane.showInputDialog("Ingrese el codigo a desencriptar");
		String palabra_a_palabra="";
	    String evualuado="";
	    int recorredor=0;
	    String palabra="";
		for(int i=3; i<=codigo.length(); i+=3) {
			
			evualuado=codigo.substring(recorredor,i);
			
			recorredor+=3;
			switch (evualuado) {
			case "037":
				palabra+=" ";	
				break;
			case "010":
				palabra+="a";	
				break;
			case "011":
				palabra+="b";	
				break;
			case "012":
				palabra+="c";	
				break;
			case "013":
				palabra+="d";	
				break;
			case "014":
				palabra+="e";	
				break;
			case "015":
				palabra+="f";	
				break;
			case "016":
				palabra+="g";	
				break;
			case "017":
				palabra+="h";	
				break;
			case "018":
				palabra+="i";	
				break;
			case "019":
				palabra+="j";	
				break;
			case "020":
				palabra+="k";	
				break;
			case "021":
				palabra+="l";	
				break;
			case "022":
				palabra+="m";	
				break;
			case "023":
				palabra+="n";	
				break;
			case "024":
				palabra+="ñ";	
				break;
			case "025":
				palabra+="o";	
				break;
			case "026":
				palabra+="p";	
				break;
			case "027":
				palabra+="q";	
				break;
			case "028":
				palabra+="r";	
				break;
			case "029":
				palabra+="s";	
				break;
			case "030":
				palabra+="t";	
				break;
			case "031":
				palabra+="u";	
				break;
			case "032":
				palabra+="v";	
				break;
			case "033":
				palabra+="w";	
				break;
			case "034":
				palabra+="x";	
				break;
			case "035":
				palabra+="y";	
				break;
			case "038":
				palabra+=",";	
				break;
			case "039":
				palabra+="!";	
				break;
			case "040":
				palabra+=":";	
				break;
			case "036":
				palabra+="z";	
				break;

			
			}
		}
		System.out.println(palabra);
		
		
	}
}