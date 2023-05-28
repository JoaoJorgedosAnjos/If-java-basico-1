import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        float inch, feet,yard,mile;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o valor da medida em pé(s): ");
        feet = scanner.nextFloat();
        inch = feet * 12;
        yard = feet / 3;
        mile = yard / 1760;


        System.out.printf("O valor em polegadas é: %.2f, o valor em jardas é: %.2f, o valor em milhas é: %.4f", inch, yard, mile);


    }
}
