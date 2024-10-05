import java.util.*;
import java.util.Random;

public class bubblesort {
    static void bubble_sort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int size = 1000;
        long start, end;
        double c;

        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = random.nextInt(1000);
        }
        start = System.nanoTime();

        int n = a.length;
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        bubble_sort(a, n);
        end = System.nanoTime();

        c = (double) (end - start);
        System.out.println("Bubble sort");
        System.out.println("Time:" + c);
        System.out.println("Sorted data");

    }
}
