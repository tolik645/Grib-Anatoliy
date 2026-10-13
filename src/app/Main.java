package app;

public class Main {
    public static void main(String[] args){
        String a = "smartphone";
        System.out.println("Product No 1: "+a);
        double sum = 12153.41;
        double sales = sum/5;
        System.out.println("total sales for 5 days is EUR "+sales);
        System.out.printf("sales by day is EUR %.2f!%n", sales);
        a = "laptop";
        System.out.println("Product No 2: "+a);
        sum = 10486.85;
        sales = sum/7;
        System.out.println("total sales for 7 days is EUR "+sales);
        System.out.printf("sales by day is EUR %.2f!%n", sales);

    }
}
