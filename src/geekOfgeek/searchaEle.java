package geekOfgeek;

/*
 * Given an integer array and another integer element. The task is to find if the given element is present in array or not.
 * Input:
    n = 4
    arr[] = {1,2,3,4}
    x = 3
    Output: 2
    Explanation: There is one test case with array as {1, 2, 3 4} and element to be searched as 3.  Since 3 is present at index 2, output is 2.
 */
public class searchaEle {

    public static int checkEle(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int arr[] = {1,2,3,4};
        int x = 3;
        System.out.println(checkEle(arr,x));
    }
}
