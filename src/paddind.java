import java.util.Scanner;

public class paddind {

    public static long calculatePaddingZeros(int n,int p){
        int  padding= (n+(2*p));//5 +2*5 =15
        int zeros=(padding*padding)-(n*n);//15*15-5*5
        return zeros;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Size of the image (N x N)//5
        int p = scanner.nextInt(); // Number of padding layers//5

        long zeros = calculatePaddingZeros(N, p);
        System.out.println(zeros);
    }
}
