import java.util.Scanner;

public class Ex6 {
    public static void main(String[]args){
        float fixedSalary, salesCommission, sales ,finalSalary;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o salário fixo do funcionário: ");
        fixedSalary = scanner.nextFloat();
        System.out.printf("Digite o valor total das vendas do funcionário: ");
        sales = scanner.nextFloat();
        salesCommission = sales * 0.04f;
        finalSalary = fixedSalary + salesCommission;

        System.out.printf("O salário final é de: " + finalSalary);
    }
}
