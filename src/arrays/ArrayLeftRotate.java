package arrays;

public class ArrayLeftRotate {
    public static int[] leftRotate(int[] arr, int k){
        int n = arr.length;
        //Solution 1: using remainder by dividing k with array length SC: O(N),TC:O(N)
        k = k%n;
        /* int[] rotated = new int[n];
        for(int i =0;i<n;i++){
            rotated[(i+k)%n] = arr[i];
        }
        return rotated; */
        //Solution 2: using reverse operation to omit extra space SC: O(1),TC:O(N)
        reverse(arr, 0, n-1); //reverse all the elements
        reverse(arr, 0, k-1); //reverse first k elements
        reverse(arr, k, n-1);   //reverse remaining n-k elements
        return arr;
    }
    public static int[] rightRotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;

        reverse(arr, 0, k-1); //reverse first k elements
        reverse(arr, k, n-1);   //reverse remaining n-k elements
        reverse(arr, 0, n-1); //reverse all the elements
        return arr;
    }
    public static void reverse(int[] arr, int left, int right){
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 5, 10, 7, 6, 6, 1, 7 };
        int[] rotatedArray = rightRotate(arr,1);
        for(int i=0;i<arr.length;i++){
            System.out.print(rotatedArray[i]+" ");
        }
    }
}
