package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoThreeFourSum {
    public static int[] findTwoSum(int[] arr,int target){
        int[] ans = new int[2];
        ans[0]=ans[1] = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                ans[0] = i;
                ans[1] = map.get(target-arr[i]);
                return ans;
            }
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }
        }
        return ans;
    }
    public static List<List<Integer>> findThreeSum(int[] arr,int K){
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			if(i > 0 && arr[i] == arr[i-1]) continue;
			int j = i+1;
			int k = arr.length-1;
			while(j < k){
				int sum = arr[i]+arr[j]+arr[k];
				if(sum > K){
					k--;
				}
				else if(sum < K){
					j++;
				}
				else{
					ArrayList<Integer> list = new ArrayList<>();
					list.add(arr[i]);
					list.add(arr[j]);
					list.add(arr[k]);
					triplets.add(list);
					j++;
					k--;
					while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k+1]) k--;
				}
			}

		}
		return triplets;
    }
    public static List<List<Integer>> findFourSum(int[] arr,int K){
        List<List<Integer>> quadruplets = new ArrayList<>();
        Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			if(i > 0 && arr[i] == arr[i-1]) continue;
            for(int j=i+1;j<arr.length;j++){
                if(j > 0 && arr[j] == arr[j-1]) continue;
                int k = j+1;
                int l = arr.length-1;
                while(k < l){
                    int sum = arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum > K){
                        l--;
                    }
                    else if(sum < K){
                        k++;
                    }
                    else{
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(arr[l]);
                        quadruplets.add(list);
                        k++;
                        l--;
                        while(k<l && arr[k] == arr[k-1]) k++;
                        while(k<l && arr[l] == arr[l+1]) l--;
                    }
                }
            }
		}
		return quadruplets;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] arr1 = {-26, 32, 4, 17, -16, 18, 1, 8, 6, 8, 3, -13 };
        int[] twoSum = findTwoSum(arr,9);
        System.out.println("Two Sum: ");
        for(int i=0;i<twoSum.length;i++){
            System.out.print(twoSum[i]+" ");
        }
        System.out.println("");
        System.out.println("Three Sum: ");
        List<List<Integer>> threeSum = findThreeSum(arr1,10);
        for(List<Integer> list : threeSum){
            for(int i: list){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
