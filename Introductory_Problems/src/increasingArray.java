/*
* https://cses.fi/problemset/task/1094
*
* You are given an array of n integers. You want to modify the array so that it is increasing, i.e.,
* every element is at least as large as the previous element.
On each move, you may increase the value of any element by one. What is the minimum number of moves required?
Input
The first input line contains an integer n: the size of the array.
Then, the second line contains n integers x_1,x_2,\ldots,x_n: the contents of the array.
Output
Print the minimum number of moves.
Constraints

1 \le n \le 2 \cdot 10^5
1 \le x_i \le 10^9

Example
Input:
5
3 2 5 1 7

Output:
5
* */

import java.util.Scanner;

public class increasingArray {
    public long minimumMoves(int[] nums, int n) {
        long res = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i-1]){
                res += nums[i-1] - nums[i];
                nums[i] = nums[i-1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        increasingArray obj = new increasingArray();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long res = obj.minimumMoves(arr, n);
        System.out.println(res);
    }
}
