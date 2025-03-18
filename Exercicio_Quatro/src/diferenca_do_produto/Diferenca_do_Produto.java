package diferenca_do_produto;

import java.util.Scanner;

public class Diferenca_do_Produto {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1;
		float n2;
		float n3;
		float n4;
		
		 
		
		System.out.print("Digite o primeiro número ");
	        n1 = leia.nextFloat();

	        System.out.print("Digite o segundo número ");
	        n2 = leia.nextFloat();

	        System.out.print("Digite o terceiro número ");
	        n3 = leia.nextFloat();

	        System.out.print("Digite o quarto número ");
	        n4 = leia.nextFloat();
	        
	        float total= (n1*n2) - (n3-n4);
	        
	        System.out.print("O valor total é:"+ total);
	}

}
