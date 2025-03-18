package Primeiro_Exercicio;

import java.util.Scanner;

public class exercicio_salario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
				float salario;
				float abono = 1000.00f;
				float salario_ajustado;
				
		System.out.print("Digite o seu salário");
		salario = leia.nextFloat();
		
		salario_ajustado = salario + abono;
		
		System.out.println("Salário: " + salario);
        System.out.println("Abono: " + abono);
        System.out.println("Novo Salário: " + salario_ajustado);
				
					
	}

}
