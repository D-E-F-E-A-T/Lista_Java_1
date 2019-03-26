import java.util.Scanner;
public class Comparador {
	private int num_1;
	private int num_2;
	private int num_3;
	public int getNumero1() {
		return this.num_1;
	}
	
	public void setNumero1(int num_1) {
		this.num_1 = num_1;
	}
	
	public int getNumero2() {
		return this.num_2;
	}
	
	public void setNumero2(int num_2) {
		this.num_2 = num_2;
	}
	
	public int getNumero3() {
		return this.num_3;
	}
	
	public void setNumero3(int num_3) {
		this.num_3 = num_3;
	}
	
	public int getMaior(int num_1, int num_2, int num_3) {
		if (num_1 > num_2 && num_1 > num_3) {
			return num_1;
		} else if (num_2 > num_1 && num_2 > num_3) {
			return num_2;
		} else if (num_3 > num_1 && num_3 > num_2) {
			return num_3;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		
		Comparador comparador = new Comparador();
		Scanner input = new Scanner(System.in);
		System.out.println("Primeiro Número:");
		int num_1 = input.nextInt();
		comparador.setNumero1(num_1);
		System.out.println("Segundo Número:");
		int num_2 = input.nextInt();
		comparador.setNumero2(num_2);
		System.out.println("Terceiro Número:");
		int num_3 = input.nextInt();
		comparador.setNumero3(num_3);
		System.out.printf("O maior valor é: %d\n",comparador.getMaior(comparador.getNumero1(), comparador.getNumero2(), comparador.getNumero3()));
		input.close();

	}

}
