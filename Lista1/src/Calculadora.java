import java.util.Scanner;
public class Calculadora {
	
	public double adicao(double arg_1, double arg_2) {
		return arg_1 + arg_2;
	}
	
	public double subtracao(double arg_1, double arg_2) {
		return arg_1 - arg_2;
	}
	
	public double multiplicacao(double arg_1, double arg_2) {
		return arg_1 * arg_2;
	}
	
	public double divisao(double arg_1, double arg_2) {
		return arg_1 / arg_2;
	}

	public static void main(String[] args) {
		
		double num_1;
		double num_2;
		String opcao;
		Calculadora calculadora = new Calculadora();
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua opção:");
		System.out.println("Adição (+)");
		System.out.println("Subtração (-)");
		System.out.println("Multiplicação (*)");
		System.out.println("Divisão (/)");
		opcao = input.next();
		if (opcao.equals("+")) {
			System.out.println("Primeiro Número: ");
			num_1 = input.nextDouble();
			System.out.println("Segundo Número: ");
			num_2 = input.nextDouble();
			System.out.printf("Adição: %f\n", calculadora.adicao(num_1,num_2));
			input.close();
		} else if (opcao.equals("-")) {
			System.out.println("Primeiro Número: ");
			num_1 = input.nextDouble();
			System.out.println("Segundo Número: ");
			num_2 = input.nextDouble();
			System.out.printf("Subtração: %f\n", calculadora.subtracao(num_1,num_2));
			input.close();
		} else if (opcao.equals("*")) {
			System.out.println("Primeiro Número: ");
			num_1 = input.nextDouble();
			System.out.println("Segundo Número: ");
			num_2 = input.nextDouble();
			System.out.printf("Multiplicação: %f\n", calculadora.multiplicacao(num_1,num_2));
			input.close();
		} else if (opcao.equals("/")) {
			System.out.println("Primeiro Número: ");
			num_1 = input.nextDouble();
			System.out.println("Segundo Número: ");
			num_2 = input.nextDouble();
			System.out.printf("Divisão: %f\n", calculadora.divisao(num_1, num_2));
			input.close();
		}

	}

}
