package salario_liquido;

import java.util.Scanner;

public class Salario_Liquido {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario_bruto;
		float adicional_noturno;
		float horas_extras;
		float descontos;
		

        System.out.print("Digite o salário bruto: ");
        salario_bruto = leia.nextFloat();

        System.out.print("Digite o adicional noturno: ");
        adicional_noturno = leia.nextFloat();

        System.out.print("Digite a quantidade de horas extras: ");
        horas_extras = leia.nextFloat();

        System.out.print("Digite o valor dos descontos: ");
        descontos = leia.nextFloat();
		
		
		float salario_liquido= salario_bruto + adicional_noturno + (horas_extras * 5) - descontos;
		
		System.out.println ("Esse é o seu salário líquido"+ salario_liquido);
		
	}

}
