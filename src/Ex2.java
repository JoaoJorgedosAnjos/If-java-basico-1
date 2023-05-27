import java.util.Scanner;

public class Ex2 {
    public static void main(String[]args){
        double num1,  result;
        int num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite um número: ");
        num2 = scanner.nextInt();
       while (num2 == 0){
           System.out.println("Digite um número diferente de 0: ");
           num2 = scanner.nextInt();
       }
       result = num1 / num2;
        System.out.println("O resultado da divisão é: " + result);
    }
}
