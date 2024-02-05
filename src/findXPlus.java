import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class findXPlus {

    public static int[] findXPlusY(int[] arr) {
        int[] result = new int[arr.length];

        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> rightStack = new Stack<>();

        Arrays.fill(result, -1);

        for (int i = 0; i < arr.length; i++) {
            while (!leftStack.isEmpty() && arr[leftStack.peek()] <= arr[i]) {
                leftStack.pop();
            }
            if (!leftStack.isEmpty()) {
                result[i] = leftStack.peek();
            }
            leftStack.push(i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!rightStack.isEmpty() && arr[rightStack.peek()] <= arr[i]) {
                rightStack.pop();
            }
            if (!rightStack.isEmpty()) {
                if (result[i] == -1 || arr[result[i]] > arr[rightStack.peek()]) {
                    result[i] = rightStack.peek();
                }
            }
            rightStack.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (result[i] != -1) {
                result[i] = arr[result[i]] + arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = findXPlusY(arr);
        for (int i = 0; i < n; i++) {
            System.out.println("result "+result[i]);
        }
    }
}
