import java.util.Scanner;

public class Ex4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        float productPrice, discount10, productDiscount;

        System.out.printf("Digite o valor do produto: ");
        productPrice =scanner.nextFloat();
        discount10 = (productPrice * 10) / 100 ;
        productDiscount = productPrice - discount10;

        System.out.println("O valor do produto com disconto de 10% é: " + productDiscount);
    }
}
