import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів в масиві: ");
        int n = scanner.nextInt();

        double[] масив = new double[n];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            масив[i] = scanner.nextDouble();
        }

        System.out.print("Введіть задане число: ");
        double поріг = scanner.nextDouble();

        ArrayList<Double> відфільтрованийМасив = new ArrayList<>();
        for (double елемент : масив) {
            if (елемент <= поріг) {
                відфільтрованийМасив.add(елемент);
            }
        }

        System.out.println("Відфільтрований масив:");
        for (double елемент : відфільтрованийМасив) {
            System.out.print(елемент + " ");
        }
    }
}
