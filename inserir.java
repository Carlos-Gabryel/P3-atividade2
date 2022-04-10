import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class inserir {

    public static void inserirNumeros() throws ArrayIndexOutOfBoundsException, NumberFormatException {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int qtd = 0;
        while (qtd <= 10) {
            System.out.println("Digite em qual posição o números será inserido");
            String numberString = input.next();
            int position = Integer.parseInt(numberString);
            System.out.println("Digite os números a serem inseridos");
            String caractere = input.next();
            int numero = Integer.parseInt(caractere);
            numeros[position] = numero;
            qtd++;
        }
    }
}