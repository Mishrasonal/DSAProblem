package arrays;

public class LargestElement {

    public static int findLargestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findSecondLargestElement(int[] arr){
        int max = findLargestElement(arr);
        int secondMax = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {17,8,1,3,9};
        System.out.println("Largest Element: "+findLargestElement(arr));
        System.out.println("Second Largest Element: "+findSecondLargestElement(arr));
    }
}
