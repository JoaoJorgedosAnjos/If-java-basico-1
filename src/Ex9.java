import java.util.Scanner;

public class Ex9 {
    public static void main(String[]args){
        float area, side;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o valor do lado do quadrado: ");
        side = scanner.nextFloat();

        area = side * side;
        System.out.printf("A área do quadrado é de : " + area);

    }
}
