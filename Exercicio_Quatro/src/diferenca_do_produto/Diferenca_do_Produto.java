package diferencaDoProduto;

import java.util.Scanner;

public class DiferencaDoProduto {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float numero1;
        float numero2;
        float numero3;
        float numero4;

        System.out.print("Digite o primeiro número: ");
        numero1 = leia.nextFloat();

        System.out.print("Digite o segundo número: ");
        numero2 = leia.nextFloat();

        System.out.print("Digite o terceiro número: ");
        numero3 = leia.nextFloat();

        System.out.print("Digite o quarto número: ");
        numero4 = leia.nextFloat();

        float total = (numero1 * numero2) - (numero3 - numero4);

        System.out.print("O valor total é: " + total);
    }
}
