import java.util.Scanner;

public class permutations {
    public int[] permutation(int n){
        if(n == 1) return new int[]{1};
        if(n == 2 || n == 3) return new int[0];
        int[] res = new int[n];
        int j = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                res[j++] = i;
            }
        }
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                res[j++] = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        permutations p = new permutations();
        int[] res = p.permutation(n);
        if(res.length == 0) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < res.length; i++){
                sb.append(res[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

    }
}
