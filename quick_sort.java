public class quick_sort {
    
    public static void main(String[] args) {
        arrGen arr = new arrGen();
        
        printArray(arr.getArray());

        QuickSortAlgorithm sort = new QuickSortAlgorithm(arr.getArray());
        sort.QuickSort(arr.getArray(), 0, arr.getArray().length - 1);
    }
    
    //Печать массива
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println();
    }
}

class arrGen {
    int[] array;

    public arrGen(){
        int [] array = {3, 5, 2, 12, 1, 0, 3, 4, 9};
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }
    
}

class QuickSortAlgorithm {
    int[] array;

    public QuickSortAlgorithm(int[] array){
        this.array = array;
    }
    // определение индекса опорного элемента
    static int GetPivotIndex(int[] array, int minIndex, int maxIndex){
            int pivotIndex = minIndex - 1;

            for (int i = minIndex; i <= maxIndex; i++){
                if (array[i] < array[maxIndex]){
                    pivotIndex++;
                    
                    int temp = array[i];
                    array[i] = array[pivotIndex];
                    array[pivotIndex] = temp;
                }
            }

            pivotIndex++;
            
            int temp = array[pivotIndex];
            array[pivotIndex] = array[maxIndex];
            array[maxIndex] = temp;
            
            return pivotIndex;
        }

    public void QuickSort(int[] array, int minIndex, int maxIndex){
        quick_sort.printArray(array);// for test only

        if (minIndex >= maxIndex) return; // условие выхода
        int pivot = GetPivotIndex(array, minIndex, maxIndex);
        QuickSort(array, minIndex, pivot - 1); // сортировка левой части
        QuickSort(array, pivot + 1, maxIndex); // сортировка правой части
        return;
    }
}