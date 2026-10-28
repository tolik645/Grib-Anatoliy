import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void insertionsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArr = new int[]{1, 32, 54, 3, 84, 73, 27, 43, 61, 99, 10, 16, 81, 37, 28};
        System.out.println(Arrays.toString(intArr));
        insertionsort(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println("Введіть число з масиву ");
        int target = scan.nextInt();
        int result = binarySearch(intArr, target);
        System.out.println("Індекс вашого числа "+result);
        }
    }