package DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SplitStringVowelCount {
    public static boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList(
            new Character[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}));
        int n = s.length()/2;
        int countA = 0;
        int countB = 0;
        for(int i = 0; i < s.length() ; i++){
            if(set.contains(s.charAt(i))){
                if( i < n ) countA++;
                if( i >= n ) countB++;
            }
        }
        if(countA == countB){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
    }
}
