import java.util.Scanner;
public class Estatistica {
	
	int maiorValor;
	
		
	public Estatistica(int maiorValor) {
		
		this.maiorValor = maiorValor;
		
	}
	
	public int somatorio(int maiorValor) {
		
		int soma = 0;
		for (int i = 0; i <= maiorValor; i++) {
			
			soma += i;
			
		}
		
		return soma;
	}
	
	public double mediaAritmetica(int maiorValor) {
		
		double media;
		double totalDeNumeros = 0;
		double somaDosNumeros = this.somatorio(maiorValor);
		
		do {
			totalDeNumeros += 1;
			maiorValor--;
		} while (maiorValor >= 0);
		
		media = somaDosNumeros / totalDeNumeros;
		
		return media;
	}
	
	public double varianciaDosNumeros(int maiorValor) {
		
		double totalDosValores = 0;
		int temp = maiorValor;
		double mediaDosNumeros = this.mediaAritmetica(maiorValor);
		double alfa = 0;
		
		while (temp >= 0) {
			
			totalDosValores += 1;
			temp--;
			
		}	
		
		for (int i = 0; i <= maiorValor; i++) {
			
			alfa = alfa + Math.pow((i - mediaDosNumeros), 2);
			
		}
		return Math.sqrt(alfa / totalDosValores);
	}
	
	public void imprimirParesOuImpares(int maiorValor) {
		
		for (int i = 0; i <= maiorValor; i++) {
			
			if (i % 2 == 0) {
				
				System.out.printf("O valor %d é par.\n", i);
				
			} else {
				
				System.out.printf("O valor % é ímpar.\n", i);
				
			}
		}
	}

	public static void main(String[] args) {
		
		int valor;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número:");
		valor = input.nextInt();
		
		Estatistica estatistica = new Estatistica(valor);
		estatistica.somatorio(valor);
		estatistica.mediaAritmetica(valor);
		estatistica.varianciaDosNumeros(valor);
		estatistica.imprimirParesOuImpares(valor);
		
		input.close();		

	}

}
