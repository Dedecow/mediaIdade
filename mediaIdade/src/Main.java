import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Locale locale;

    public static void main(String[] args) {

        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner(System.in);
        String P1, P2;
        int idadeP1, idadeP2;
        Double mediaIdade;

        System.out.println("Digite o NOME da primeira pessoa: ");
        P1 = sc.next();
        System.out.println("Digite a IDADE da primeira pessoa: ");
        idadeP1 = sc.nextInt();

        System.out.println("Digite o NOME da primeira pessoa: ");
        P2 = sc.next();
        System.out.println("Agora digite a IDADE da segunda pessoa: ");
        idadeP2 = sc.nextInt();
        mediaIdade = (idadeP1 + idadeP2)/2.0;

        System.out.print("A media de idade entre " + P1 + " e " + P2 + " é de ");
        System.out.printf(" %.1f", mediaIdade);
        System.out.println(" anos.");
        // O resultado deu certinho, porém o correto seria System.out.printf( "A idade média de %s e %s é de %.1f anos", P1, P2, mediaIdade";)

        sc.close();
    }
}