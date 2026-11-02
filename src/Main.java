import java.util.Random;
class Main{
    public static void main(String[] args) {
        int[][] intArr = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < intArr.length; i++){
            for (int f = 0; f < intArr[i].length; f++){
                intArr[i][f] = random.nextInt(50)+1;
            }
        }
        System.out.println("Матриця 4х4:");
        for (int i = 0; i < intArr.length; i++){
            for (int f = 0; f < intArr[i].length; f++){
                System.out.print(intArr[i][f]+"\t");
            }
            System.out.println();
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < intArr.length; i++){
            for (int f = 0; f < intArr[i].length; f++){
                if (i % 2 == 0){
                    a += intArr[i][f];
                } else {
                    b += intArr[i][f];
                }
            }
        }
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): "+ a);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): "+ b);
        long c = 1;
        long d = 1;
        for (int i = 0; i < intArr.length; i++){
            for (int f = 0; f < intArr[i].length; f++){
                if (f % 2 == 0){
                    c *= intArr[i][f];
                } else {
                    d *= intArr[i][f];
                }
            }
        }
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): "+ c);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): "+ d);
        if (isMagicSquare(intArr)) {
            System.out.println("Матриця є магічним квадратом!");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
    public static boolean isMagicSquare(int[][] matrix) {
        int n = matrix.length;

        // 1. Еталонна сума (беремо суму першого рядка)
        int targetSum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            targetSum += matrix[0][j];
        }

        // 2. Перевіряємо суми всіх рядків
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != targetSum) return false;
        }

        // 3. Перевіряємо суми всіх стовпців
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != targetSum) return false;
        }

        // 4. Перевіряємо головну діагональ (зліва направо)
        int mainDiagSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagSum += matrix[i][i];
        }
        if (mainDiagSum != targetSum) return false;

        // 5. Перевіряємо побічну діагональ (справа наліво)
        int sideDiagSum = 0;
        for (int i = 0; i < n; i++) {
            sideDiagSum += matrix[i][n - 1 - i];
        }
        if (sideDiagSum != targetSum) return false;

        // Якщо всі перевірки пройшли успішно
        return true;
    }
}