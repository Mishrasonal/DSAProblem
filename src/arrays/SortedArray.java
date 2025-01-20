package arrays;

public class SortedArray {
    public static int isSorted(int[] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return 0;
            }
        }
        return 1;
    }
    public static void removeDuplicates(int[] arr){
        
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,5,7,9};
        if(isSorted(arr) == 1){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is unsorted");
        }
    }
}
