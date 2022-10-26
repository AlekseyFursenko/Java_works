import java.util.Scanner;
import java.lang.Math;

public class insert_sort {
    public static void main(String[] args) {
        
        int[] arr = arrGen();

        insert_sort ob = new insert_sort();
        ob.insertionSort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
    public void insertionSort(int[] arr) {
        int n = arr.length;

        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--; 
            }
            arr[i+1] = key;
        printArray(arr);
        }       
    }
        //Печать массива
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        
        System.out.println();
    }
    
    // Генератор массива
    static int[] arrGen() {
        String title = "Input number of elements in the array: ";
        int n = input(title);
        title = "Input min value of elements in the array: ";
        int min_value = input(title);
        title = "Input max value of elements in the array: ";
        int max_value = input(title);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++ ) {
            arr[i] = (int)(Math.random()*(max_value - min_value + 1) + min_value); 
        }

        System.out.println("Initial array");
        printArray(arr);
        System.out.println();

        return arr;
    }

    static int input(String title) {
        Scanner in = new Scanner(System.in);
        System.out.print(title);
        int num = in.nextInt();
        
        return num;
    }
}
