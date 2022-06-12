import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese 2 numeros enteros");

		int Num1 = scan.nextInt();
		int Num2 = scan.nextInt();
		scan.close();

		int R = Operat(Num1, Num2);

		System.out.println(String.format("%d elevado a %d = %d", Num1, Num2, R));
	}

	static int Operat(int Num1, int Num2) {
		int x = Num1;

		if ((Num1 != 0) && (Num2 != 0)) {

			for (int i = 1; i < Num2; i++) {
				x *= Num1;
			}
		}
		return x;
	}
}