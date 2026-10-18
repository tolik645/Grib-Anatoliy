package app;

public class Main {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        for (num = 1; num <= 6; num++){
            sum = num + sum;
            System.out.println(num+") Num is "+num+", sum is "+sum);
        }
    }
}
