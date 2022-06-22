import java.util.Scanner;

public class MaiorProduto {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		String numeros;
		System.out.println("Digite a sequencia de numeros: ");
		numeros = sc.nextLine();
		
		int long_String;
		long_String = numeros.length();
		
		//Colocar cada letra em um vetor
		String letras_vetor[];
		letras_vetor = new String[long_String];
		int a = 0, b = 1; 
		for(int i = 0; i < long_String; i++) {
		letras_vetor[i] = numeros.substring(a,b);	
		a++;
		b++;
		//Status == funcionando//
		}
		
		//Transforma cada letra em um numeros
		int numeros_vetor[];
		numeros_vetor = new int[long_String];
		for(int i = 0; i < long_String; i++) {
		numeros_vetor[i] =  Integer.valueOf(letras_vetor[i]); 
		//Status == funcioando//
		}
			
			//Faz a multiplicaçao entre os termos
			int resultado[];
			resultado = new int[long_String];
			int resultado_anterior[];
			resultado_anterior = new int[long_String];
			resultado[0] = 1;
		
					int j = 0;
		
						for(int i = 0; i < long_String; i++) {
						j++;
						if(i <= 1){
						j = 0;	
						}
						resultado_anterior[i] = resultado[j];
						resultado[i] = numeros_vetor[i] * resultado_anterior[i];
						if(i > 4){
						resultado[i] = resultado[i]/numeros_vetor[i - 5];
						}
						System.out.println(resultado[i]);
						}
			//Status == funcionando//
						
			
						
sc.close();		
	}
}
