import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.print("Digite um número: ");
		n = teclado.nextInt();
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("     TABUADA DE " + n);
		System.out.println("-----------------------");
		
		teclado.close();
		
		for(int c = 1; c < 11; c++)
		{
			int mult = n * c;
			System.out.println(n + " x " + c + " = " + mult);
		}

	}

}
