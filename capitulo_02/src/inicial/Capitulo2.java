 /**
 * 
 */
package inicial;
import java.util.Scanner;

/**
 * @author dngomes
 *
 */
public class Capitulo2 {

	/**	
	 * @param argsa
	 */
	public static void main(String[] args) {
		//resposta da 2:
		// A aplica��o tem como objetico a saida do texto Welcome to Java Programming!
		// para o arquivo funcionar corretamente deve-se criar um projeto cliar uma class
		//Depois deve-se salvar o projeto e clicar em run
		//inicio da quest�o 4
		System.out.print("Bem vindo:\n");
		System.out.println("Diogo GomesMatricula:20201Y6-RC0347!Sauda��es!");
		//op��o 5
		System.out.println("Diogo Gomes\nMatricula: 20201Y6-RC0347!\nSauda��es!");
		//op��o 6
		System.out.println("Diogo\nGomes\nMatricula:\n20201Y6-RC0347!\nSauda��es!");
		//op��o 7
		System.out.println("Diogo\tGomes\tMatricula:\t20201Y6-RC0347!\tSauda��es!");
		//op��o 8
		System.out.println("\"Diogo Gomes Matricula:20201Y6-RC0347 Sauda��es!\"");
		//inicio da 9
		System.out.printf("%s%n%s%n%s%n%s%n", "Diogo", "20201Y6-RC0347", "12/03/21;23:35", "Doit");
		//inicio da 10
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		
		System.out.print("Digite o Primeiro N�mero: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o Segundo N�mero: ");
		num2 = input.nextInt();
		sum = num1 + num2;
		
		System.out.printf("Soma � %d%n", sum);
		/** 11
		 * essa � uma aplica��o que recebe dois n�meros inteiros
		 * nas variaveis num1 e num2, depois realiza a soma dos numeros recebidos
		 * e a transforma na variavel sum depois o sistema imprime o resultado "sum"
		 *
		 */
		//quest�o 12 n�o funciona aparece seguintes mensagens:
		//Scanner cannot be resolved to a type
		//Scanner cannot be resolved to a type
		

	}

}
