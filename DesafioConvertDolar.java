import java.util.Scanner;

public class DesafioConvertDolar {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner dolar = new Scanner(System.in);

        System.err.println("Qual valor em Dolar que deseja converter para Real");
        double vlr = dolar.nextDouble();

        vlr = vlr * 4.94;

        System.err.println("O valor que será disponibilizado na sua conta será: %.2f".formatted(vlr));

    }
}
