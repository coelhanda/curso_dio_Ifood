package curso_dio;

public class arrays_OrdemInversa {

	public static void main(String[] args) {
		
		int[] vetor = {-5, -6, 15, 50, 8, 4};
		
		//System.out.ptintln(vetor.length);

		System.out.print("Vetor: ");
		int count =0;
		while(count < (vetor.length)) {
			System.out.println(vetor[count] + " ");
			count++;	
		}
		
		System.out.print("\nVetor: ");
		for(int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
		
	}

}
