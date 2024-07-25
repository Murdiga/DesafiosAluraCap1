import java.util.Scanner;

public class DesafioMedia {
    public static void main(String[] args) throws Exception {
    
        // Desafio 1
        @SuppressWarnings("resource")
        
        Scanner nota = new Scanner(System.in);

        System.err.println("Informar nota do 1° bimestre");
        double media = nota.nextDouble();

        System.err.println("Informar nota do 2° bimestre");
        media += nota.nextDouble();

        media = media / 2;

        System.err.println("A media final do aluno é: %.2f".formatted(media));

    }
}