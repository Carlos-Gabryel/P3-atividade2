import java.util.Scanner;

public class soma {

    public static void soma() throws AcimaDeCemException {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, valor = 0, contador = 0;
        do {
            System.out.println("Digite um número para somar: ");
            valor = scanner.nextInt();
            soma += valor;

            if (valor != 0) {
                contador++;
            }
        } while (soma + valor <= 100);
        if (soma > 100) {
            throw new AcimaDeCemException("Erro");
        }
        System.out.println("O resultado da soma de todos os números é: " + soma);
        System.out.println("Quantidade total de números digitados: " + contador);
        System.out.println("A média de todos os números é: " + soma / contador);
    }
}