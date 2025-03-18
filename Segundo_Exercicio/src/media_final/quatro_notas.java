package media_final;

import java.util.Scanner;

public class quatro_notas {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int nota_1;
			int nota_2;
			int nota_3;
			int nota_4;
			
			
			System.out.print("digite sua primeira nota");
			nota_1 = leia.nextInt();
			
			System.out.print("digite sua segunda nota");
			nota_2 = leia.nextInt();
			
			System.out.print("digite sua terceira nota");
			nota_3 = leia.nextInt();
			
			System.out.print("digite sua quarta nota");
			nota_4 = leia.nextInt();
			
			
			int resultado_final = (nota_1 + nota_2 + nota_3 + nota_4) / 4;
			
			System.out.print("Essa é sua média final" + resultado_final);
			
		
	}

}
