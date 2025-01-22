package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortedArrayAndDuplicateRemoval {
    public static int isSorted(int[] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return 0;
            }
        }
        return 1;
    }
    public static int removeDuplicates(int[] arr){
        int i =0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static List<Integer> findUnion(int[] arr1, int[] arr2){
        //Tree set stores nums in ascending order
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int[] arr1 = {2,4,5,6,9,10};
        if(isSorted(arr) == 1){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is unsorted");
        } 
        int uniqueElemLength = removeDuplicates(arr);
        for(int k=0;k<uniqueElemLength;k++){
            System.out.print(arr[k]+" ");
        } 
        List<Integer> list = findUnion(arr, arr1);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
