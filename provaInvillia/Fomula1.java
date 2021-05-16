//  Uma equipe da Fórmula 1 deseja calcular o número mínimo de litros que deverá colocar no tanque 
//	de um de seus carros para que ele possa percorrer um determinado número de voltas até o primeiro 
//	reabastecimento. Escreva um programa (EM QUALQUER LINGUAGEM) que leia o comprimento da pista (em metros),
//	o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e o 
//	consumo de combustível do carro (em Km/L). Calcular e escrever o número mínimo de litros necessários para 
//	percorrer até o primeiro reabastecimento. Considere que o número de voltas entre os reabastecimentos é o mesmo.

package provaInvillia;

import java.util.Locale;
import java.util.Scanner;

public class Fomula1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double comprimentoPista;
		Double totalDeVoltas;
		Double numeroDeReabastecimento;
		Double consumoCombustivel;

		System.out.print("Qual o comprimento da pista(m) ?");
		comprimentoPista = sc.nextDouble();
		
		System.out.print("Qual o total de voltas?");
		totalDeVoltas = sc.nextDouble();
		
		System.out.print("Qual o numero de reabastecimentos?");
		numeroDeReabastecimento = sc.nextDouble();
		
		System.out.print("Qual o consumo de combustivel  do carro(km/l)?");
		consumoCombustivel = sc.nextDouble();
		
		Double totalDistancia = totalDeVoltas * comprimentoPista;
		
		Double trajeto1 = totalDistancia / (numeroDeReabastecimento+1);
		
		Double minLitros = trajeto1 / consumoCombustivel;
		
		System.out.printf("Minimo de consumo em Litros é de %.2f", minLitros );
		
		sc.close();
	}
}
