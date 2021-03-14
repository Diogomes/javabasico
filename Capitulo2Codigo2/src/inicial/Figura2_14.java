/**
 * 
 */
package inicial;
import java.util.Scanner;

/**
 * @author dngom
 *
 */
public class Figura2_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Digite o primeiro número");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo número");
		num2 = input.nextInt();
		
		if (num1 == num2)
			System.out.printf("%d == %d%n", num1, num2);
		
		if (num1 != num2)
			System.out.printf("%d != %d%n", num1, num2);
		
		if (num1 < num2)
			System.out.printf("%d < %d%n", num1, num2);
		
		if (num1 > num2)
			System.out.printf("%d > %d%n", num1, num2);
		
		if (num1 <= num2)
			System.out.printf("%d <= %d%n", num1, num2);
		
		if (num1 >= num2)
			System.out.printf("%d >= %d%n", num1, num2);
		// TODO Auto-generated method stub

	}

}
