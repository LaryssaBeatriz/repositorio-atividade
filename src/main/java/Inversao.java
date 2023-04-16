import java.util.Scanner;

public class Inversao {

    public static void main(String[] args) {
        int tamanhoPalavra,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma palavra");
        String palavra = scanner.next();
        tamanhoPalavra = palavra.length();

        char[] palavraNormal = palavra.toCharArray();
        char[] inversa = new char[tamanhoPalavra];
        j = tamanhoPalavra;

        for (int i = 0; i < tamanhoPalavra; i++){
            j--;
            inversa[i] = palavraNormal[j];
        }

        System.out.println(palavraNormal);
        System.out.println(" ------------ Abaixo a versão invertida da palavra ");
        System.out.println(inversa);

    }
}
