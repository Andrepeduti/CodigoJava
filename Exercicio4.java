package PacoteJava;

import java.util.Scanner;

public class Exercicio4 {
/*
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias.
 */
	public static void main(String[] args) {
		
		Scanner kb = new Scanner (System.in);
		
		int valor, idade, mes, dia;
		System.out.println("Qual sua idade? ");
		
		idade = kb.nextInt();
		
		System.out.println("Que mês você nasceu? ");
		mes = kb.nextInt();
		System.out.println("Que dia você nasceu? ");
		dia = kb.nextInt();
				
		//processamento
          valor=idade*365;
          valor=valor+(mes*30);
          valor=valor+dia;
         System.out.printf("valor total de dias: %d", valor);	
         
         kb.close();

	}

}
