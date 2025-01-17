package arrays;

public class Sorting {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(arr[i] != arr[min]) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }  
    }
    public static void bubbleSort(int[] arr) {
        int n =arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void mergeSort(int[] arr) {
        
    }
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 2, 8};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
