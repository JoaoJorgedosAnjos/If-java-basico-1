import java.util.Scanner;

public class Ex7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        float grade1, grade2, grade3, weightGrade1,weightGrade2, weightGrade3, result;

        System.out.printf("Digite a nota 1: ");
        grade1 = scanner.nextFloat();
        System.out.printf("Digite o peso da nota 1: ");
        weightGrade1 = scanner.nextFloat();
        System.out.printf("Digite a nota 2: ");
        grade2 = scanner.nextFloat();
        System.out.printf("Digite o peso da nota 2: ");
        weightGrade2 = scanner.nextFloat();
        System.out.printf("Digite a nota 3: ");
        grade3 = scanner.nextFloat();
        System.out.printf("Digite o peso da nota 3: ");
        weightGrade3 = scanner.nextFloat();

        result = (grade1 * weightGrade1)+(grade2 * weightGrade2)+(grade3 * weightGrade3);
        System.out.printf("A média final é de: " + result);
    }
}
