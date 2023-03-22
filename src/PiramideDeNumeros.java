import java.util.Scanner;

public class PiramideDeNumeros {
    public static void main(String[] args) {
        Scanner entradaDoUsario = new Scanner(System.in);

        System.out.println("Digite o número limite da pirâmide: ");
        int numero = entradaDoUsario.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
