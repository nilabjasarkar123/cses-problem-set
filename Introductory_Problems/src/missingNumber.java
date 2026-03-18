/*
* https://cses.fi/problemset/task/1083
* */

import java.util.Scanner;

public class missingNumber {
    public long findMissingNumber(long[] arr, long n) {
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        long tatalSum = n * (n + 1) / 2;
        return tatalSum - sum;
    }
    public static void main(String[] args) {
        // from 1 - n number given one is missing find that
        missingNumber m = new missingNumber();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[Math.toIntExact(n)];
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
        long res = m.findMissingNumber(arr, n);
        System.out.println(res);
    }
}
