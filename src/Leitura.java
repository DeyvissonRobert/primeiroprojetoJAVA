import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 2500;
        System.out.println("Quem é sua namorada?");
        String crush = leitura.nextLine();
        System.out.println("Quantos anos ela tem");
        int idade = leitura.nextInt();
        System.out.println("Nome da namorada: " + crush);
        System.out.println("Idade dela: " + idade);
    }
}

