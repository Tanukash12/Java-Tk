package DSA;

import java.util.Stack;

public class RemovingDuplicates {
    public static String removeDuplicates(String s) {
        Stack<Character> q = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(!q.isEmpty() && q.peek() == c){
                q.pop();
            }else{
                q.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for(char ch : q){
            result.append(ch);
        }
       return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
        System.out.println(removeDuplicates("abbaca"));
    }
}
