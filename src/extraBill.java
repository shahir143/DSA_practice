/*
After the decimation, the world went into chaos. People had to rebuild the planet so Shield came up with a donation strategy. They feel all the rich guys need to donate more than the poor guys. So, they make a rule. They would make a donation list in which the donation of each person would be shown. But the rule is that a person can’t pay less than what has already been paid before them. Find the extra amount each person will pay, and also, tell the shield the total amount of donation.
Input
The first line contains n, the total number of people donating. The next line contains n space-separated integers denoting the amount of money paid by the people. The amounts are mentioned in the order in which the people paid
Constraints:-
1 <= n <= 10^5
0 <= money <= 10^5
Output
The first line contains the total amount collected by the teacher at the end.

Example
Sample Input 1:-
10
1 2 3 2 4 3 6 6 7 6 
Sample Output 1:-
43

Explanation:-
0 0 0 1 0 1 0 0 0 1 is the extra amount paid by the people .to make 1 2 3 3 4 4 6 6 7 7

Sample Input 2:
8
1 2 3 4 5 6 7 8

Sample Output 2:
36

Sample Input 3:
5
299 288 277 266 255

Sample Output:
1495}

sol:-

 */
public class minBill {
    public static int checkBills(int[] arr){
        int max=Integer.MIN_VALUE;
        int res=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                res+=arr[i];
            }else{
                res+=max;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] bills= {1, 2, 3, 4, 5, 6, 7, 8};
        //{1,2,3,2,4,3,6,6,7,6 };

        System.out.println(checkBills(bills));
    }
}
