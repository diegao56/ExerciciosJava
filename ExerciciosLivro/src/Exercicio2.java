import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite o primeiro numero: ");
		int n1 = scanner.nextInt();
		System.out.print("Digite o segundo numero: ");
		int n2 = scanner.nextInt();
		System.out.print("Digite o terceiro numero: ");
		int n3 = scanner.nextInt();
		System.out.println();
		
		scanner.close();
		
		int mult = n1 * n2 * n3;
		
		System.out.println("O resultado da multiplicação entre " + n1 + ", " + n2 + ", " + n3 + " é igual a " + mult);

	}

}
