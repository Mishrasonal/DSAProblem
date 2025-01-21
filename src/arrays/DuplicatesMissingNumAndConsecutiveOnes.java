package arrays;
import java.util.*;

public class DuplicatesMissingNumAndConsecutiveOnes {
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
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2; 
        int s2 = 0;
        for (int i = 0; i < n; i++) {
            s2 += nums[i];
        }
    return (sum-s2);
    }
    public static int consecutiveOnes(int n, int[] arr) {
		int count =0;
		int maxCount = 0;
		for(int i=0;i<n;i++){
			if(arr[i] == 1){
				count++;
				maxCount = Math.max(count, maxCount);
			}
			else{
				count =0;
			}
		}
		return maxCount;
	}
    public static void main(String[] args) {
        int[] arr = {1,0,3};
        int[] arr1 = {0, 1, 1, 0, 0, 1, 1, 1};
        System.out.println(containsDuplicate(arr));
        System.out.println(missingNumber(arr));
        System.out.println(consecutiveOnes(arr1.length, arr1));
    }
}

