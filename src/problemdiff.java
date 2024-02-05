import java.util.HashSet;
import java.util.Scanner;

public class problemdiff {
    public static int max_sets(int[] arr){
        int count=0;
        HashSet<Integer> hashMap=new HashSet<>();
        for(int ele:arr){
            hashMap.add(ele);
        }
        if(hashMap.size()%2==0){
             count=hashMap.size()/2;
        }else{
            count=hashMap.size()-1/2;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No. of test cases: ");
        int testCases = scanner.nextInt();
        while(testCases > 0){
            int n = 4;
            int [] arr = new int[n];
            for(int i = 0; i < n; i++){
                System.out.print("Problem Difficulty: ");
                arr[i] = scanner.nextInt();
            }
            System.out.println(max_sets(arr));
            testCases--;
        }
    }
}
