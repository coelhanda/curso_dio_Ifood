package curso_dio;

import java.util.Scanner;

public class main {

	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = sc.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota invalida. Digite novamente: ");
			nota = sc.nextInt();
			
			
		}
		
		sc.close();

	}

}
