import java.util.Scanner;

public class Ex5 {
    public static void main(String[]args){
        float salary, salaryWithBonus, salaryWithDiscount;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o sálario do funcionário: ");
        salary = scanner.nextFloat();

        salaryWithBonus = (salary * 0.05f) + salary;
        salaryWithDiscount = (salaryWithBonus * 0.07f) - salaryWithBonus;

        System.out.println("O valor final do salário é = " + salaryWithDiscount);
    }
}
