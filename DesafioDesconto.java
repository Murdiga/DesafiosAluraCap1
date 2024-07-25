import java.util.Scanner;

public class DesafioDesconto {

    public static void main(String[] args) {
        
        double vlrOrignal = 35.90;

        @SuppressWarnings("resource")
        Scanner descon = new Scanner(System.in);

        System.err.println("Por favor informar o percentual de desconto que o produto tera");
        double percen = descon.nextInt();

        double vlrDescon = (vlrOrignal * percen/100);
        double vlrNovo = vlrOrignal - vlrDescon;

        System.err.println("""
                O valor original do produto é de: R$ %.2f
                Desconto foi de: R$ %.2f
                Valor do produto com Desconto : R$ %.2f
                """.formatted(vlrOrignal, vlrDescon, vlrNovo));

    }

}
