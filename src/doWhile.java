import java.util.Locale;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double c;
		double f;
		
		char resp;
		
		do {
			System.out.println("Digite a temperatura em Celsius");
			c = sc.nextDouble();
			f = (9 * c / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp!='n');
		
		sc.close();
	}
}
