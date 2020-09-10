package PacoteJava;

import java.util.Locale;
import java.util.Scanner;

public class Lista1exemplo8 {
	public static void main(String args[])
	{
		Locale.setDefault(Locale.US); // roda primeiro, serve para padronizar a escrita
		Scanner kb = new Scanner(System.in);
		
		
		double a,b,c,d,e,f,x,y;
		System.out.print("Entre com o valor de A: ");
		a = kb.nextDouble();
		System.out.print("Entre com o valor de B: ");
		b = kb.nextDouble();
		System.out.print("Entre com o valor de C: ");
		c = kb.nextDouble();
		System.out.print("Entre com o valor de D: ");
		d = kb.nextDouble();
		System.out.print("Entre com o valor de E: ");
		e = kb.nextDouble();
		System.out.print("Entre com o valor de F: ");
		f = kb.nextDouble();
		
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		System.out.printf("\nValor de X: %.2f",x);
		System.out.printf("\nValor de X: %.2f",y);
		kb.close();
	}

}
