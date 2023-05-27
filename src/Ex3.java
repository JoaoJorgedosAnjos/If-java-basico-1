/*import java.util.Scanner;

public class Ex3 {
    public static void main(String []args){
        double grade1, grade2, grade3, result;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Média de notas \nDigite a primeira nota: ");
        grade1 = scanner.nextDouble();
        while (grade1 <0){
            System.out.println("Nota não pode ser menor que 0\nDigite a primeira nota: ");
            grade1 = scanner.nextDouble();
        }
        System.out.printf("Digite a segunda nota: ");
        grade2 = scanner.nextDouble();
        while (grade2 < 0){
            System.out.println("Nota não pode ser menor que 0\nDigite a segunda nota: ");
            grade2 = scanner.nextDouble();
        }
        System.out.printf("Digite a terceira nota: ");
        grade3 = scanner.nextDouble();
        while (grade3 < 0){
            System.out.println("Nota não pode ser menor que 0\nDigite a terceira nota: ");
            grade3 = scanner.nextDouble();
        }
        result = (grade1 + grade2 + grade3)/ 3;
        System.out.println("A média é: " + result);
    }
}*/

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade1 = getValidGrade(scanner, "Digite a primeira nota: ");
        double grade2 = getValidGrade(scanner, "Digite a segunda nota: ");
        double grade3 = getValidGrade(scanner, "Digite a terceira nota: ");

        double result = (grade1 + grade2 + grade3) / 3;
        System.out.println("A média é: " + result);
    }
    private static double getValidGrade(Scanner scanner, String message) {
        double grade;
        do {
            System.out.print(message);
            grade = scanner.nextDouble();
            if (grade < 0) {
                System.out.println("Nota não pode ser menor que 0");
            }
        } while (grade < 0);
        return grade;
    }
}

