package Ejercicios;

import javax.swing.JOptionPane;

public class Encriptador_de_palabras {

	public static void main(String[] args) {

//a=01 b=02, c=03, d=04, e=05, f=06, g=07, h=08, i=09, j=010, k=011, l=012, m=013, n=014, ñ=015, o=016, p=017, q=018, r=019, s=020, t=021, u=022, v=023, w=024, x=025, y=026  z=027

			String palabra= JOptionPane.showInputDialog("Ingrese la palabra a encriptar");
			char letra_a_letra;
			String encriptado="";
			for(int i=0; i<palabra.length(); i++)
			{
				
				letra_a_letra= palabra.charAt(i);
				
				switch (letra_a_letra) {
				case  'a':
					encriptado+="010";
					break;
				case  'b':
					encriptado+="011";
					break;
				case  'c':
					encriptado+="012";
					break;
				case  'd':
					encriptado+="013";
					break;
				case  'e':
					encriptado+="014";
					break;
				case  'f':
					encriptado+="015";
					break;
				case  'g':
					encriptado+="016";
					break;
				case  'h':
					encriptado+="017";
					break;
				case  'i':
					encriptado+="018";
					break;
				case  'j':
					encriptado+="019";
					break;
				case  'k':
					encriptado+="020";
					break;
				case  'l':
					encriptado+="021";
					break;
				case  'm':
					encriptado+="022";
					break;
				case  'n':
					encriptado+="023";
					break;
				case  'ñ':
					encriptado+="024";
					break;
				case  'o':
					encriptado+="025";
					break;
				case  'p':
					encriptado+="026";
					break;
				case  'q':
					encriptado+="027";
					break;
				case  'r':
					encriptado+="028";
					break;
				case  's':
					encriptado+="029";
					break;
				case  't':
					encriptado+="030";
					break;
				case  'u':
					encriptado+="031";
					break;
				case  'v':
					encriptado+="032";
					break;
				case  'w':
					encriptado+="033";
					break;
				case  'x':
					encriptado+="034";
					break;
				case  'y':
					encriptado+="035";
					break;
				case  'z':
					encriptado+="036";
					break;
				case  ',':
					encriptado+="038";
					break;
				case  '!':
					encriptado+="039";
					break;
				case  ':':
					encriptado+="040";
					break;
				case  ' ':
					encriptado+="037";
					break;	
				}
			}
			
			System.out.println("La palabra encriptada es :"+encriptado);
		
	}

}
