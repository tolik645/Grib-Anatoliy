package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть суму вашого доходу: ");
        double result = sc.nextDouble();
        if(result > 0 & result < 10001) System.out.printf("Сума вашого податку = %.2f%n", result*0.025);
        if(result > 10000 & result < 25001) System.out.printf("Сума вашого податку = %.2f%n", result*0.043);
        if(result > 25000) System.out.printf("Сума вашого податку = %.2f%n", result*0.067);
    }
}
