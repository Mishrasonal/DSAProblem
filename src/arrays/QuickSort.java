package arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pIndex = partitionIndex(arr,low,high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
    }
    public static int partitionIndex(int[] arr, int low, int high){
        int pivot = arr[low];
        int i =low, j= high;
        while(i < j){
            while(arr[i] <= pivot && i<= high - 1){
                i++;
            }
            while(arr[j] > pivot && j>= low + 1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {17,8,1,3,5};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
