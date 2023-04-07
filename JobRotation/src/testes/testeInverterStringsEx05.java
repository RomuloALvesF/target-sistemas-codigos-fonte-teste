package testes;

import java.util.Scanner;

public class testeInverterStringsEx05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String palavra = teclado.nextLine();

        String strInvertida = inverteString(palavra);
        System.out.println("String invertida: " + strInvertida);

        teclado.close();
    }

    public static String inverteString(String str) {
        char[] chars = str.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }

        return new String(chars);
    }
}
