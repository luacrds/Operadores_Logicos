package mediaFinal;

import java.util.Scanner;

public class QuatroNotas {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int nota4;

        System.out.print("Digite sua primeira nota: ");
        nota1 = leia.nextInt();

        System.out.print("Digite sua segunda nota: ");
        nota2 = leia.nextInt();

        System.out.print("Digite sua terceira nota: ");
        nota3 = leia.nextInt();

        System.out.print("Digite sua quarta nota: ");
        nota4 = leia.nextInt();

        int resultadoFinal = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("Essa é sua média final: " + resultadoFinal);
    }
}
			
		
	


