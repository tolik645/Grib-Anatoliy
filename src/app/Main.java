package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Сума вашого доходу: ");
        double res = sc.nextDouble();
        if(res > 0 & res <= 10000){
            System.out.printf("Сума вашого податку: %.2f%n", res * 0.025);
        }
        else if(res > 10000 & res <= 25000){
            System.out.printf("Сума вашого податку: %.2f%n", res * 0.043);
        }
        else if(res > 25000){
            System.out.printf("Сума вашого податку: %.2f%n", res * 0.067);
        }
        else System.out.println("Хибне значення");
    }
}
