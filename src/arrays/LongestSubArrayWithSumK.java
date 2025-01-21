package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static int longestSubArray(int[] arr, int K){
        int maxLength = 0;
        int N = arr.length; 
		int sum =0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        for(int i=0;i<N;i++){
            sum += arr[i];
            if(map.containsKey(sum-K)){
                if(i-map.get(sum-K) > maxLength){
                    maxLength = i-map.get(sum-K);
                }
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        System.out.println("Longest Subarray Length: "+longestSubArray(arr,3));
    }
}
