import java.util.Scanner;

public class ExercicioSalario {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float salario;
        float abono;
        float salarioAjustado;

        System.out.print("Digite o seu salário: ");
        salario = leia.nextFloat();

        System.out.print("Digite o valor do abono: ");
        abono = leia.nextFloat();

        salarioAjustado = salario + abono;

        System.out.println("Salário: " + salario);
        System.out.println("Abono: " + abono);
        System.out.println("Novo Salário: " + salarioAjustado);
    }
}