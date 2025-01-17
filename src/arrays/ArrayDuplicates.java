package arrays;
import java.util.*;

public class ArrayDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i< nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
}

