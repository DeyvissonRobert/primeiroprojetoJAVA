//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Scream Match!");
        System.out.println("Filme: Ta chovendo Hamburguer");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada da nota de 3 pessoas
        double media = (9.7 + 7.4 + 6.5) / 3;
        System.out.println("média do filme: " + media);
        String sinopse;
        sinopse = "Filme de ficção cientifica de um cientista que cria uma máquina que faz chover Hamburguer";
        System.out.println();
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}

