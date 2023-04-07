package testes;

import java.util.Scanner;

public class testeFibonacciEx02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor informe o número: ");
        int numero = teclado.nextInt();

        boolean pertence = false;
        int anterior = 0;
        int atual = 1;

        while (atual <= numero) {
            if (atual == numero) {
                pertence = true;
                break;
            }
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        if (pertence) {
            System.out.println("O numero " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O numero " + numero + " não pertence à sequência de Fibonacci.");
        }

        teclado.close();
    }

}
