import java.util.HashMap;
import java.util.Scanner;

public class minOperations {

    public static int min_operations(int []piles){
        HashMap<Integer,Integer>frequencyMap= new HashMap<>();

        int maxfrequencies=0;
        for(int coins:piles){
            frequencyMap.put(coins,frequencyMap.getOrDefault(coins,0)+1);
        }

        for(int frequency:frequencyMap.values()){
            if(frequency>maxfrequencies){
                maxfrequencies=frequency;
            }
        }
        int minOperations=piles.length-maxfrequencies;
        return minOperations;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No.of test cases: ");
        int tests = scanner.nextInt();
        while(tests > 0){
            System.out.print("No of piles: ");
            int n = scanner.nextInt();
            int [] piles = new int[n];
            for (int i = 0; i < n; i++){
                System.out.printf("Coins on pile %d : ",i+1);
                piles[i] = scanner.nextInt();
            }
            System.out.println("result for "+n +"piles" +min_operations(piles));
            tests--;
        }
    }
}
