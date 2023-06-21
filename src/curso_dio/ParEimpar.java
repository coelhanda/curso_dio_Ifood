package curso_dio;

import java.util.Scanner;
public class ParEimpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantNumeros;
		int quantPares = 0, quantImpares = 0;
		
		System.out.println("Quantidade de numeros: ");
		quantNumeros = sc.nextInt();
		
		int count = 0;
		do {
			System.out.println("Numero: ");
			int numero = sc.nextInt();
			
			if (numero % 2 == 0) quantPares++;
			else quantImpares++;
			
			count++;	
		} while(count < quantNumeros);
		
		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Impar: " + quantImpares);
	
		sc.close();

	}

}
