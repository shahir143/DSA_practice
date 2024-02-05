public class determinewinner {
    public static String determine_winner(int[] a){
        int n=a.length;

        int smallestnonzeroindex=-1;
        for(int i=0; i<n; i++){
            if(a[i]!=0 && (smallestnonzeroindex== -1 || a[i]<a[smallestnonzeroindex])){
                smallestnonzeroindex=i;
            }
        }

        // If there is no non-zero element, Olivia loses as there are no valid moves.
        if(smallestnonzeroindex==-1){
            return "Second";
        }

        // Count the number of non-zero elements in the array
        int nonZeroCount=0;
        for(int j:a){
            if(j!=0){
                nonZeroCount++;
            }
        }

        // If the number of non-zero elements is even, Olivia loses if she moves first.
        // If the number of non-zero elements is odd, Olivia wins if she moves first.
        if (nonZeroCount%2==0){
            return "Second";
        }else{
            return "First";
        }
    }
    public static void main(String[] args){
        int[] arr={2,5,8,1};
        System.out.println(determine_winner(arr));
    }
}
