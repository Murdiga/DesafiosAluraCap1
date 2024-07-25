import java.util.Scanner;

public class DesafioCaixa {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner quant = new Scanner(System.in);

        double precoProduto = 29.35;

        System.err.println("Por favor informe a quantidade do produto:");
        int quantia = quant.nextInt();

        precoProduto = precoProduto * quantia;

        System.err.println("O valor total da compra é : %.2f".formatted(precoProduto));

    }

}
