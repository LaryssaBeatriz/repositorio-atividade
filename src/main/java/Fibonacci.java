import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int aux, proximo, anterior, numparada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual número deseja verificar se está na sequência Fibonacci?");
        numparada = scanner.nextInt();

        anterior = 0;
        proximo = 1;
        System.out.print(anterior);
        while (proximo <= numparada){
            System.out.print(", "+ proximo);
            aux = proximo;
            proximo = anterior + proximo;
            anterior = aux;
        }
        if ((proximo == numparada)||(anterior==numparada)){
            System.out.println(" O número pertence à sequência Fibonacci");
        }else{
            System.out.println("Não pertence à sequência Fibonacci");
        }
    }
}
