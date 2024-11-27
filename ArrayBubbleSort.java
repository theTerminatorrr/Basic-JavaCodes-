import java.util.Arrays;
import java.util.Scanner;

public class ArrayBubbleSort {
    public ArrayBubbleSort() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        System.out.print("Enter the elements of the array (separated by spaces): ");

        int i;
        for(i = 0; i < arraySize; ++i) {
            array[i] = sc.nextInt();
        }

        for(i = 0; i < array.length - 1; ++i) {
            for(int j = 0; j < array.length - i - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(array));
    }
}
