import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArr = new int[] {10, 20, 30, 40, 50};
        int sumOfElements = getArraySum(intArr);
        System.out.print("Введіть ціле число: ");
        int num = scan.nextInt();
        System.out.println(square(num));
        Scanner input = new Scanner(System.in);
        System.out.println(cylinder(3, 6));
        System.out.println("Масив чисел: "+sumOfElements);
        System.out.print("Введіть рядок: ");
        String line = input.nextLine();
        System.out.println("Рядок в зворотньому порядку: "+reverseString(line));
        System.out.print("Введіть a: ");
        int a = input.nextInt();
        System.out.print("Введіть b: ");
        int b = input.nextInt();
        System.out.println("Результат "+a+"^"+b+" дорівнює "+power(a, b));
        System.out.print("Введіть ціле число n: ");
        int c = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введіть текстовий рядок: ");
        String d = input1.nextLine();
        printText(c, d);
    }
    public static String square(int num){
        int res = num * num;
        return "Квадрат числа "+num+" дорівнює "+res;
    }
    public static String cylinder(double radius, double height){
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return "Об'єм циліндра з радіусом "+radius+" і висотою "+height+" дорівнює "+volume;
    }
    public static int getArraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static String reverseString(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }
    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
    public static void printText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

}