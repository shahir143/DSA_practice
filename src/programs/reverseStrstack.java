package programs;

import java.util.Stack;

public class reverseStrstack {
    public static String reverseString(String s){
        Stack<Character> stk=new Stack<>();
        int i =0;
        while(i<s.length()){
            stk.push(s.charAt(i));
            i++;
        }
        StringBuilder stb=new StringBuilder();
        while (!stk.isEmpty()) {
            stb.append(stk.pop());
        }
        return stb.toString();
    }
    public static void main(String[] args) {
        String s="abc";
            System.out.println(reverseString(s));
     }

}
