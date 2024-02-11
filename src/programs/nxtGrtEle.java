package programs;

import java.util.Arrays;
import java.util.Stack;

public class nxtGrtEle {
    public static int[] nextGreaterElement(int[] nums){
        int n=nums.length;
        int res[]=new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stack=new Stack<Integer>();

        for(int i=0;i<2*n;i++){
            while(!stack.isEmpty() && nums[i%n]>nums[stack.peek()]){
                res[stack.pop()]=nums[i%n];
            }
            if(i<n){
                stack.push(i);
            }
        }
        return res;
    }
    public static void main(String []args){
        int arr[] = {1,8,4,3,5,7,2};
        int[] newarr=nextGreaterElement(arr);
        for(int i:newarr){
        System.out.print(i+ " ");
    }
}
}
