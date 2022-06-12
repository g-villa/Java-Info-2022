import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println("Ingrese 2 números enteros");

		Scanner scan = new Scanner(System.in);
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		scan.close();

		int resultado = 0;
		if ((numero1 != 0) && (numero2 != 0)) {
			for (int i = 0; i < numero1; i++) {
				resultado += numero2;
			}

			System.out.println(String.format("%s * %s = %s", numero1, numero2, resultado));
		}

		else {
			System.out.println(String.format("%s * %s = 0", numero1, numero2, resultado));
		}
	}
}