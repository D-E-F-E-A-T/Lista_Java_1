import java.util.Scanner;
public class ComparadorDeStrings {
  
	public void isReverso(String palavra1, String palavra2) {
		
		String reverso ="";
		
		for (int i = palavra1.length() - 1; i >= 0; i--) {
			
			reverso += palavra1.charAt(i);
			
		}
		
		if (palavra2.equalsIgnoreCase(reverso)) {
			
			System.out.println("True");
			
		} else {
			
			System.out.println("False");
			
		}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ComparadorDeStrings comparadorDeStrings = new ComparadorDeStrings();
		
		String palavra1;
		String palavra2;
		
		System.out.println("Digite a primeira palavra:");
		palavra1 = input.next();
		System.out.println("Digite a segunda palavra:");
		palavra2 = input.next();
		comparadorDeStrings.isReverso(palavra1,palavra2);
		input.close();

	}

}
