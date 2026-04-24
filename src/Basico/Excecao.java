package Basico;

import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite um numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite um numero: ");
        num2 = scanner.nextInt();

        try {
            double divisao = num1 / num2;
            System.out.println(divisao);
        } catch (ArithmeticException exception){
            System.out.println("Não pode dividir por zero!");
        }

        // outra forma, economiza processamento
        if (num1 == 0){
            System.out.println("Não pode dividir por zero!");
        } else {
            System.out.println(num1 / num2);
        }

    }

}
