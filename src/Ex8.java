import java.util.Scanner;

public class Ex8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        float base, height, area;

        System.out.printf("Digite o valor da base da triângulo: ");
        base = scanner.nextFloat();
        System.out.printf("Digite o valor da altura da triângulo: ");
        height = scanner.nextFloat();

        area = (base * height)/2;
        System.out.printf("A área do triângulo é de: " + area);
    }
}
