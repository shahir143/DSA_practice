import java.util.Scanner;

public class cakeCut {
    public static int minCut(int friends){
        int minCut;
        int totalPieces=friends+1;
        if(totalPieces%2==0){
            minCut= totalPieces/2;
        }else{
            minCut=friends;
        }
        return minCut;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Invited Friends: ");
        int friends = scanner.nextInt();
        System.out.println(minCut(friends));
    }
}
