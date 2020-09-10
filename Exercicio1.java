package PacoteJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int duracaoSegundos, hora, minutos, segundos;
		System.out.println("Quantos segundos durou o evento? ");
		 duracaoSegundos = kb.nextInt();
				 
		
		
		hora=duracaoSegundos/3600;
		minutos=(duracaoSegundos % 3600)/60;
		segundos=(duracaoSegundos % 3600) %60;

		System.out.printf("O evento durou: %d, %d, %d", hora, minutos, segundos);
		kb.close();

	}

}
