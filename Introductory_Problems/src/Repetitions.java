/*https://cses.fi/problemset/task/1069
*You are given a DNA sequence: a string consisting of characters A, C, G, and T. Y
* our task is to find the longest repetition in the sequence.
* This is a maximum-length substring containing only one type of character.
Input
The only input line contains a string of n characters.
Output
Print one integer: the length of the longest repetition.
Constraints

1 \le n \le 10^6

Example
Input:
ATTCGGGA

Output:
3
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Repetitions {
    public int repetationSoution(String s) {
        if(s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), map.getOrDefault(s.charAt(0), 0) + 1);

        int res = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1))map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            else map.put(s.charAt(i), 1);

            if(map.getOrDefault(s.charAt(i), 0) > res){
                res = map.getOrDefault(s.charAt(i), 0);
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Repetitions r = new Repetitions();
        int res = r.repetationSoution(s);
        System.out.println(res);
    }
}
