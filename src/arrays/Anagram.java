package arrays;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length())  return false;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "car";
        if(isAnagram(str1,str2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
