import java.util.*;

public class ArrayExample {

    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        int[] result = sortByFrequency(arr);
        System.out.println("Array sorted by frequency: " + Arrays.toString(result));
    }

    public static int[] sortByFrequency(int[] arr) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            if(frequencyMap.containsKey(num))
                frequencyMap.put(num, frequencyMap.get(num)+ 1);
            else
                frequencyMap.put(num, 1);
        }

        // Step 2: Create a list from elements of the array
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Step 3: Sort the list by frequency
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
                int valueCompare = a.compareTo(b);
                if (freqCompare == 0) {
                    return valueCompare; 
                } else {
                    return freqCompare; 
                }
            }
        });

        // Step 4: Convert the list back to an array
        int[] result = new int[arr.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
