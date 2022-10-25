import java.util.Scanner;
import java.lang.Math;

public class heap_sort {
    public static void main(String[] args) {
        
        int[] arr = arrGen();

        heap_sort ob = new heap_sort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
    public void sort(int[] arr) {
        int n = arr.length;
        
        // Построение кучи
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
            printArray(arr);
        }
        
        // Один за другим извлекаем элементы из кучи   
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
            printArray(arr);
        }
    }

    // Преобразование в двоичную кучу поддерева с корневым узлом i
    public void heapify(int arr[], int n, int i){
        int max = i; // Инициализируем наибольший элемент как корень
        int left = 2*i + 1; // левый = 2*i + 1
        int right = 2*i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (left < n && arr[left] > arr[max])
            max = left;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (right < n && arr[right] > arr[max])
            max = right;
        
       // Если самый большой элемент не корень
        if (max != i) {
        
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

          // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, max);
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