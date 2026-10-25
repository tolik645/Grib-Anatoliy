public class Main {
    public static void main(String[] args) {
        int[] numbers = {24, -36, -12, 23, 78, 32, 48, 9, 10, -12, 1, 52, 69, -43, 0, -90, 30, 7, 35, 91};
        int NegativeValues = 0;
        for (int num : numbers) {
            if (num < 0) {
                NegativeValues += num;
            }
        }
        System.out.println("Сума від'ємних чисел = " + NegativeValues);
        int a = 0;
        int b = 0;
        for (int num : numbers) {
            if ((num % 2) == 0) {
                a++;
            }
        }
        for (int num : numbers) {
            if ((num % 2) != 0) {
                b++;
            }
        }
        System.out.println("Кількість парних чисел = " + a);
        System.out.println("Кількість непарних чисел = " + b);
        int c = numbers[0];
        int d = numbers[0];
        for (int num : numbers) {
            if (num < c) {
                c = num;
            }
        }
        System.out.println("Найменше число масиву = " + c);
        for (int num : numbers) {
            if (num > d) {
                d = num;
            }
        }
        System.out.println("Найбільше число масиву = " + d);
        int NegativeValue = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                NegativeValue = i;
                break;
            }
        }
        if (NegativeValue == -1) {
            System.out.println("Від'ємних чисел у масиві немає.");
        } else if (NegativeValue == numbers.length - 1) {
            System.out.println("Від'ємне число є останнім у масиві, після нього немає елементів.");
        } else {
            double e = 0;
            double f = 0;
            for (int i = NegativeValue + 1; i < numbers.length; i++) {
                e += numbers[i];
                f++;
            }
            double average = e / f;
            System.out.println("Середнє арифметичне після першого від'ємного елемента = " + average);
        }
    }
}